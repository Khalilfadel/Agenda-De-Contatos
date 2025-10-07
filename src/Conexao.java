import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection conectar() {
        try {
            String url = "jdbc:postgresql://localhost:5432/agenda"; // nome do banco
            String usuario = "postgres"; // ou o usuário que você usa no pgAdmin
            String senha = "2202";  // substitua pela sua senha

            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println(" Conectado ao banco de dados!");
            return conexao;
        } catch (SQLException e) {
            System.out.println(" Erro ao conectar: " + e.getMessage());
            return null;
        }
    }
}