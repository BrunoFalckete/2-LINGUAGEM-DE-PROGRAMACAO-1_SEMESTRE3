import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Conexao.createConnection();
        Arvore arvore = new Arvore();

        int opcao = 0;
        do {
            Scanner opcao = new Scanner(System.in);
            Scanner entrada = new Scanner(System.in);

            System.out.println(" 1 - Inserir dados");
            System.out.println(" 2 - Imprimir arvore");
            System.out.println(" 0 - Sair");
            System.out.println("\n");
            System.out.print("opcao: ");
            opcao = opcao.nextInt();

            switch (opcao){

                case 0:
                    System.out.println("FIM!");
                break;

                case 1:
                    System.out.println("\nInforme os numeros e digite 0 para sair: ");
                    int numero;
                    do {
                        System.out.print("Numero: ");
                        numero = entrada.nextInt();
                        if (numero != 0) {
                            arvore.insert(numero, arvore.root);
                        }
                    } while (numero != 0);
                break;

                case 2:
                    System.out.print("\nArvoreBinaria:");
                    System.out.println("\n Pre-ordem::");
                    arvore.pre(arvore.root);

                    System.out.println("\n In-ordem:");
                    arvore.in(arvore.root);

                    System.out.println("\n Pos-ordem:");
                    arvore.pos(arvore.root);
                break;

                default:
                    System.out.println("Erro, Opcao invalida");
                break;
            }

        } while (opcao != 0);
    }
}
