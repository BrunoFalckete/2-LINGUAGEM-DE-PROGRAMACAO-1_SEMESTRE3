package ordenacao;

import java.util.Random;
import java.util.Scanner;

public class InitOrdenacao {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //Fazer leitura pelo teclado

        int vetor[] = new int[5];

        int vetor2[] = {1,2,3,4,5};

        int matriz[][] = new int[3][3];

        vetor[0] = 30;
        vetor2[0] = 10;
        matriz[0][0] = 1;



        for(int i=0; i < 5; i++) {

            System.out.println(vetor[i]);
        }

        //---------------------------------------------------------------------------------

        /*for(int i=0; i < 5; i++) {

            System.out.println("Digite o #" + i + " numero");
            vetor[i] = in.nextInt();//ler um numero e armazena no vetor na posicao i
        }*/

        //---------------------------------------------------------------------------------
        
        //int num = (int) Math.random(); //casting de dados
        
        int min = 2, max = 10;
        Random rand = new Random();
        System.out.println(rand.nextInt(max - min )+ min);

        for (int i = 0; i < 5; i++){

            vetor[i] = rand.nextInt(max - min )+ min;
            vetor2[i] = rand.nextInt(max - min )+ min;

            System.out.println("Posicao #" + (i + 1) + " vetor1 " + " numero: " + vetor[i]);
            System.out.println("Posicao #" + (i + 1) + " vetor2 " + " numero: " + vetor2[i]);
        }

        System.out.println("\n");

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                
                matriz[i][j] = rand.nextInt(max - min )+ min;

                System.out.println("Posicao #" + (i + 1) + " coluna #" + (j + 1) + " numero: " + matriz[i][j]);
            }
        }
    }
}
