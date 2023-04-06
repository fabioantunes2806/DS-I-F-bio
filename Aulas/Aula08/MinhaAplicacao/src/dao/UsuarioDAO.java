package dao;

import factory.ConnectionFactory;
import modelo.Usuario;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;

    public UsuarioDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(Usuario usuario){

        String sql = "INSERT INTO usuario(nome,cpf,email,telefone) " +
                "VALUES(?,?,?,?)";
            try{

                PreparedStatement stmt = connection.preapareStatement(sql);
                stmt.setString(1, usuario.getNome());
                stmt.setString(2, usuario.getCpf());
                stmt.setString(3, usuario.getEmail());
                stmt.setString(4, usuario.getTelefone());
                stmt.close();
            }catch (SQLException u){
                throw new RuntimeException(u);
            }


    }
}
