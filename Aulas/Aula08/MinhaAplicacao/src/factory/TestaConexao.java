package factory;

import java.sql.Connection;
import java.sql.SQLException;

public class testaConexao {
    public static void main(String[] args)throws SQLException {
            
        Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Conexão Aberta");
        connection.close();
    }
}
