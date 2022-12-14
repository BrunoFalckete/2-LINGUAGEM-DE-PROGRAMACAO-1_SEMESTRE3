import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection createConnection() {
        String url = "jdbc:mysql://localhost:33/trabalho";
        String userName = "root";
        String pwd = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, userName, pwd);
            return conn;

        } catch (ClassNotFoundException erro) {
            System.out.println("Erro: Driver not found");

        } catch (SQLException erro) {
            System.out.println("Erro: Connection failed!");
            erro.printStackTrace();
        }

        return null;
    }
}