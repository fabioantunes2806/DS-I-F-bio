package Procedimento;

import javax.swing.JOptionPane;

public class Operador {

    void soma() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de a: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de b: "));
        int soma = a + b;

        JOptionPane.showMessageDialog(null, "O valor de " + a + " + " + b + " é igual a: " + soma);
    }

    void sub() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de a: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de b: "));
        int sub = a - b;

        JOptionPane.showMessageDialog(null, "O valor de " + a + " - " + b + " é igual a: " + sub);
    }

    void mult() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de b: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de b: "));
        int multi = a * b;

        JOptionPane.showMessageDialog(null, "O valor de " + a + " x " + b + " é igual a: " + multi);
    }

    void div() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de a: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de b: "));
        int div = a / b;

        JOptionPane.showMessageDialog(null, "O valor de " + a + " / " + b + " é igual a: " + div);
    }
}
