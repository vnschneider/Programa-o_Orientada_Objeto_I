package aula_05_06;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Aplicacao extends JFrame implements ActionListener{
    JTextField tfnome, tfrua, tfnumero;
    JLabel jlnome, jlrua, jlnumero, jlsexo;
    JMenuBar bmenu;
    JMenu menuarquivo, majuda;
    JMenuItem magravar, msair;
    JRadioButton rbmax, rbfemi;
    ButtonGroup bse;
    JTable table;
    DefaultTableModel model;
    JScrollPane scroll;
  
    public Aplicacao(){
        setLayout(new FlowLayout());
        
        jlnome = new JLabel("Nome");
        add(jlnome);
        tfnome = new JTextField(10);
        add(tfnome);
        jlrua = new JLabel("Rua");
        add(jlrua);
        tfrua = new JTextField(6);
        add(tfrua);
        jlnumero = new JLabel("Número");
        add(jlnumero);
        tfnumero = new JTextField(11);
        add(tfnumero);
        
        jlsexo = new JLabel("Sexo: ");
        add(jlsexo);
        bse = new ButtonGroup();
        rbmax =  new JRadioButton("Masculino");
        add(rbmax);
        rbfemi =  new JRadioButton("Feminino");
        add(rbfemi);
        bse.add(rbmax);
        bse.add(rbfemi);
        
        String[] colunas = new String[]{"Nome", "N°", "Rua", "Bairro", "Estado", "Cidade", "Sexo"};
        String[][] dados = new String[][]{{}};
                
        table = new JTable(dados, colunas);
        model = new DefaultTableModel(dados, colunas);
        table.setModel(model);
        scroll = new JScrollPane();
        scroll.setViewportView(table);
        add(scroll);
       
        menuarquivo = new JMenu("Arquivo");
        majuda = new JMenu("Ajuda");
        magravar = new JMenuItem("Gravar");
        menuarquivo.add(magravar);
        magravar.addActionListener(this);
        msair = new JMenuItem("Sair");
        menuarquivo.add(msair);
        msair.addActionListener(this);
       
        bmenu = new JMenuBar();
        bmenu.add(menuarquivo);
        bmenu.add(majuda);
        setJMenuBar(bmenu);
        
        
        setSize(800, 500);
        setVisible(true);
    }

   
    public static void main(String[] args) {
       Aplicacao a = new Aplicacao();
       a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==msair){
            System.exit(0);
        }else if(e.getSource()==magravar){
           
        }   
    }
}