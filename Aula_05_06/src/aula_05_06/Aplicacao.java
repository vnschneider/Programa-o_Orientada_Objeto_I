package aula_05_06;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Aplicacao extends JFrame implements ActionListener{
    JMenuBar bmenu;
    JMenu menuarquivo, majuda;
    JMenuItem mabrir, msair;
    JRadioButton rbmax, rbfemi;
    ButtonGroup bse;
    
    public Aplicacao(){
        setLayout(new FlowLayout());
        
        
        menuarquivo = new JMenu("Arquivo");
        majuda = new JMenu("Ajuda");
        mabrir = new JMenuItem("Abrir");
        menuarquivo.add(mabrir);
        mabrir.addActionListener(this);
        msair = new JMenuItem("Sair");
        menuarquivo.add(msair);
        msair.addActionListener(this);
        
         
        bse = new ButtonGroup();
        rbmax =  new JRadioButton("Masculino");
        add(rbmax);
        rbfemi =  new JRadioButton("Feminino");
        add(rbfemi);
        bse.add(rbmax);
        bse.add(rbfemi);
        
        
        bmenu = new JMenuBar();
        bmenu.add(menuarquivo);
        bmenu.add(majuda);
        setJMenuBar(bmenu);
        
        
        setSize(300, 300);
        setVisible(true);
    }

   
    public static void main(String[] args) {
       Aplicacao a= new Aplicacao();
       a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==msair){
            System.exit(0);
        }else if(e.getSource()==mabrir){
           
        }   
    }
}