package ex_robo;

import java.util.Scanner;

public class App {

    public static void main(String[] args){

        int termino = 1;
        Robo robo = new Robo(0, 0);

        System.out.println("-------------------------------------------------");
        System.out.println("Posicao inicial:\n\tLinha: " + robo.getPos_x() + "\tColuna: " + robo.getPos_y());
        System.out.println("-------------------------------------------------");
        System.out.println("Para mover o robo, siga as seguintes coordenadas:\n\tw - mover para cima\n\ts - mover para baixo\n\td - mover para direita\n\ta - mover para esquerda");
        System.out.println("-------------------------------------------------");

        while (termino == 1){
            Scanner in = new Scanner(System.in);

            System.out.print("Digite a direcao para a qual deseja mover o robo: ");
            robo.setDirecao(in.next().charAt(0));

            System.out.print("Digite quantas casas voce deseja movimentar: ");
            robo.setQnt_casas(in.nextInt());

            robo.moverRobo(robo.getDirecao(), robo.getQnt_casas());

            System.out.println("-------------------------------------------------");
            System.out.println("\nPosicao atual do robo:\n\tLinha: " + robo.getPos_x() + "\tColuna: " + robo.getPos_y());
            System.out.println("-------------------------------------------------");;
            System.out.println("\tw - mover para cima\n\ts - mover para baixo\n\td - mover para direita\n\ta - mover para esquerda\n");
            System.out.println("-------------------------------------------------");
            System.out.println("Deseja continuar ?\n\t 1 - Sim \t 2 - Nao");
            termino = in.nextInt();
            System.out.println("-------------------------------------------------");
        }
    } 
}
