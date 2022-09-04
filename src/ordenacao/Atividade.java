
//CRIAR UM VETOR DE 10 POSISCOES QUE VAI RECEBER NUMEROS DE 10 A 20 SEM REPETIR

package ordenacao;

import java.util.Random;

public class Atividade {

    public static void main(String[] args) {

        int vetor[] = new int[10];
        int qto = 0;
        int min = 10, max = 20;

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {

            boolean found = true;
            int temp = 0;
            
            while(found){

                found = false;

                temp = rand.nextInt(max - min )+ min;

                for (int j = 0; j < qto; j++) {

                    if(temp == vetor[j]){
                        found = true;
                    }
                }
            }

            vetor[i] = temp;
            qto++;
            System.out.println(vetor[i]);
        }
    }   
}
