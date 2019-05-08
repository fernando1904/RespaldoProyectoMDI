
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
    private int bin1[][] = new int[4][8];
    private int binCod[][] = new int[4][8];
    private int v1=0;
    private int v2=0;
    private int v3=0;
    private int v4=0;
    private int index1=0;
    private int index2=0;
    private String texto="";
    private int tamTexto;
    private int dato=0;
    private int con1 = 7;
    private char char1;
    private char char2;
    private char char3;
    private char char4;
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
            this.encriptacion(0);
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
        int res;
        con1 = 0;
        while ((con1 < 8)) {
            bin1[binNro][con1] = 0;
            con1++;
        }
        con1 = 7;
        if (tipo == 0) {
           do{
                res = dec % 2;
                bin1[binNro][con1] = res;
                dec = (int)dec / 2;
                con1--;
            }while(dec != 0);
        }
        con1 = 7;
    }
    
    final void encriptacion(int tipo) {
//        showMessageDialog(null, bin1[0][0] + " " + bin1[0][1] + " " + bin1[0][2] + " " + bin1[0][3] + " " + bin1[0][4] + " " + bin1[0][5] + " " + bin1[0][6] + " " + bin1[0][7]);
        switch (tipo) {
            case 0:
                for (int i = 0; i <= 3; i++) {
                    for (int j = 0; j <= 7; j++) {
                        dato = cod[i][j];
                        switch (dato) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                index1 = 0;
                                index2 = (dato - 1);
                                break;
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                                dato -= 8;
                                index1 = 1;
                                index2 = (dato - 1);
                                break;
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                                dato -= 16;
                                index1 = 2;
                                index2 = (dato - 1);
                                break;
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                                dato -= 24;
                                index1 = 3;
                                index2 = (dato - 1);
                                break;
                        }
                        binCod[i][j] = bin1[index1][index2];
                    }
                }
                v1 = ((binCod[0][0] * 10000000) 
                            + ((binCod[0][1] * 1000000) 
                            + ((binCod[0][2] * 100000) 
                            + ((binCod[0][3] * 10000) 
                            + ((binCod[0][4] * 1000) 
                            + ((binCod[0][5] * 100) 
                            + ((binCod[0][6] * 10) 
                            + (binCod[0][7] * 1))))))));
                v2 = ((binCod[1][0] * 10000000) 
                            + ((binCod[1][1] * 1000000) 
                            + ((binCod[1][2] * 100000) 
                            + ((binCod[1][3] * 10000) 
                            + ((binCod[1][4] * 1000) 
                            + ((binCod[1][5] * 100) 
                            + ((binCod[1][6] * 10) 
                            + (binCod[1][7] * 1))))))));
                v3 = ((binCod[2][0] * 10000000) 
                            + ((binCod[2][1] * 1000000) 
                            + ((binCod[2][2] * 100000) 
                            + ((binCod[2][3] * 10000) 
                            + ((binCod[2][4] * 1000) 
                            + ((binCod[2][5] * 100) 
                            + ((binCod[2][6] * 10) 
                            + (binCod[2][7] * 1))))))));
                v4 = ((binCod[3][0] * 10000000) 
                            + ((binCod[3][1] * 1000000) 
                            + ((binCod[3][2] * 100000) 
                            + ((binCod[3][3] * 10000) 
                            + ((binCod[3][4] * 1000) 
                            + ((binCod[3][5] * 100) 
                            + ((binCod[3][6] * 10) 
                            + (binCod[3][7] * 1))))))));
                break;
        }
        v1=BnADec(v1);
        v2=BnADec(v2);
        v3=BnADec(v3);
        v4=BnADec(v4);
        //showMessageDialog(null, v1 + " " + v2 + " " + v3 + " " + v4);
        char1 = (char)v1;
        char2 = (char)v2;
        char3 = (char)v3;
        char4 = (char)v4;
        //showMessageDialog(null, char1 + " " + char2 + " " + char3 + " " + char4);
        if ((tipo == 0)) {
            encresult = encresult + char1 + char2 + char3 + char4;
        }
    }
    
    public static String reverseIt(String source) {
    int i, len = source.length();
    StringBuilder dest = new StringBuilder(len);

    for (i = (len - 1); i >= 0; i--){
        dest.append(source.charAt(i));
    }
    return dest.toString();
    }
    
    final int BnADec(int v) {
        String bin;
        int largo;
        int numero;
        String valor;
        int X;
        int I;
        bin = String.valueOf(v);
//        showMessageDialog(null, "EL valor de v1: " + bin);
        bin = reverseIt(bin);
//        showMessageDialog(null, "EL valor de v1 inverso: " + bin);
        largo = bin.length();
        v = 0;
        for (I = 1; I <= largo; I++) {
            X = (int)(Math.pow(2, (I - 1)));
            valor=String.valueOf(bin.charAt(I - 1));
            numero=Integer.parseInt(valor);
//            showMessageDialog(null, bin.charAt(I - 1));
            v = v + (numero * X);
//            showMessageDialog(null, numero + " " + X);
        }
//        showMessageDialog(null, "EL valor de v: " + v);
        return v;
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