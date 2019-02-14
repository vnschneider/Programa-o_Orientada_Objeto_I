package turma2019;

import javax.swing.JOptionPane;

public class Aplicacao {

    public static void main(String[] args) {
        
        String nome = "";
        nome =
                JOptionPane.showInputDialog("Nome: ");
        
        
        int id = 10; double peso = 98;
        
        System.out.println("Meu nome é: " + nome + "\nTenho: " + id + " anos \nPeso: "  + peso +"Kg");
   
    }
    
}
