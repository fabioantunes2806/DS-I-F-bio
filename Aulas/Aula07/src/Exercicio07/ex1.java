package Exercicio07;

public class ex1 {

    void desafio() {

        int i = 0;
        int n1 = 0;
        int n2 = 0;
        int somax = 0;
        int somay = 0;
        int totalx = 0;
        int totaly = 0;

        while ( i <= 99) {
            i++;
            if (i % 2 == 0) {
                System.out.println(i + " - Par");
                n1 = i;
                totalx = somax + n1;
                somax = totalx;
            } else {
                System.out.println(i + " - Ímpar");
                n2 = i;
                totaly = somay + n2;
                somay = totaly;
            }

        }
        System.out.println("A soma dos números pares é: " + totalx);
        System.out.println("A soma dos números ímpares é: " + totaly);

        if (totalx > totaly) {
            System.out.println("A soma dos números pares é maior.");
        } else {
            System.out.println("A soma dos números ímpares é maior.");
        }
    }
}