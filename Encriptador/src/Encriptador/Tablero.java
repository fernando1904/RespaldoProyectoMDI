package Encriptador;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;

public class Tablero extends JPanel implements ActionListener{
    
    private int contador;
    private int contadorCod;
    public static int cod[][] = new int[16][8]; 
    private int con1 = 0;
    private int con2 = 0;
    private int con3 = 1;
    private int dato = 0;
    
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
    
    private JButton e1 = new JButton("1");
    private JButton e2 = new JButton("2");
    private JButton e3 = new JButton("3");
    private JButton e4 = new JButton("4");
    private JButton e5 = new JButton("5");
    private JButton e6 = new JButton("6");
    private JButton e7 = new JButton("7");
    private JButton e8 = new JButton("8");
    private JButton f1 = new JButton("1");
    private JButton f2 = new JButton("2");
    private JButton f3 = new JButton("3");
    private JButton f4 = new JButton("4");
    private JButton f5 = new JButton("5");
    private JButton f6 = new JButton("6");
    private JButton f7 = new JButton("7");
    private JButton f8 = new JButton("8");
    private JButton g1 = new JButton("1");
    private JButton g2 = new JButton("2");
    private JButton g3 = new JButton("3");
    private JButton g4 = new JButton("4");
    private JButton g5 = new JButton("5");
    private JButton g6 = new JButton("6");
    private JButton g7 = new JButton("7");
    private JButton g8 = new JButton("8");
    private JButton h1 = new JButton("1");
    private JButton h2 = new JButton("2");
    private JButton h3 = new JButton("3");
    private JButton h4 = new JButton("4");
    private JButton h5 = new JButton("5");
    private JButton h6 = new JButton("6");
    private JButton h7 = new JButton("7");
    private JButton h8 = new JButton("8");
    
    private JButton i1 = new JButton("1");
    private JButton i2 = new JButton("2");
    private JButton i3 = new JButton("3");
    private JButton i4 = new JButton("4");
    private JButton i5 = new JButton("5");
    private JButton i6 = new JButton("6");
    private JButton i7 = new JButton("7");
    private JButton i8 = new JButton("8");
    private JButton j1 = new JButton("1");
    private JButton j2 = new JButton("2");
    private JButton j3 = new JButton("3");
    private JButton j4 = new JButton("4");
    private JButton j5 = new JButton("5");
    private JButton j6 = new JButton("6");
    private JButton j7 = new JButton("7");
    private JButton j8 = new JButton("8");
    private JButton k1 = new JButton("1");
    private JButton k2 = new JButton("2");
    private JButton k3 = new JButton("3");
    private JButton k4 = new JButton("4");
    private JButton k5 = new JButton("5");
    private JButton k6 = new JButton("6");
    private JButton k7 = new JButton("7");
    private JButton k8 = new JButton("8");
    private JButton l1 = new JButton("1");
    private JButton l2 = new JButton("2");
    private JButton l3 = new JButton("3");
    private JButton l4 = new JButton("4");
    private JButton l5 = new JButton("5");
    private JButton l6 = new JButton("6");
    private JButton l7 = new JButton("7");
    private JButton l8 = new JButton("8");
    
    private JButton m1 = new JButton("1");
    private JButton m2 = new JButton("2");
    private JButton m3 = new JButton("3");
    private JButton m4 = new JButton("4");
    private JButton m5 = new JButton("5");
    private JButton m6 = new JButton("6");
    private JButton m7 = new JButton("7");
    private JButton m8 = new JButton("8");
    private JButton n1 = new JButton("1");
    private JButton n2 = new JButton("2");
    private JButton n3 = new JButton("3");
    private JButton n4 = new JButton("4");
    private JButton n5 = new JButton("5");
    private JButton n6 = new JButton("6");
    private JButton n7 = new JButton("7");
    private JButton n8 = new JButton("8");
    private JButton o1 = new JButton("1");
    private JButton o2 = new JButton("2");
    private JButton o3 = new JButton("3");
    private JButton o4 = new JButton("4");
    private JButton o5 = new JButton("5");
    private JButton o6 = new JButton("6");
    private JButton o7 = new JButton("7");
    private JButton o8 = new JButton("8");
    private JButton p1 = new JButton("1");
    private JButton p2 = new JButton("2");
    private JButton p3 = new JButton("3");
    private JButton p4 = new JButton("4");
    private JButton p5 = new JButton("5");
    private JButton p6 = new JButton("6");
    private JButton p7 = new JButton("7");
    private JButton p8 = new JButton("8");
    

    public static int[][] getCod(){
        return cod;
    }
    
    public Tablero()  {
//            super(new BorderLayout());
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
            
            crearBoton(e1,"e1");
            crearBoton(e2,"e2");
            crearBoton(e3,"e3");
            crearBoton(e4,"e4");
            crearBoton(e5,"e5");
            crearBoton(e6,"e6");
            crearBoton(e7,"e7");
            crearBoton(e8,"e8");
            crearBoton(f1,"f1");
            crearBoton(f2,"f2");
            crearBoton(f3,"f3");
            crearBoton(f4,"f4");
            crearBoton(f5,"f5");
            crearBoton(f6,"f6");
            crearBoton(f7,"f7");
            crearBoton(f8,"f8");
            crearBoton(g1,"g1");
            crearBoton(g2,"g2");
            crearBoton(g3,"g3");
            crearBoton(g4,"g4");
            crearBoton(g5,"g5");
            crearBoton(g6,"g6");
            crearBoton(g7,"g7");
            crearBoton(g8,"g8");
            crearBoton(h1,"h1");
            crearBoton(h2,"h2");
            crearBoton(h3,"h3");
            crearBoton(h4,"h4");
            crearBoton(h5,"h5");
            crearBoton(h6,"h6");
            crearBoton(h7,"h7");
            crearBoton(h8,"h8");
           
            crearBoton(i1,"i1");
            crearBoton(i2,"i2");
            crearBoton(i3,"i3");
            crearBoton(i4,"i4");
            crearBoton(i5,"i5");
            crearBoton(i6,"i6");
            crearBoton(i7,"i7");
            crearBoton(i8,"i8");
            crearBoton(j1,"j1");
            crearBoton(j2,"j2");
            crearBoton(j3,"j3");
            crearBoton(j4,"j4");
            crearBoton(j5,"j5");
            crearBoton(j6,"j6");
            crearBoton(j7,"j7");
            crearBoton(j8,"j8");
            crearBoton(k1,"k1");
            crearBoton(k2,"k2");
            crearBoton(k3,"k3");
            crearBoton(k4,"k4");
            crearBoton(k5,"k5");
            crearBoton(k6,"k6");
            crearBoton(k7,"k7");
            crearBoton(k8,"k8");
            crearBoton(l1,"l1");
            crearBoton(l2,"l2");
            crearBoton(l3,"l3");
            crearBoton(l4,"l4");
            crearBoton(l5,"l5");
            crearBoton(l6,"l6");
            crearBoton(l7,"l7");
            crearBoton(l8,"l8");
            
            crearBoton(m1,"m1");
            crearBoton(m2,"m2");
            crearBoton(m3,"m3");
            crearBoton(m4,"m4");
            crearBoton(m5,"m5");
            crearBoton(m6,"m6");
            crearBoton(m7,"m7");
            crearBoton(m8,"m8");
            crearBoton(n1,"n1");
            crearBoton(n2,"n2");
            crearBoton(n3,"n3");
            crearBoton(n4,"n4");
            crearBoton(n5,"n5");
            crearBoton(n6,"n6");
            crearBoton(n7,"n7");
            crearBoton(n8,"n8");
            crearBoton(o1,"o1");
            crearBoton(o2,"o2");
            crearBoton(o3,"o3");
            crearBoton(o4,"o4");
            crearBoton(o5,"o5");
            crearBoton(o6,"o6");
            crearBoton(o7,"o7");
            crearBoton(o8,"o8");
            crearBoton(p1,"p1");
            crearBoton(p2,"p2");
            crearBoton(p3,"p3");
            crearBoton(p4,"p4");
            crearBoton(p5,"p5");
            crearBoton(p6,"p6");
            crearBoton(p7,"p7");
            crearBoton(p8,"p8");
            
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
        
        if (e.getActionCommand().equals("e1")){
        cod[con1][con2] = 33;
        procesoBoton(e1);
        Contadores();
        }
        if (e.getActionCommand().equals("e2")){
        cod[con1][con2] = 34;
        procesoBoton(e2);
        Contadores();
        }
        if (e.getActionCommand().equals("e3")){
        cod[con1][con2] = 35;
        procesoBoton(e3);
        Contadores();
        }
        if (e.getActionCommand().equals("e4")){
        cod[con1][con2] = 36;
        procesoBoton(e4);
        Contadores();
        }
        if (e.getActionCommand().equals("e5")){
        cod[con1][con2] = 37;
        procesoBoton(e5);
        Contadores();
        }
        if (e.getActionCommand().equals("e6")){
        cod[con1][con2] = 38;
        procesoBoton(e6);
        Contadores();
        }
        if (e.getActionCommand().equals("e7")){
        cod[con1][con2] = 39;
        procesoBoton(e7);
        Contadores();
        }
        if (e.getActionCommand().equals("e8")){
        cod[con1][con2] = 40;
        procesoBoton(e8);
        Contadores();
        }
        if (e.getActionCommand().equals("f1")){
        cod[con1][con2] = 41;
        procesoBoton(f1);
        Contadores();
        }
        if (e.getActionCommand().equals("f2")){
        cod[con1][con2] = 42;
        procesoBoton(f2);
        Contadores();
        }
        if (e.getActionCommand().equals("f3")){
        cod[con1][con2] = 43;
        procesoBoton(f3);
        Contadores();
        }
        if (e.getActionCommand().equals("f4")){
        cod[con1][con2] = 44;
        procesoBoton(f4);
        Contadores();
        }
        if (e.getActionCommand().equals("f5")){
        cod[con1][con2] = 45;
        procesoBoton(f5);
        Contadores();
        }
        if (e.getActionCommand().equals("f6")){
        cod[con1][con2] = 46;
        procesoBoton(f6);
        Contadores();
        }
        if (e.getActionCommand().equals("f7")){
        cod[con1][con2] = 47;
        procesoBoton(f7);
        Contadores();
        }
        if (e.getActionCommand().equals("f8")){
        cod[con1][con2] = 48;
        procesoBoton(f8);
        Contadores();
        }
        if (e.getActionCommand().equals("g1")){
        cod[con1][con2] = 49;
        procesoBoton(g1);
        Contadores();
        }
        if (e.getActionCommand().equals("g2")){
        cod[con1][con2] = 50;
        procesoBoton(g2);
        Contadores();
        }
        if (e.getActionCommand().equals("g3")){
        cod[con1][con2] = 51;
        procesoBoton(g3);
        Contadores();
        }
        if (e.getActionCommand().equals("g4")){
        cod[con1][con2] = 52;
        procesoBoton(g4);
        Contadores();
        }
        if (e.getActionCommand().equals("g5")){
        cod[con1][con2] = 53;
        procesoBoton(g5);
        Contadores();
        }
        if (e.getActionCommand().equals("g6")){
        cod[con1][con2] = 54;
        procesoBoton(g6);
        Contadores();
        }
        if (e.getActionCommand().equals("g7")){
        cod[con1][con2] = 55;
        procesoBoton(g7);
        Contadores();
        }
        if (e.getActionCommand().equals("g8")){
        cod[con1][con2] = 56;
        procesoBoton(g8);
        Contadores();
        }
        if (e.getActionCommand().equals("h1")){
        cod[con1][con2] = 57;
        procesoBoton(h1);
        Contadores();
        }
        if (e.getActionCommand().equals("h2")){
        cod[con1][con2] = 58;
        procesoBoton(h2);
        Contadores();
        }
        if (e.getActionCommand().equals("h3")){
        cod[con1][con2] = 59;
        procesoBoton(h3);
        Contadores();
        }
        if (e.getActionCommand().equals("h4")){
        cod[con1][con2] = 60;
        procesoBoton(h4);
        Contadores();
        }
        if (e.getActionCommand().equals("h5")){
        cod[con1][con2] = 61;
        procesoBoton(h5);
        Contadores();
        }
        if (e.getActionCommand().equals("h6")){
        cod[con1][con2] = 62;
        procesoBoton(h6);
        Contadores();
        }
        if (e.getActionCommand().equals("h7")){
        cod[con1][con2] = 63;
        procesoBoton(h7);
        Contadores();
        }
        if (e.getActionCommand().equals("h8")){
        cod[con1][con2] = 64;
        procesoBoton(h8);
        Contadores();
        }
        
        if (e.getActionCommand().equals("i1")){
        cod[con1][con2] = 65;
        procesoBoton(i1);
        Contadores();
        }
        if (e.getActionCommand().equals("i2")){
        cod[con1][con2] = 66;
        procesoBoton(i2);
        Contadores();
        }
        if (e.getActionCommand().equals("i3")){
        cod[con1][con2] = 67;
        procesoBoton(i3);
        Contadores();
        }
        if (e.getActionCommand().equals("i4")){
        cod[con1][con2] = 68;
        procesoBoton(i4);
        Contadores();
        }
        if (e.getActionCommand().equals("i5")){
        cod[con1][con2] = 69;
        procesoBoton(i5);
        Contadores();
        }
        if (e.getActionCommand().equals("i6")){
        cod[con1][con2] = 70;
        procesoBoton(i6);
        Contadores();
        }
        if (e.getActionCommand().equals("i7")){
        cod[con1][con2] = 71;
        procesoBoton(i7);
        Contadores();
        }
        if (e.getActionCommand().equals("i8")){
        cod[con1][con2] = 72;
        procesoBoton(i8);
        Contadores();
        }
        if (e.getActionCommand().equals("j1")){
        cod[con1][con2] = 73;
        procesoBoton(j1);
        Contadores();
        }
        if (e.getActionCommand().equals("j2")){
        cod[con1][con2] = 74;
        procesoBoton(j2);
        Contadores();
        }
        if (e.getActionCommand().equals("j3")){
        cod[con1][con2] = 75;
        procesoBoton(j3);
        Contadores();
        }
        if (e.getActionCommand().equals("j4")){
        cod[con1][con2] = 76;
        procesoBoton(j4);
        Contadores();
        }
        if (e.getActionCommand().equals("j5")){
        cod[con1][con2] = 77;
        procesoBoton(j5);
        Contadores();
        }
        if (e.getActionCommand().equals("j6")){
        cod[con1][con2] = 78;
        procesoBoton(j6);
        Contadores();
        }
        if (e.getActionCommand().equals("j7")){
        cod[con1][con2] = 79;
        procesoBoton(j7);
        Contadores();
        }
        if (e.getActionCommand().equals("j8")){
        cod[con1][con2] = 80;
        procesoBoton(j8);
        Contadores();
        }
        if (e.getActionCommand().equals("k1")){
        cod[con1][con2] = 81;
        procesoBoton(k1);
        Contadores();
        }
        if (e.getActionCommand().equals("k2")){
        cod[con1][con2] = 82;
        procesoBoton(k2);
        Contadores();
        }
        if (e.getActionCommand().equals("k3")){
        cod[con1][con2] = 83;
        procesoBoton(k3);
        Contadores();
        }
        if (e.getActionCommand().equals("k4")){
        cod[con1][con2] = 84;
        procesoBoton(k4);
        Contadores();
        }
        if (e.getActionCommand().equals("k5")){
        cod[con1][con2] = 85;
        procesoBoton(k5);
        Contadores();
        }
        if (e.getActionCommand().equals("k6")){
        cod[con1][con2] = 86;
        procesoBoton(k6);
        Contadores();
        }
        if (e.getActionCommand().equals("k7")){
        cod[con1][con2] = 87;
        procesoBoton(k7);
        Contadores();
        }
        if (e.getActionCommand().equals("k8")){
        cod[con1][con2] = 88;
        procesoBoton(k8);
        Contadores();
        }
        if (e.getActionCommand().equals("l1")){
        cod[con1][con2] = 89;
        procesoBoton(l1);
        Contadores();
        }
        if (e.getActionCommand().equals("l2")){
        cod[con1][con2] = 90;
        procesoBoton(l2);
        Contadores();
        }
        if (e.getActionCommand().equals("l3")){
        cod[con1][con2] = 91;
        procesoBoton(l3);
        Contadores();
        }
        if (e.getActionCommand().equals("l4")){
        cod[con1][con2] = 92;
        procesoBoton(l4);
        Contadores();
        }
        if (e.getActionCommand().equals("l5")){
        cod[con1][con2] = 93;
        procesoBoton(l5);
        Contadores();
        }
        if (e.getActionCommand().equals("l6")){
        cod[con1][con2] = 94;
        procesoBoton(l6);
        Contadores();
        }
        if (e.getActionCommand().equals("l7")){
        cod[con1][con2] = 95;
        procesoBoton(l7);
        Contadores();
        }
        if (e.getActionCommand().equals("l8")){
        cod[con1][con2] = 96;
        procesoBoton(l8);
        Contadores();
        }
        
        if (e.getActionCommand().equals("m1")){
        cod[con1][con2] = 97;
        procesoBoton(m1);
        Contadores();
        }
        if (e.getActionCommand().equals("m2")){
        cod[con1][con2] = 98;
        procesoBoton(m2);
        Contadores();
        }
        if (e.getActionCommand().equals("m3")){
        cod[con1][con2] = 99;
        procesoBoton(m3);
        Contadores();
        }
        if (e.getActionCommand().equals("m4")){
        cod[con1][con2] = 100;
        procesoBoton(m4);
        Contadores();
        }
        if (e.getActionCommand().equals("m5")){
        cod[con1][con2] = 101;
        procesoBoton(m5);
        Contadores();
        }
        if (e.getActionCommand().equals("m6")){
        cod[con1][con2] = 102;
        procesoBoton(m6);
        Contadores();
        }
        if (e.getActionCommand().equals("m7")){
        cod[con1][con2] = 103;
        procesoBoton(m7);
        Contadores();
        }
        if (e.getActionCommand().equals("m8")){
        cod[con1][con2] = 104;
        procesoBoton(m8);
        Contadores();
        }
        if (e.getActionCommand().equals("n1")){
        cod[con1][con2] = 105;
        procesoBoton(n1);
        Contadores();
        }
        if (e.getActionCommand().equals("n2")){
        cod[con1][con2] = 106;
        procesoBoton(n2);
        Contadores();
        }
        if (e.getActionCommand().equals("n3")){
        cod[con1][con2] = 107;
        procesoBoton(n3);
        Contadores();
        }
        if (e.getActionCommand().equals("n4")){
        cod[con1][con2] = 108;
        procesoBoton(n4);
        Contadores();
        }
        if (e.getActionCommand().equals("n5")){
        cod[con1][con2] = 109;
        procesoBoton(n5);
        Contadores();
        }
        if (e.getActionCommand().equals("n6")){
        cod[con1][con2] = 110;
        procesoBoton(n6);
        Contadores();
        }
        if (e.getActionCommand().equals("n7")){
        cod[con1][con2] = 111;
        procesoBoton(n7);
        Contadores();
        }
        if (e.getActionCommand().equals("n8")){
        cod[con1][con2] = 112;
        procesoBoton(n8);
        Contadores();
        }
        if (e.getActionCommand().equals("o1")){
        cod[con1][con2] = 113;
        procesoBoton(o1);
        Contadores();
        }
        if (e.getActionCommand().equals("o2")){
        cod[con1][con2] = 114;
        procesoBoton(o2);
        Contadores();
        }
        if (e.getActionCommand().equals("o3")){
        cod[con1][con2] = 115;
        procesoBoton(o3);
        Contadores();
        }
        if (e.getActionCommand().equals("o4")){
        cod[con1][con2] = 116;
        procesoBoton(o4);
        Contadores();
        }
        if (e.getActionCommand().equals("o5")){
        cod[con1][con2] = 117;
        procesoBoton(o5);
        Contadores();
        }
        if (e.getActionCommand().equals("o6")){
        cod[con1][con2] = 118;
        procesoBoton(o6);
        Contadores();
        }
        if (e.getActionCommand().equals("o7")){
        cod[con1][con2] = 119;
        procesoBoton(o7);
        Contadores();
        }
        if (e.getActionCommand().equals("o8")){
        cod[con1][con2] = 120;
        procesoBoton(o8);
        Contadores();
        }
        if (e.getActionCommand().equals("p1")){
        cod[con1][con2] = 121;
        procesoBoton(p1);
        Contadores();
        }
        if (e.getActionCommand().equals("p2")){
        cod[con1][con2] = 122;
        procesoBoton(p2);
        Contadores();
        }
        if (e.getActionCommand().equals("p3")){
        cod[con1][con2] = 123;
        procesoBoton(p3);
        Contadores();
        }
        if (e.getActionCommand().equals("p4")){
        cod[con1][con2] = 124;
        procesoBoton(p4);
        Contadores();
        }
        if (e.getActionCommand().equals("p5")){
        cod[con1][con2] = 125;
        procesoBoton(p5);
        Contadores();
        }
        if (e.getActionCommand().equals("p6")){
        cod[con1][con2] = 126;
        procesoBoton(p6);
        Contadores();
        }
        if (e.getActionCommand().equals("p7")){
        cod[con1][con2] = 127;
        procesoBoton(p7);
        Contadores();
        }
        if (e.getActionCommand().equals("p8")){
        cod[con1][con2] = 128;
        procesoBoton(p8);
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

            case 4:
                i.setBackground(Color.GRAY);
                break;
            case 5:
                i.setBackground(Color.getHSBColor(40, 250, 140));
                break;
            case 6:
                i.setBackground(Color.getHSBColor(140, 140, 40));
                break;
            case 7:
                i.setBackground(Color.getHSBColor(52, 247, 191));
                break;
                
            case 8:
                i.setBackground(Color.BLACK);
                break;
            case 9:
                i.setBackground(Color.PINK);
                break;
            case 10:
                i.setBackground(Color.ORANGE);
                break;
            case 11:
                i.setBackground(Color.WHITE);
                break;
                
            case 12:
                i.setBackground(Color.CYAN);
                break;
            case 13:
                i.setBackground(Color.MAGENTA);
                break;
            case 14:
                i.setBackground(Color.lightGray);
                break;
            case 15:
                i.setBackground(Color.DARK_GRAY);
                break;
        }
        i.setText(String.valueOf(contadorCod + 1));
        i.setEnabled(false);
    }

    final void crearBoton(JButton i, String j) {
            i.setPreferredSize(new Dimension(1, 400));
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
            frame.setSize(500, 600); 
            frame.setVisible(true);
            frame.getContentPane().setLayout(new GridLayout(16,8));
            
        }

        public static void iniciar() {
            createAndShowGUI();
        }
}
