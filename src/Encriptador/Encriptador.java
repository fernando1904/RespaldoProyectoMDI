
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
    Tablero tablero1 = new Tablero();
    //Creamos dos JTextArea y dos botones
    protected JTextArea Visor1= new JTextArea(10, 20);
    protected JTextArea Visor2= new JTextArea(10, 20);
    private JButton Encriptar = new JButton("encriptar");
    private JButton Desencriptar = new JButton("desencriptar");
    
    //Escuchamos los dos botones 
    public void actionPerformed(ActionEvent e) {  
        /*Al presionar en encriptar
          cargamos la matriz cod del tablero1 en enc1
          y en Visor2 cargamos el texto del resultado 
          de encriptar el texto de Visor1 
        */
        if (e.getActionCommand().equals("encriptar")){     
            //Instanciamos un objeto de la clase Encriptar()
            Encriptar enc1 = new Encriptar();
            enc1.setCod(Tablero.getCod());
            Visor2.setText(enc1.Encriptando(Visor1.getText())); 
            enc1=null;
            System.gc();
        }
        /*Al presionar en desencriptar primero hacemos un 
          if donde preguntamos si esta habilitado el boton
          desencriptar y en caso de que este habilitado
          cargamos la matriz cod del tablero1 en enc1
          y en Visor2 cargamos el texto del resultado 
          de desencriptar el texto de Visor1.
          En caso de que este deshabilitado mostramos un mensaje
          de alerta.
        */
        if (e.getActionCommand().equals("desencriptar")){
            //Instanciamos un objeto de la clase Encriptar()
            Encriptar enc1 = new Encriptar();
            if(Tablero.getBotonDesenc()){
            enc1.setCod(Tablero.getCod());
            Visor2.setText(enc1.Desencriptando(Visor1.getText()));
            }else{
                JOptionPane.showMessageDialog(this, "Al ingresar una Clave Publica usted no puede desencriptar y solamente puede encriptar.","Encriptador", 0);
            }
            enc1=null;
            System.gc();
        }
    }
    
    /*
      Vamos creando los botones.
      A cada uno le asignamos un tamaño y un nombre para ser escuchado.
    */
    void crearBoton(JButton i, String j) {
            i.setPreferredSize(new Dimension(200, 30));
            add(i);
            i.setActionCommand(j);
            i.addActionListener(this);
    }
    
    /*
      Creamos los Layput y vamos cargando los componentes en ellos.
    */
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
    
    /*
      Creamos el JFrame donde van a ir los layout y los componentes.
    */
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("encriptador");
        //En caso de ser cerrada la ventana se termina la ejecucion
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Encriptador());
        frame.pack();
        frame.setVisible(true);
    }
    
    /*
      Iniciamos el tablero y nuestro GUI encriptador.
    */
    public static void main(String[] args) {
        Tablero.iniciar();
        createAndShowGUI();        
    }
    
}