/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercícios;

import java.util.Scanner;

public class Ex05 {
    
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
            double base, altura;
        
        System.out.println("Digite o valor da base do triângulo: ");
        base = x.nextDouble();
        
        System.out.println("Digite o valor da altura do triângulo: ");
        altura = x.nextDouble();
        
            double area = (base* altura)/ 2;
                    
        System.out.println("O valor da área do triângulo é igual a " + area);
    }  
}
