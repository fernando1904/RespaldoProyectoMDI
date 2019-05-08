
package Encriptador;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import java.awt.Dimension;

public class Encriptador extends JPanel implements ActionListener {
    
    private String encresult="";
    private int cod[][] = new int[4][8];
    private String texto="";
    private int tamTexto;
    private char char1;
    private char char2;
    private char char3;
    private char char4;
    private int v1=0;
    private int v2=0;
    private int v3=0;
    private int v4=0;
    private Tablero tablero1 = new Tablero();
    
    protected JTextArea Visor1;
    protected JTextArea Visor2;
    private JButton Encriptar = new JButton("encriptar");
    private JButton Desencriptar = new JButton("desencriptar");
    
    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equals("encriptar")){
         Encriptar();
        }
        if (e.getActionCommand().equals("desencriptar")){
         Desencriptar();
        }
    }
    
    final void Encriptar() {
//        PENDIENTE HACER CARGA DE ARCHIVOS
        if (encresult.equals("")) {
            texto = Visor1.getText();
        }
        cod=tablero1.getCod();
        
        while ((!texto.equals(""))) {
            if ((texto.length() == 3)) {
                texto = (texto + "|");
            }
            else if ((texto.length() == 2)) {
                texto = (texto + "||");
            }
            else if ((texto.length() == 1)) {
                texto = (texto + "|||");
            }
            this.extraerCaracteres();
            this.convertiraBinario(0);
            //this.encriptacion(0);
        }

        texto = encresult;
//        showMessageDialog(null, encresult);
        Visor2.setText(encresult);
        encresult = "";
    }
    
    final void Desencriptar() {
    }
    
    final void extraerCaracteres() {
        tamTexto = texto.length();
        char1 = texto.charAt(0);
        texto = texto.substring(texto.length() - (tamTexto - 1));
        tamTexto = texto.length();
        char2 = texto.charAt(0);
        texto = texto.substring(texto.length() - (tamTexto - 1));
        tamTexto = texto.length();
        char3 = texto.charAt(0);
        texto = texto.substring(texto.length() - (tamTexto - 1));
        tamTexto = texto.length();
        char4 = texto.charAt(0);
        texto = texto.substring(texto.length() - (tamTexto - 1));
        tamTexto = texto.length();
    }
    
    final void convertiraBinario(int tipo) {
        // v1 = 0
        // v2 = 0
        // v3 = 0
        // v4 = 0
        v1 = (int)char1;
        v2 = (int)char2;
        v3 = (int)char3;
        v4 = (int)char4;
        switch (tipo) {
            case 0:
                DecABn(v1, 0, 0);
                DecABn(v2, 1, 0);
                DecABn(v3, 2, 0);
                DecABn(v4, 3, 0);
                break;
            case 1:
                DecABn(v1, 0, 1);
                DecABn(v2, 1, 1);
                DecABn(v3, 2, 1);
                DecABn(v4, 3, 1);
                break;
        }
    }

    final void DecABn(int dec, int binNro, int tipo) {
        System.out.println("dec "+dec);
        System.out.println("binNro "+binNro);
        System.out.println("tipo "+tipo);
    }

    final void crearBoton(JButton i, String j) {

            i.setPreferredSize(new Dimension(150, 30));
            
//            add(i, BorderLayout.CENTER);
            add(i);
//            i.addActionListener(this);
            i.setActionCommand(j);
            i.addActionListener(this);
    }
    
    public Encriptador() {
        super(new GridBagLayout());
 
        Visor1 = new JTextArea(5, 20);
        Visor1.setEditable(true);
        JScrollPane scrollPane1 = new JScrollPane(Visor1);
        
        Visor2 = new JTextArea(5, 20);
        Visor2.setEditable(true);
        JScrollPane scrollPane2 = new JScrollPane(Visor2);
 
        //Add Components to this panel.
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;
 
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        add(scrollPane1, c);
        
        GridBagConstraints d = new GridBagConstraints();
        d.gridwidth = GridBagConstraints.REMAINDER;
 
//        d.fill = GridBagConstraints.HORIZONTAL;
//        add(textField, d);
 
        d.fill = GridBagConstraints.BOTH;
        d.weightx = 1.0;
        d.weighty = 1.0;
        add(scrollPane2, d);
        
        crearBoton(Encriptar,"encriptar");
        crearBoton(Desencriptar,"desencriptar");
    }
    
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("encriptador");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Add contents to the window.
        frame.add(new Encriptador());
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        Tablero.iniciar();
        createAndShowGUI();        
    }    
}