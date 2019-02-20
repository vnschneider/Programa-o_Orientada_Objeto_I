package bcciii2018;
import javax.swing.JOptionPane;
public class Aplicacao {
    public static void main(String[] args) {
        int s = 0;
        for(int i=1; i<=5; i++){
         String v = 
                    JOptionPane.showInputDialog("Valor: " +i);          
        int valor = Integer.parseInt(v);
        s += valor;
    }
       
        JOptionPane.showMessageDialog(null, "A soma é: " + s, "Soma", JOptionPane.NO_OPTION);
    }
    
}