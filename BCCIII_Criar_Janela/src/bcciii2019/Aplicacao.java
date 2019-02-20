package bcciii2019;
import javax.swing.JFrame;
public class Aplicacao extends JFrame{
    public Aplicacao() {
        setSize(640, 360);
        setVisible(true);
    }
    public static void main(String[] args) {
        Aplicacao a = new Aplicacao();
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}