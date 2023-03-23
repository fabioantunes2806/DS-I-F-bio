package Excercicios;

public class Exercicio02 {

    public static void main(String[] args) {

        int soma = 0;
        int total = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);

            total = soma + i;

            soma = total;
        }
        System.out.println("O valor da soma é " + total);

    }

}
