package ex_robo;

public class Robo {
    
    private char direcao;
    private int pos_x;
    private int pos_y;
    private int ant_x;
    private int ant_y;
    private int qnt_casas;

//METODO DE MOVIMENTACAO
    public Robo moverRobo(char direcao, int qnt_casas){

        switch(direcao){
            case 'w':
                this.pos_y = this.pos_y + qnt_casas;
            break;

            case 's':
                this.pos_y = this.pos_y - qnt_casas;
            break;

            case 'd':
                this.pos_x = this.pos_x + qnt_casas;
            break;

            case 'a':
                this.pos_x = this.pos_x - qnt_casas;
            break;

            default:
                System.out.println("Direcao invalida !!");
            break;
        }
        return null;
    }

//METODO DE GRAVAR POSICAO ANTERIOR
    public Robo gravarPosicao(){

        ant_x = this.pos_x;
        ant_y = this.pos_y;

        System.out.println("\nPosicao anterior do robo:\n\tLinha: " + ant_x + "\tColuna: " + ant_y);

        return null;
    }

//CONSTRUTOR
    public Robo(int pos_x, int pos_y){
        this.pos_x = 0;
        this.pos_y = 0;
        this.ant_x = 0;
        this.ant_y = 0;
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

    public int getAnt_x() {
        return this.ant_x;
    }

    public void setAnt_x(int ant_x) {
        this.ant_x = ant_x;
    }

    public int getAnt_y() {
        return this.ant_y;
    }

    public void setAnt_y(int ant_y) {
        this.ant_y = ant_y;
    }
}
