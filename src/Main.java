import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void menu(){
        System.out.println("0. Lista telefonica");
        System.out.println("1. Cadastrar");
        System.out.println("2. Buscar");
        System.out.println("3. Sair");
        System.out.print("Opcao: ");
    }

    public static void main(String[] args) {
        int opcao;
        String nome, busca, numero;
        Hashtable<String, String> lista = new Hashtable<String, String>();
        Scanner sc = new Scanner(System.in);

        do {
            menu();
            opcao = sc.nextInt();
            switch(opcao){
                case 0:
                    System.out.println("Nome   |   Numero");
                    for(Map.Entry<String, String> list : lista.entrySet()) {
                        System.out.println(list.getKey() + " | " + list.getValue());
                    }
                    break;

                case 1:
                    System.out.println("===Cadastro===");
                    System.out.print("Nome: ");
                    nome = sc.next();
                    System.out.print("Numero: ");
                    numero = sc.next();
                    lista.put(nome, numero);
                    break;

                case 2:
                    System.out.println("===Busca===");
                    System.out.print("Nome: ");
                    nome = sc.next();

                    if(lista.get(nome) == null){
                        System.out.println("Nome nao encontrado!");
                    } else{
                        System.out.println("Numero: " + lista.get(nome));
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("ERRO! Opção invalida");
            }
        } while (opcao != 3);
    }
}
