package revisao_prova_2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MTabrir extends JFrame implements ActionListener{
    JLabel jlinfo;
    JComboBox cbtest;
    String test[]= {" ","mds", "To ferrado"};
    
    
    public MTabrir(){
        setLayout(new FlowLayout());
        
        cbtest = new JComboBox(test);
        add(cbtest);
        
        jlinfo = new JLabel("Funfa andsk");
        add(jlinfo);
        
        setSize(200, 200);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        MTabrir a= new MTabrir();
        
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
    
}
