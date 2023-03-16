
package desafio;

import javax.swing.JOptionPane;
        
public class Desafio {
    void triângulo() {
        
        try{
        
        double b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base do triângulo: "));
        double h = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do triângulo: "));
        
        double area = (b*h)/2;
        
        JOptionPane.showMessageDialog(null, "O valor da área do triângulo é de: " + area + " m2.");
        
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Caractere inválido! Por favor, digite novamente.");
        }
    }
    
    void retângulo() {
        
        try{
            
       double b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base do retângulo: "));
       double h = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do retângulo: "));
       
       double area = b*h;
       
       JOptionPane.showMessageDialog(null, "O valor da área do retângulo é igual a: " + area + " m2.");
       
        } catch (Exception e){
               JOptionPane.showMessageDialog(null, "Caractere inválido! Por favor, digite novamente.");
               }
        }
    
    void quadrado() {
        
        try{
            
        double b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base do quadrado: "));
        double h = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do quadrado: "));
        
        if (b != h){
            JOptionPane.showMessageDialog(null, "Isso não é um quadrado! Por favor, digite valores iguais para base e altura.");
        }else{     
            double area = b*h;
        
            JOptionPane.showMessageDialog(null, "O valor da área do quadrado é de: " + area + " m2.");
           
        }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Caractere inválido! Por favor, digite novamente.");
        }   
    }
    }
    

