
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
    
    protected JTextArea Visor1;
    protected JTextArea Visor2;
    private JButton Encriptar = new JButton("encriptar");
    private JButton Desencriptar = new JButton("desencriptar");
    
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

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}