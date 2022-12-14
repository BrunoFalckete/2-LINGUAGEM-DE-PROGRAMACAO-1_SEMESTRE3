import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class Arvore {
    No root = null;
    private Connection conn = null;

    void insert(int valor, No no) {
        if (no == null) {
            root = new No(valor);
            inserirbd(valor);
        }

        else if (valor < no.valor) {
            if (no.esquerda == null) {
                no.esquerda = new No(valor);
                inserirbd(valor);
            } else {
                insert(valor, no.esquerda);
            }
        }

        else if (valor > no.valor) {
            if (no.direita == null) {
                no.direita = new No(valor);
                inserirbd(valor);
            } else {
                insert(valor, no.direita);
            }
        }

        else if (valor == no.valor) {
            System.out.println("Numero repetido");
        }

    }

    public void inserirbd(int valor) {
        this.conn = Conexao.createConnection();
        String noSQL = "INSERT INTO bd (node) VALUES (?)";
        try {
            PreparedStatement ps = conn.prepareStatement(noSQL);
            ps.setInt(1, valor);

            ps.executeUpdate();

            System.out.println("Valor inserido");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    void pre(No no) {
        System.out.print(" " + no.valor);
        if (no.esquerda != null) {
            pre(no.esquerda);
        }
        if (no.direita != null) {
            pre(no.direita);
        }
    }

    void in(No no) {
        if (no.esquerda != null) {
            in(no.esquerda);
        }
        System.out.print(" " + no.valor);
        if (no.direita != null) {
            in(no.direita);
        }
    }

    void pos(No no) {
        if (no.esquerda != null) {
            pos(no.esquerda);
        }
        if (no.direita != null) {
            pos(no.direita);
        }
        System.out.print(" " + no.valor);
    }
}
