
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
import javax.swing.JOptionPane;

public class Encriptador extends JPanel implements ActionListener {
    private Tablero tablero1 = new Tablero();
    private int cod[][] = new int[16][8];
    protected JTextArea Visor1= new JTextArea(10, 20);
    protected JTextArea Visor2= new JTextArea(10, 20);
    private JButton Encriptar = new JButton("encriptar");
    private JButton Desencriptar = new JButton("desencriptar"); 
    private Encriptar enc1 = new Encriptar();
    private final static String newline = "\n";
    
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("encriptar")){     
            enc1.setCod(tablero1.getCod());
//            enc1.setCod(cod);
            Visor2.setText(enc1.Encriptando(Visor1.getText())); 
        }
        if (e.getActionCommand().equals("desencriptar")){
            if(tablero1.getBotonDesenc()){
            enc1.setCod(tablero1.getCod());
//            enc1.setCod(cod);
            Visor2.setText(enc1.Desencriptando(Visor1.getText()));
           }else{
                JOptionPane.showMessageDialog(this, "Al ingresar una Clave Publica usted no puede desencriptar y solamente puede encriptar.","Encriptador", 0);
           }
        }
    }
    
    final void crearBoton(JButton i, String j) {
            i.setPreferredSize(new Dimension(200, 30));
            add(i);
            i.setActionCommand(j);
            i.addActionListener(this);
    }
    
    public Encriptador() {
        super(new GridBagLayout());
        Visor1.setEditable(true);
        JScrollPane scrollPane1 = new JScrollPane(Visor1);
        Visor2.setEditable(true);
        JScrollPane scrollPane2 = new JScrollPane(Visor2);
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        add(scrollPane1, c);
        GridBagConstraints d = new GridBagConstraints();
        d.gridwidth = GridBagConstraints.REMAINDER;
        d.fill = GridBagConstraints.BOTH;
        d.weightx = 1.0;
        d.weighty = 1.0;
        add(scrollPane2, d); 
        crearBoton(Encriptar,"encriptar");
        crearBoton(Desencriptar,"desencriptar");
    }
       
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("encriptador");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Encriptador());
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        Tablero.iniciar();
        createAndShowGUI();        
    }
    
}