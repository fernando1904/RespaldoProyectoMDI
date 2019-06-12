package Encriptador;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Tablero extends JPanel implements ActionListener{
    
    private int contador;
    private int contadorCod;
    private int z=0;
    private int cod2Pos=0;
    public static int cod[][] = new int[16][8]; 
    public static int codCP[][] = new int[16][8]; 
    private String linea[]=new String[129];
    private int con1 = 0;
    private int con2 = 0;
    private String clave1="";
    private String clave2="";
    private static boolean botonDesenc = true;
    public static JPanel panel1 = new JPanel();
    public static JPanel panel2 = new JPanel();
    private JButton[] boton = new JButton[128];
    private JButton guardar = new JButton("Guardar"); 
    private JButton abrirCS = new JButton("Abrir CS"); 
    private JButton abrirCP = new JButton("Abrir CP");   

    public static int[][] getCod(){
        return cod;
    }
    
    public Tablero()  {
        for (int i=0; i<boton.length;i++){
            boton[i]= new JButton(String.valueOf(i+1));
            crearBoton1(boton,i,"boton"+(i));
        }
        crearBoton2(abrirCP, "AbrirCP");
        crearBoton2(abrirCS, "AbrirCS");
        crearBoton2(guardar, "guardar");
        guardar.setEnabled(false);   
        panel1.invalidate();
        panel1.validate();
        panel1.repaint();
        panel2.invalidate();
        panel2.validate();
        panel2.repaint(); 
    }
    
    public static boolean getBotonDesenc(){
        return botonDesenc;
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Guardar")){
            guardarClave();
        }
        if (e.getActionCommand().equals("AbrirCS")){
            abrirClaveSecreta();
        }
        if (e.getActionCommand().equals("AbrirCP")){
            abrirClavePublica();
        }
        for(int i=0;i<128;i++){
            if (e.getActionCommand().equals("boton"+i)){
            cod[con1][con2] = i+1;
            procesoBotonCS(boton,i);
            Contadores();
            }
        }      
    }
    
    final void Contadores() {
        contadorCod++;
        if (contadorCod % 8 == 0) {
            // contadorCod = 0
            contador++;
        }
        con2++;
        if (con1==15 && con2==8){
            guardar.setEnabled(true);
        }
        if ((con2 == 8)) {
            con2 = 0;
            con1++;
        }
    }
    
    final void procesoBotonCP(JButton[] i, int k) {
        i[k].setBackground(Color.DARK_GRAY);
        i[k].setText("?");
        i[k].setEnabled(false);
    }
    
    final void procesoBotonCS(JButton[] i, int k) {
        switch (contador) {
            case 0:
                i[k].setBackground(Color.green);
                break;
            case 1:
                i[k].setBackground(Color.red);
                break;
            case 2:
                i[k].setBackground(Color.yellow);
                break;
            case 3:
                i[k].setBackground(Color.blue);
                break;
            case 4:
                i[k].setBackground(Color.GRAY);
                break;
            case 5:
                i[k].setBackground(Color.getHSBColor(40, 250, 140));
                break;
            case 6:
                i[k].setBackground(Color.getHSBColor(140, 140, 40));
                break;
            case 7:
                i[k].setBackground(Color.getHSBColor(52, 247, 191));
                break;
            case 8:
                i[k].setBackground(Color.BLACK);
                break;
            case 9:
                i[k].setBackground(Color.PINK);
                break;
            case 10:
                i[k].setBackground(Color.ORANGE);
                break;
            case 11:
                i[k].setBackground(Color.WHITE);
                break;
            case 12:
                i[k].setBackground(Color.CYAN);
                break;
            case 13:
                i[k].setBackground(Color.MAGENTA);
                break;
            case 14:
                i[k].setBackground(Color.lightGray);
                break;
            case 15:
                i[k].setBackground(Color.DARK_GRAY);
                break;
        }
        i[k].setText(String.valueOf(contadorCod + 1));
        i[k].setEnabled(false);
    }
    
    final void crearBoton1(JButton[] i, int k, String j) {
        i[k].setName("k");
        i[k].setPreferredSize(new Dimension(1, 20));
        panel1.add(i[k]);                
        i[k].setActionCommand(j);
        i[k].addActionListener(this);       
    }
    
    final void crearBoton2(JButton i, String j) {    
        i.setPreferredSize(new Dimension(150, 30));
        panel2.add(i);
        i.setActionCommand(j);
        i.addActionListener(this);
    }
    
    public void guardarClave(){
        try {
            JFileChooser file=new JFileChooser();
            file.setAcceptAllFileFilterUsed(false);
            FileFilter filter = new FileNameExtensionFilter("Archivos KEY","key");
            file.addChoosableFileFilter(filter);
            file.showSaveDialog(this);
            File guarda = file.getSelectedFile();
            Properties clavePrivada = new Properties();
            z=1;
            for(int i=0; i<cod.length;i++){
                for(int j=0; j<cod[0].length;j++){
                    clavePrivada.setProperty(String.valueOf(z), String.valueOf(cod[i][j]));
                    z++;
                }
            }
            z=0;
            if(guarda.getName().endsWith(".key")){
                FileOutputStream out = new FileOutputStream(guarda);
                clavePrivada.store(out, null);
                out.close();
            }else{
                FileOutputStream out = new FileOutputStream(guarda + ".key");
                clavePrivada.store(out, null);
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        crearCofre();
    }
    
    public void abrirClaveSecreta(){   
         try {
            JFileChooser file=new JFileChooser();
            file.setAcceptAllFileFilterUsed(false);
            FileFilter filter = new FileNameExtensionFilter("Archivos KEY","key");
            file.addChoosableFileFilter(filter);
            file.showOpenDialog(this);
            File abre=file.getSelectedFile();
            Properties clavePrivada = new Properties();
            FileInputStream in = new FileInputStream(abre);
            clavePrivada.load(in);
            in.close();
            for (String key : clavePrivada.stringPropertyNames()) {
                    String value = clavePrivada.getProperty(key);
                    cargarClave(Integer.parseInt(key), Integer.parseInt(value), 's');
            } 
            guardar.setEnabled(true);
            botonDesenc=true;
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
    
    public void crearCofre(){
        String clave="";
        int contp=1;
        String llaveCofre="";
        String textoEncCofre="";
        Cofre cofre = new Cofre();
        llaveCofre=JOptionPane.showInputDialog("Ingrese frase para cofre de Clave Publica: ");
        cofre.setFrase(llaveCofre);
        codCP=cofre.Cofretizar();
        Encriptar enc1 =new Encriptar();
        for(int i=0; i<cod.length; i++){
            for (int j=0; j<cod[0].length; j++){
                if (contp==1){
                    clave = String.valueOf(cod[i][j]);
                }else{
                    clave += " " + cod[i][j];                
                }
                contp++;
            }
        }
        contp=0;
        enc1.setCod(codCP);
        textoEncCofre=enc1.Encriptando(clave);
//        JOptionPane.showMessageDialog(this, textoEncCofre); 
//        JOptionPane.showMessageDialog(this, clave);
        try {
            JFileChooser file=new JFileChooser();
            file.setAcceptAllFileFilterUsed(false);
            FileFilter filter = new FileNameExtensionFilter("Archivos COFRE","cofre");
            file.addChoosableFileFilter(filter);
            file.showSaveDialog(this);
            File guarda = file.getSelectedFile();
            if(guarda.getName().endsWith(".cofre")){
                FileWriter escribir=new FileWriter(guarda,false);
                escribir.write(textoEncCofre);
                escribir.close();
//                JOptionPane.showMessageDialog(this, "1");
            }else{
                FileWriter escribir=new FileWriter(guarda + ".cofre",false);
                escribir.write(textoEncCofre);
                escribir.close();
//                JOptionPane.showMessageDialog(this, "2");
            }
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
    
    public void abrirClavePublica(){   
        JFileChooser file=new JFileChooser();
        file.setAcceptAllFileFilterUsed(false);
        FileFilter filter = new FileNameExtensionFilter("Archivos COFRE","cofre");
        file.addChoosableFileFilter(filter);
        file.showOpenDialog(this);
        File abre=file.getSelectedFile();
        File archivo = null;
        FileReader fr1 = null;
        FileReader fr2 = null;
        BufferedReader br1 = null;
        BufferedReader br2 = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            fr1 = new FileReader (abre);
            br1 = new BufferedReader(fr1);
            fr2 = new FileReader (abre);
            br2 = new BufferedReader(fr2);
            // Lectura del fichero
            String sCadena;
            long lNumeroLineas = 0;
            while ((sCadena = br1.readLine())!=null) {
                lNumeroLineas++;
            }
            for(int i=0;i<lNumeroLineas;i++){
                linea[i]=br2.readLine();
            }
            for(int i=0;i<lNumeroLineas;i++){
                if(clave1.equals("")){
                    clave1=linea[i];
                }else{
                    clave1=clave1+linea[i];
                }
            }
//            JOptionPane.showMessageDialog(this, textoDesencCofre);
         }
        catch(Exception e){
           e.printStackTrace();
        }finally{
           // En el finally cerramos el fichero, para asegurarnos
           // que se cierra tanto si todo va bien como si salta 
           // una excepcion.
           try{
              if( null != fr1 ){
                 fr1.close();
              }
              if( null != fr2 ){
                 fr2.close();
              }
           }catch (Exception e2){
              e2.printStackTrace();
           }
        }
        abrirCofre();
        guardar.setEnabled(false);
    }
    
    public void abrirCofre(){
        String clave="";
        int contp=1;
        String llaveCofre="";
        String textoDesencCofre="";
        Cofre cofre =new Cofre();
        llaveCofre=JOptionPane.showInputDialog("Ingrese frase para cofre de Clave Publica: ");
        cofre.setFrase(llaveCofre);
        codCP=cofre.Cofretizar();
        Encriptar enc1 =new Encriptar();
        enc1.setCod(codCP);
        textoDesencCofre=enc1.Desencriptando(clave1);
//        JOptionPane.showMessageDialog(this, textoDesencCofre);
        preCargaCP(textoDesencCofre);
        botonDesenc=false;
    }
    
    private void preCargaCP(String textoDesenc){
        int tamTexto;
        int m=0;
        int cPreCarga=1;
        int g=0;
        char numeroChar=Character.MIN_VALUE;
        String textoNumero="";
        int largoTexto=textoDesenc.length();
        for(int i=0; i<cod.length; i++){
            for(int j=0; j<cod[0].length; j++){
                while(m<largoTexto){
                    if(textoDesenc.charAt(m)!=' '){
                        tamTexto = textoDesenc.length();
                        numeroChar = textoDesenc.charAt(m);
                    
                        textoNumero += numeroChar;
                   
                        m++;
                    }else{
                        break;
                    }
                }
                m++;
//                System.out.println(textoNumero);
                cod[i][j]=(int)Double.parseDouble(textoNumero); 
                textoNumero="";
            }
        }
        m=0;
        for(int i=0; i<cod.length; i++){
            for(int j=0; j<cod[0].length; j++){   
                cargarClave(cPreCarga, cod[i][j], 'p');
                cPreCarga++;
            }
        }
    }
    
    public void cargarClave(int key, int value, char clave){
        contador=0;
        if (key<9){
            contador=0;
            cod2Pos=key;
        }else{ if(key>8 && key<17){
            contador=1;
            cod2Pos=key-8;
        }else{ if(key>16 && key<25){
            contador=2;
            cod2Pos=key-16;
        }else{ if(key>24 && key<33){
            contador=3;
            cod2Pos=key-24;
        }else{ if(key>32 && key<41){
            contador=4;
            cod2Pos=key-32;
        }else{ if(key>40 && key<49){
            contador=5;
            cod2Pos=key-40;
        }else{ if(key>48 && key<57){
            contador=6;
            cod2Pos=key-48;
        }else{ if(key>56 && key<65){
            contador=7;
            cod2Pos=key-56;
        }else{ if(key>64 && key<73){
            contador=8;
            cod2Pos=key-64;
        }else{ if(key>72 && key<81){
            contador=9;
            cod2Pos=key-72;
        }else{ if(key>80 && key<89){
            contador=10;
            cod2Pos=key-80;
        }else{ if(key>88 && key<97){
            contador=11;
            cod2Pos=key-88;
        }else{ if(key>96 && key<105){
            contador=12;
            cod2Pos=key-96;
        }else{ if(key>104 && key<113){
            contador=13;
            cod2Pos=key-104;
        }else{ if(key>112 && key<121){
            contador=14;
            cod2Pos=key-112;
        }else{ if(key>120 && key<129){
            contador=15;
            cod2Pos=key-120;
        }}}}}}}}}}}}}}}}
        procesoBotonCS(boton,value-1);
        if(clave=='s'){
            procesoBotonCS(boton,value-1);
            boton[value-1].setText(String.valueOf(key));
        }else{
            procesoBotonCP(boton,value-1);
            boton[value-1].setText("?");
        }
        cod[contador][cod2Pos-1]=value;
     }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Encriptador");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600, 500); 
        frame.setVisible(true);
        frame.getContentPane().setLayout(new GridBagLayout());
        JScrollPane scrollPane1 = new JScrollPane(panel1);
        JScrollPane scrollPane2 = new JScrollPane(panel2);
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0; 
        GridBagConstraints d = new GridBagConstraints();
        d.gridwidth = GridBagConstraints.REMAINDER;
        d.fill = GridBagConstraints.BOTH;
        d.weightx = 0.1;
        d.weighty = 0.1;
        frame.add(scrollPane1, c);
        frame.add(scrollPane2, d);
        panel1.setLayout(new GridLayout(16,8));
        panel2.setLayout(new GridBagLayout());  
        frame.invalidate();
        frame.validate();
        frame.repaint();
    }

    public static void iniciar() {
        createAndShowGUI();
    }
}