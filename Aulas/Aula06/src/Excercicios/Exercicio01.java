package Excercicios;

public class Exercicio01 {

    // % é um mod
    
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - Par");
            } else {
                System.out.println(i + " - Ímpar");
            }    
        }
    }
}
