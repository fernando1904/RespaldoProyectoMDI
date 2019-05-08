
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
import static javax.swing.JOptionPane.showMessageDialog;

public class Encriptador extends JPanel implements ActionListener {
    
    private String encresult="";
    private String desencresult="";
    private int cod[][] = new int[16][8];
    private int bin1[][] = new int[16][8];
    private int bin2[][] = new int[16][8];
    private int binCod[][] = new int[16][8];
    private int binDecod[][] = new int[16][8];
    private char letra[]=new char[16];
    private int numero[]=new int[16];
    private int index1=0;
    private int index2=0;
    private String texto="";
    private int tamTexto;
    private int dato=0;
    private int con1 = 7;
    private Tablero tablero1 = new Tablero();
    protected JTextArea Visor1;
    protected JTextArea Visor2;
    private JButton Encriptar = new JButton("encriptar");
    private JButton Desencriptar = new JButton("desencriptar");
    private final static String newline = "\n";
    
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
            String linea="|||||||||||||||";
            int n=0;
            if(texto.length()<16){
                for(int m=15;m>0;m--){                
                    if ((texto.length() == m)) {
                        texto = (texto + linea.substring(0, n+1));
                        break;
                    }
                    n++;
                }
            }
//            showMessageDialog(null, "texto: " + texto);
            n=0;
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
        texto = Visor1.getText();
        while ((!texto.equals(""))) {
            extraerCaracteres();
            convertiraBinario(1);
            encriptacion(1);
        }
        texto = desencresult;
        Visor2.setText(desencresult);
        desencresult = "";
    }
    
    final void extraerCaracteres() {
        int largoTexto=texto.length();
        for(int i=0; i<largoTexto;i++){
            tamTexto = texto.length();
            letra[i] = texto.charAt(0);
            texto = texto.substring(texto.length() - (tamTexto - 1));
        }
    }
    
        final void convertiraBinario(int tipo) {
        for(int i=0; i<letra.length;i++){
            numero[i] = (int)letra[i];
        }
        switch (tipo) {
            case 0:
                for(int i=0; i<numero.length;i++){
                    DecABn(numero[i], i, 0);
                }
                break;
            case 1:
                for(int i=0; i<numero.length;i++){
                    DecABn(numero[i], i, 1);
                }                
                break;
        }
    }
    
    final void DecABn(int dec, int binNro, int tipo) {
        int res;
        con1 = 0;
        while ((con1 < 8)) {
            bin1[binNro][con1] = 0;
            bin2[binNro][con1] = 0;
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
        else {
            do{
                res = (dec % 2);
                bin2[binNro][con1] = res;
                dec = dec/2;
                con1--;
            }while(dec != 0);
        }
        con1 = 7;
    }
    
    final void encriptacion(int tipo) {
        for (int i = 0; i <= 15; i++) {
            for (int j = 0; j <= 7; j++) {
                dato = cod[i][j];
                if (dato<9){
                    index1 = 0;
                    index2 = (dato - 1);
                }else{ if(dato>8 && dato<17){
                    dato -= 8;
                    index1 = 1;
                    index2 = (dato - 1);
                }else{ if(dato>16 && dato<25){
                    dato -= 16;
                    index1 = 2;
                    index2 = (dato - 1);
                }else{ if(dato>24 && dato<33){
                    dato -= 24;
                    index1 = 3;
                    index2 = (dato - 1);
                }else{ if(dato>32 && dato<41){
                    dato -= 32;
                    index1 = 4;
                    index2 = (dato - 1);
                }else{ if(dato>40 && dato<49){
                    dato -= 40;
                    index1 = 5;
                    index2 = (dato - 1);
                }else{ if(dato>48 && dato<57){
                    dato -= 48;
                    index1 = 6;
                    index2 = (dato - 1);
                }else{ if(dato>56 && dato<65){
                    dato -= 56;
                    index1 = 7;
                    index2 = (dato - 1);
                }else{ if(dato>64 && dato<73){
                    dato -= 64;
                    index1 = 8;
                    index2 = (dato - 1);
                }else{ if(dato>72 && dato<81){
                    dato -= 72;
                    index1 = 9;
                    index2 = (dato - 1);
                }else{ if(dato>80 && dato<89){
                    dato -= 80;
                    index1 = 10;
                    index2 = (dato - 1);
                }else{ if(dato>88 && dato<97){
                    dato -= 88;
                    index1 = 11;
                    index2 = (dato - 1);
                }else{ if(dato>96 && dato<105){
                    dato -= 96;
                    index1 = 12;
                    index2 = (dato - 1);
                }else{ if(dato>104 && dato<113){
                    dato -= 104;
                    index1 = 13;
                    index2 = (dato - 1);
                }else{ if(dato>112 && dato<121){
                    dato -= 112;
                    index1 = 14;
                    index2 = (dato - 1);
                }else{ if(dato>120 && dato<129){
                    dato -= 120;
                    index1 = 15;
                    index2 = (dato - 1);
                }}}}}}}}}}}}}}}}
                switch (tipo) {
                    case 0:
                        binCod[i][j] = bin1[index1][index2];
                        break;
                    case 1:
                        binDecod[index1][index2] = bin2[i][j];
                        break;
                }
            }
        }
        switch (tipo) {
            case 0:
                for(int i=0; i<numero.length;i++){
                    numero[i] = ((binCod[i][0] * 10000000) 
                    + ((binCod[i][1] * 1000000) 
                    + ((binCod[i][2] * 100000) 
                    + ((binCod[i][3] * 10000) 
                    + ((binCod[i][4] * 1000) 
                    + ((binCod[i][5] * 100) 
                    + ((binCod[i][6] * 10) 
                    + (binCod[i][7] * 1))))))));
                }
                break;
            case 1:
                for(int i=0; i<numero.length;i++){
                    numero[i] = ((binDecod[i][0] * 10000000) 
                    + ((binDecod[i][1] * 1000000) 
                    + ((binDecod[i][2] * 100000) 
                    + ((binDecod[i][3] * 10000) 
                    + ((binDecod[i][4] * 1000) 
                    + ((binDecod[i][5] * 100) 
                    + ((binDecod[i][6] * 10) 
                    + (binDecod[i][7] * 1))))))));
                }
                break;
        }
        for(int i=0; i<numero.length;i++){
            numero[i]=BnADec(numero[i]);
        }
        for(int i=0; i<letra.length;i++){
            letra[i] = (char)numero[i];
        }
        if ((tipo == 0)) {
            for(int i=0; i<letra.length;i++){
                encresult = encresult + letra[i];
            }
        }else{
            int letraCon=0;
            for(int i=0;i<16;i++){
                if(letra[i]=='|'){
                    letraCon++;      
                }
            }
            for(int i=letra.length-1;i>letra.length-letraCon-1;i--){
                letra[i]=Character.MIN_VALUE;
            }
            for(int i=0; i<letra.length;i++){
                desencresult = desencresult + letra[i];
            }
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
        bin = reverseIt(bin);
        largo = bin.length();
        v = 0;
        for (I = 1; I <= largo; I++) {
            X = (int)(Math.pow(2, (I - 1)));
            valor=String.valueOf(bin.charAt(I - 1));
            numero=Integer.parseInt(valor);
            v = v + (numero * X);
        }
        return v;
    }
    
    final void crearBoton(JButton i, String j) {
            i.setPreferredSize(new Dimension(150, 30));
            add(i);
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
