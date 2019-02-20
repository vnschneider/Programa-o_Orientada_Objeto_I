
package bcciii2018;
import javax.swing.JOptionPane;
public class aplication {

    public static void main(String[] args) {
        String v1 = 
                    JOptionPane.showInputDialog("Valor 1: ");
        
            String v2 = 
                    JOptionPane.showInputDialog("Valor 2: ");
            
        int valor1 = Integer.parseInt(v1);
        int valor2 = Integer.parseInt(v2);
        int s = valor1 + valor2;
        JOptionPane.showMessageDialog(null, "A soma é: " + s);
    }
    
}