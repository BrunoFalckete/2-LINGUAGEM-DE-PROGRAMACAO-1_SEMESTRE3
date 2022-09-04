package ex_robo;

public class robo {

    private char direcao;
    private int pos_x;
    private int pos_y;
    private int qnt_casas;

//METODO DE MOVIMENTACAO
    public Robo moverRobo(char direcao, int qnt_casas){

        switch(direcao){
            case 'w':
                pos_y = pos_y + qnt_casas;
            break;

            case 's':
                pos_y = pos_y - qnt_casas;
            break;

            case 'd':
                pos_x = pos_x + qnt_casas;
            break;

            case 'a':
                pos_x = pos_x - qnt_casas;
            break;

            default:
                System.out.println("Direcao invalida !!");
            break;
        }
        return null;
    }

//CONSTRUTOR
    public Robo(int pos_x, int pos_y){
        this.pos_x = 0;
        this.pos_y = 0;
    }

// GETTERS E SETTERS
    public char getDirecao() {
        return this.direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }

    public int getPos_x() {
        return this.pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public int getPos_y() {
        return this.pos_y;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    public int getQnt_casas() {
        return this.qnt_casas;
    }

    public void setQnt_casas(int qnt_casas) {
        this.qnt_casas = qnt_casas;
    }
}
