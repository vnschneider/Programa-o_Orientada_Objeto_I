package revisao_prova3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Aplicacao extends JFrame implements ActionListener {
    JLabel jlname, jlnum, jlstreet, jlsex, jlstate, jlcity;
    JTextField tfname, tfnum, tfstreet, tfcity;
    JMenuBar menubar; 
    JMenu jmfile, jmabout;
    JMenuItem mexit;
    JComboBox cbstate;
    ButtonGroup bgsex;
    JRadioButton rbmale, rbfemale;
    JTable table;
    DefaultTableModel model;
    JScrollPane scroll;
    JButton jbrecord, jbclearline;
    
    public Aplicacao(){
        setLayout(new FlowLayout());
        
        jlname = new JLabel("Nome:");
        add(jlname);
        tfname = new JTextField(10);
        add(tfname);
        tfname.addActionListener(this);
        jlstreet = new JLabel("Rua:");
        add(jlstreet);
        tfstreet = new JTextField(10);
        add(tfstreet);
        tfstreet.addActionListener(this);
        jlnum = new JLabel("Número:");
        add(jlnum);
        tfnum = new JTextField(4);
        add(tfnum);
        tfnum.addActionListener(this);
        jlcity = new JLabel("Cidade:");
        add(jlcity);
        tfcity = new JTextField(10);
        add(tfcity);
        tfcity.addActionListener(this);
        
        //ButtonGroup Sexo
        jlsex = new JLabel("Sexo:");
        add(jlsex);
        ButtonGroup bgsex = new ButtonGroup();
        rbmale = new JRadioButton("Masculino");
        add(rbmale);
        rbmale.addActionListener(this);
        rbfemale = new JRadioButton("Feminino");
        add(rbfemale);
        rbfemale.addActionListener(this);
        bgsex.add(rbmale);
        bgsex.add(rbfemale);
        
        //ComboBox state
        jlstate = new JLabel("Estado:");
        add(jlstate);
        
        String[] state = {" ", "MA", "PI", "SP"};
        cbstate = new JComboBox(state);
        add(cbstate);
        cbstate.addActionListener(this);
        
        //Button
        jbrecord = new JButton("Gravar");
        add(jbrecord);
        jbrecord.addActionListener(this);
        jbclearline = new JButton("Deletar linha");
        add(jbclearline);
        jbclearline.addActionListener(this);
        
        //Table
        String[] columns = new String[]{"Nome", "Rua", "Número", "Sexo", "Cidade", "Estado"};
        String[][] line = new String[][]{{}};
        
        table = new JTable(line,columns);
        model = new DefaultTableModel(line,columns);
        table.setModel(model);
        scroll = new JScrollPane();
        scroll.setViewportView(table);
        add(scroll);
        
        //Menu bar
        jmfile = new JMenu("Arquivo");
        jmabout = new JMenu("Sobre");
        mexit = new JMenuItem("Sair");
        mexit.addActionListener(this);
        jmfile.add(mexit);
        menubar = new JMenuBar();
        menubar.add(jmfile);
        menubar.add(jmabout);
        
        setJMenuBar(menubar);
       
        setSize(1100, 700);
        setVisible(true);
    
}
    public static void main(String[] args) {
        Aplicacao a = new Aplicacao();
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==jbrecord){
            String rbselected = null;
            if(rbfemale.isSelected())
                rbselected = "Feminino";
            else if(rbmale.isSelected())
                rbselected = "Masculino";
            
            String [] newline = {tfname.getText(), tfstreet.getText(), tfnum.getText(), rbselected, tfcity.getText(), cbstate.getSelectedItem().toString()};
            model.addRow(newline);
            tfname.setText(null);
            tfnum.setText(null);
            tfstreet.setText(null);
            tfcity.setText(null);
            rbfemale.setSelected(false);
            rbmale.setSelected(false);
            cbstate.setToolTipText(" ");
        }else if(ae.getSource()==jbclearline){
            if(table.getSelectedRow()==-1){
                JOptionPane.showMessageDialog(null, "Selecione a linha da tabela que você deseja remover!");
            }else
            model.removeRow(table.getSelectedRow());
        }else if(ae.getSource()== mexit)
            System.exit(0);
    }
}
