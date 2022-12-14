package lp.ordenacao;

import java.util.Random;

public class Desafio1 {

  public static void main(String[] args) {
    int max = 20, min = 10;
    int vetor[] = new int[10];
    Random rand = new Random();
    int qto = 0;
    for (int i = 0; i < 10; i++) {
      boolean found = true;
      int temp = 0;
      while (found) {
        found = false;
        temp = rand.nextInt(max - min) + min;
        for (int j = 0; j < qto; j++) {
          if (temp == vetor[j]) {
            found = true;
          }
        }
      }
      vetor[i] = temp;
      System.out.println(temp + " ");
      qto++;
    }
  }
}
