package psv;

import java.sql.*;
import java.util.*;

public class Teste {

    public static void main(String[] args) {
        Connection con = Conexao.abrirConexao();
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);

//Testando método inserir 
        /*cb.setPlaca("GME1693"); 
 cb.setCor("Roxão"); 
 cb.setDescricao("Carro 3"); 
 System.out.println(cd.inserir(cb));*/

//Testando método alterar  
        cb.setPlaca("JFB2953"); 
 cb.setCor("Roxão"); 
 cb.setDescricao("Carro 2"); 
 cb.setAno("2010"); 
 System.out.println(cd.alterar(cb));

//Testando excluir 
        /*cb.setPlaca("JKL2897");
        System.out.println(cd.excluir(cb));

        //Listagem
        List<CarroBean> lista = cd.listarTodos();
        if (lista != null) {
            for (CarroBean carro : lista) {
                System.out.println("Placa: " + carro.getPlaca());
                System.out.println("Cor: " + carro.getCor());
                System.out.println("Descrição: " + carro.getDescricao());
            }
        }*/
        Conexao.fecharConexao(con);
    }

}
