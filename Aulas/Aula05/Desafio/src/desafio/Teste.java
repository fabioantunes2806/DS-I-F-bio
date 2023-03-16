
package desafio;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
         Desafio x = new Desafio();
        
        int dec = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para calcular a ára de um triângulo, 2 para a de um retângulo e 3 para a de um quadrado: "));
        
        if (dec == 1){
            x.triângulo();
        }else if (dec == 2){
            x.retângulo();
        }else if (dec == 3){
            x.quadrado();
        }else{
            Integer.parseInt(JOptionPane.showInputDialog("Valor inválido! por favor tente novamente."));
           
            
        }
    }
    
}
