package Excercicios;

class Exercicio03 {

    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;
        int total = 0;

        for (int i = 1; i <= 11; i++) {
            if (n1 == 0) {
                System.out.println(n1);
                System.out.println(n2);
            }
            total = n1 + n2;
            n1 = n2;
            n2 = total;
            System.out.println(total);

        }

    }
}
