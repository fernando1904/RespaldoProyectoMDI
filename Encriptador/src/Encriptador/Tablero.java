package Encriptador;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tablero extends JPanel implements ActionListener{
    
    
    private JButton a1 = new JButton("1");
    private JButton a2 = new JButton("2");
    private JButton a3 = new JButton("3");
    private JButton a4 = new JButton("4");
    private JButton a5 = new JButton("5");
    private JButton a6 = new JButton("6");
    private JButton a7 = new JButton("7");
    private JButton a8 = new JButton("8");
    private JButton b1 = new JButton("1");
    private JButton b2 = new JButton("2");
    private JButton b3 = new JButton("3");
    private JButton b4 = new JButton("4");
    private JButton b5 = new JButton("5");
    private JButton b6 = new JButton("6");
    private JButton b7 = new JButton("7");
    private JButton b8 = new JButton("8");
    private JButton c1 = new JButton("1");
    private JButton c2 = new JButton("2");
    private JButton c3 = new JButton("3");
    private JButton c4 = new JButton("4");
    private JButton c5 = new JButton("5");
    private JButton c6 = new JButton("6");
    private JButton c7 = new JButton("7");
    private JButton c8 = new JButton("8");
    private JButton d1 = new JButton("1");
    private JButton d2 = new JButton("2");
    private JButton d3 = new JButton("3");
    private JButton d4 = new JButton("4");
    private JButton d5 = new JButton("5");
    private JButton d6 = new JButton("6");
    private JButton d7 = new JButton("7");
    private JButton d8 = new JButton("8");
         
    public Tablero()  {
//      super(new BorderLayout());
        crearBoton(a1,"a1");
        crearBoton(a2,"a2");
        crearBoton(a3,"a3");
        crearBoton(a4,"a4");
        crearBoton(a5,"a5");
        crearBoton(a6,"a6");
        crearBoton(a7,"a7");
        crearBoton(a8,"a8");
        crearBoton(b1,"b1");
        crearBoton(b2,"b2");
        crearBoton(b3,"b3");
        crearBoton(b4,"b4");
        crearBoton(b5,"b5");
        crearBoton(b6,"b6");
        crearBoton(b7,"b7");
        crearBoton(b8,"b8");
        crearBoton(c1,"c1");
        crearBoton(c2,"c2");
        crearBoton(c3,"c3");
        crearBoton(c4,"c4");
        crearBoton(c5,"c5");
        crearBoton(c6,"c6");
        crearBoton(c7,"c7");
        crearBoton(c8,"c8");
        crearBoton(d1,"d1");
        crearBoton(d2,"d2");
        crearBoton(d3,"d3");
        crearBoton(d4,"d4");
        crearBoton(d5,"d5");
        crearBoton(d6,"d6");
        crearBoton(d7,"d7");
        crearBoton(d8,"d8");
    }
    
    final void crearBoton(JButton i, String j) {
        i.setPreferredSize(new Dimension(10, 100));
        add(i);
        i.setActionCommand(j);
        i.addActionListener(this);
    }
    
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Encriptador");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent newContentPane = new Tablero();

        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);
        frame.getContentPane().setLayout(new GridLayout(4,8));
    }
    
    /*public static void iniciar() {
        createAndShowGUI();
    }*/
        
    public static void main(String[] args) {
        createAndShowGUI();
    }

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}