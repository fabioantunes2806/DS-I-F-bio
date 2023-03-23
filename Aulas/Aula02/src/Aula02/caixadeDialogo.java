package Aula02;

import javax.swing.JOptionPane;

public class caixadeDialogo {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("digite seu nome: ");

        JOptionPane.showMessageDialog(null, "Seu nome é: "
                + nome);
    }

}
