/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String [] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.println("Digite o valor de a: ");
        double a = x.nextDouble();
        
        System.out.println("Digite o valor de b: ");
        double b = x.nextDouble() ;
        
        double soma = a + b;
        
        System.out.println("A soma de " + a + "4 + " + b + " é igual a: " + soma);
    }
    
}
