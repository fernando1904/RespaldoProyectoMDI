package Encriptador;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tablero extends JPanel implements ActionListener{
    
    private int contador;
    private int contadorCod;
    public static int cod[][] = new int[4][8]; 
    private int con1 = 0;
    private int con2 = 0;
    
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
    
    public static int[][] getCod(){
        return cod;
    }
    
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
    
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("a1")){
        cod[con1][con2] = 1;
        procesoBoton(a1);
        Contadores();
        }
        if (e.getActionCommand().equals("a2")){
        cod[con1][con2] = 2;
        procesoBoton(a2);
        Contadores();
        }
        if (e.getActionCommand().equals("a3")){
        cod[con1][con2] = 3;
        procesoBoton(a3);
        Contadores();
        }
        if (e.getActionCommand().equals("a4")){
        cod[con1][con2] = 4;
        procesoBoton(a4);
        Contadores();
        }
        if (e.getActionCommand().equals("a5")){
        cod[con1][con2] = 5;
        procesoBoton(a5);
        Contadores();
        }
        if (e.getActionCommand().equals("a6")){
        cod[con1][con2] = 6;
        procesoBoton(a6);
        Contadores();
        }
        if (e.getActionCommand().equals("a7")){
        cod[con1][con2] = 7;
        procesoBoton(a7);
        Contadores();
        }
        if (e.getActionCommand().equals("a8")){
        cod[con1][con2] = 8;
        procesoBoton(a8);
        Contadores();
        }
        if (e.getActionCommand().equals("b1")){
        cod[con1][con2] = 9;
        procesoBoton(b1);
        Contadores();
        }
        if (e.getActionCommand().equals("b2")){
        cod[con1][con2] = 10;
        procesoBoton(b2);
        Contadores();
        }
        if (e.getActionCommand().equals("b3")){
        cod[con1][con2] = 11;
        procesoBoton(b3);
        Contadores();
        }
        if (e.getActionCommand().equals("b4")){
        cod[con1][con2] = 12;
        procesoBoton(b4);
        Contadores();
        }
        if (e.getActionCommand().equals("b5")){
        cod[con1][con2] = 13;
        procesoBoton(b5);
        Contadores();
        }
        if (e.getActionCommand().equals("b6")){
        cod[con1][con2] = 14;
        procesoBoton(b6);
        Contadores();
        }
        if (e.getActionCommand().equals("b7")){
        cod[con1][con2] = 15;
        procesoBoton(b7);
        Contadores();
        }
        if (e.getActionCommand().equals("b8")){
        cod[con1][con2] = 16;
        procesoBoton(b8);
        Contadores();
        }
        if (e.getActionCommand().equals("c1")){
        cod[con1][con2] = 17;
        procesoBoton(c1);
        Contadores();
        }
        if (e.getActionCommand().equals("c2")){
        cod[con1][con2] = 18;
        procesoBoton(c2);
        Contadores();
        }
        if (e.getActionCommand().equals("c3")){
        cod[con1][con2] = 19;
        procesoBoton(c3);
        Contadores();
        }
        if (e.getActionCommand().equals("c4")){
        cod[con1][con2] = 20;
        procesoBoton(c4);
        Contadores();
        }
        if (e.getActionCommand().equals("c5")){
        cod[con1][con2] = 21;
        procesoBoton(c5);
        Contadores();
        }
        if (e.getActionCommand().equals("c6")){
        cod[con1][con2] = 22;
        procesoBoton(c6);
        Contadores();
        }
        if (e.getActionCommand().equals("c7")){
        cod[con1][con2] = 23;
        procesoBoton(c7);
        Contadores();
        }
        if (e.getActionCommand().equals("c8")){
        cod[con1][con2] = 24;
        procesoBoton(c8);
        Contadores();
        }
        if (e.getActionCommand().equals("d1")){
            cod[con1][con2] = 25;
            procesoBoton(d1);
        Contadores();
        }
        if (e.getActionCommand().equals("d2")){
        cod[con1][con2] = 26;
        procesoBoton(d2);
        Contadores();
        }
        if (e.getActionCommand().equals("d3")){
        cod[con1][con2] = 27;
        procesoBoton(d3);
        Contadores();
        }
        if (e.getActionCommand().equals("d4")){
        cod[con1][con2] = 28;
        procesoBoton(d4);
        Contadores();
        }
        if (e.getActionCommand().equals("d5")){
        cod[con1][con2] = 29;
        procesoBoton(d5);
        Contadores();
        }
        if (e.getActionCommand().equals("d6")){
        cod[con1][con2] = 30;
        procesoBoton(d6);
        Contadores();
        }
        if (e.getActionCommand().equals("d7")){
        cod[con1][con2] = 31;
        procesoBoton(d7);
        Contadores();
        }
        if (e.getActionCommand().equals("d8")){
        cod[con1][con2] = 32;
        procesoBoton(d8);
        Contadores();
        }
    }
    
    final void Contadores() {
        contadorCod++;
        if (contadorCod % 8 == 0) {
            // contadorCod = 0
            contador++;
        }
        con2++;
        
        if ((con2 == 8)) {
            con2 = 0;
            con1++;
        }
    }
    
    final void procesoBoton(JButton i) {
        switch (contador) {
            case 0:
                i.setBackground(Color.green);
                break;
            case 1:
                i.setBackground(Color.red);
                break;
            case 2:
                i.setBackground(Color.yellow);
                break;
            case 3:
                i.setBackground(Color.blue);
                break;
        }
        i.setText(String.valueOf(contadorCod + 1));
        i.setEnabled(false);
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
    
    public static void iniciar() {
        createAndShowGUI();
    }
        
    /*-public static void main(String[] args) {
        createAndShowGUI();
    }*/
}