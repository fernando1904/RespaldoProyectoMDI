
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
    private char char1;
    private char char2;
    private char char3;
    private char char4;
    private char char5;
    private char char6;
    private char char7;
    private char char8;
    private char char9;
    private char char10;
    private char char11;
    private char char12;
    private char char13;
    private char char14;
    private char char15;
    private char char16;
    private int v1=0;
    private int v2=0;
    private int v3=0;
    private int v4=0;
    private int v5=0;
    private int v6=0;
    private int v7=0;
    private int v8=0;
    private int v9=0;
    private int v10=0;
    private int v11=0;
    private int v12=0;
    private int v13=0;
    private int v14=0;
    private int v15=0;
    private int v16=0;
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
        char5 = texto.charAt(0);
        texto = texto.substring(texto.length() - (tamTexto - 1));
        tamTexto = texto.length();
        char6 = texto.charAt(0);
        texto = texto.substring(texto.length() - (tamTexto - 1));
        tamTexto = texto.length();
        char7 = texto.charAt(0);
        texto = texto.substring(texto.length() - (tamTexto - 1));
        tamTexto = texto.length();
        char8 = texto.charAt(0);
        texto = texto.substring(texto.length() - (tamTexto - 1));
        tamTexto = texto.length();
        char9 = texto.charAt(0);
        texto = texto.substring(texto.length() - (tamTexto - 1));
        tamTexto = texto.length();
        char10 = texto.charAt(0);
        texto = texto.substring(texto.length() - (tamTexto - 1));
        tamTexto = texto.length();
        char11 = texto.charAt(0);
        texto = texto.substring(texto.length() - (tamTexto - 1));
        tamTexto = texto.length();
        char12 = texto.charAt(0);
        texto = texto.substring(texto.length() - (tamTexto - 1));
        tamTexto = texto.length();
        char13 = texto.charAt(0);
        texto = texto.substring(texto.length() - (tamTexto - 1));
        tamTexto = texto.length();
        char14 = texto.charAt(0);
        texto = texto.substring(texto.length() - (tamTexto - 1));
        tamTexto = texto.length();
        char15 = texto.charAt(0);
        texto = texto.substring(texto.length() - (tamTexto - 1));
        tamTexto = texto.length();
        char16 = texto.charAt(0);
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
        v5 = (int)char5;
        v6 = (int)char6;
        v7 = (int)char7;
        v8 = (int)char8;
        v9 = (int)char9;
        v10 = (int)char10;
        v11 = (int)char11;
        v12 = (int)char12;
        v13 = (int)char13;
        v14 = (int)char14;
        v15 = (int)char15;
        v16 = (int)char16;
        switch (tipo) {
            case 0:
                DecABn(v1, 0, 0);
                DecABn(v2, 1, 0);
                DecABn(v3, 2, 0);
                DecABn(v4, 3, 0);
                DecABn(v5, 4, 0);
                DecABn(v6, 5, 0);
                DecABn(v7, 6, 0);
                DecABn(v8, 7, 0);
                DecABn(v9, 8, 0);
                DecABn(v10, 9, 0);
                DecABn(v11, 10, 0);
                DecABn(v12, 11, 0);
                DecABn(v13, 12, 0);
                DecABn(v14, 13, 0);
                DecABn(v15, 14, 0);
                DecABn(v16, 15, 0);
                break;
            case 1:
                DecABn(v1, 0, 1);
                DecABn(v2, 1, 1);
                DecABn(v3, 2, 1);
                DecABn(v4, 3, 1);
                DecABn(v5, 4, 1);
                DecABn(v6, 5, 1);
                DecABn(v7, 6, 1);
                DecABn(v8, 7, 1);
                DecABn(v9, 8, 1);
                DecABn(v10, 9, 1);
                DecABn(v11, 10, 1);
                DecABn(v12, 11, 1);
                DecABn(v13, 12, 1);
                DecABn(v14, 13, 1);
                DecABn(v15, 14, 1);
                DecABn(v16, 15, 1);
                
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
//        showMessageDialog(null, bin1[0][0] + " " + bin1[0][1] + " " + bin1[0][2] + " " + bin1[0][3] + " " + bin1[0][4] + " " + bin1[0][5] + " " + bin1[0][6] + " " + bin1[0][7]);
        
                for (int i = 0; i <= 15; i++) {
                    for (int j = 0; j <= 7; j++) {
                        dato = cod[i][j];
                        // MsgBox("Dato: " & dato)
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
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                                dato -= 32;
                                index1 = 4;
                                index2 = (dato - 1);
                                break;
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                                dato -= 40;
                                index1 = 5;
                                index2 = (dato - 1);
                                break;
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                                dato -= 48;
                                index1 = 6;
                                index2 = (dato - 1);
                                break;
                            case 57:
                            case 58:
                            case 59:
                            case 60:
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                                dato -= 56;
                                index1 = 7;
                                index2 = (dato - 1);
                                break;
                            case 65:
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                            case 71:
                            case 72:
                                dato -= 64;
                                index1 = 8;
                                index2 = (dato - 1);
                                break;
                            case 73:
                            case 74:
                            case 75:
                            case 76:
                            case 77:
                            case 78:
                            case 79:
                            case 80:
                                dato -= 72;
                                index1 = 9;
                                index2 = (dato - 1);
                                break;
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                            case 86:
                            case 87:
                            case 88:
                                dato -= 80;
                                index1 = 10;
                                index2 = (dato - 1);
                                break;
                            case 89:
                            case 90:
                            case 91:
                            case 92:
                            case 93:
                            case 94:
                            case 95:
                            case 96:
                                dato -= 88;
                                index1 = 11;
                                index2 = (dato - 1);
                                break;
                            case 97:
                            case 98:
                            case 99:
                            case 100:
                            case 101:
                            case 102:
                            case 103:
                            case 104:
                                dato -= 96;
                                index1 = 12;
                                index2 = (dato - 1);
                                break;
                            case 105:
                            case 106:
                            case 107:
                            case 108:
                            case 109:
                            case 110:
                            case 111:
                            case 112:
                                dato -= 104;
                                index1 = 13;
                                index2 = (dato - 1);
                                break;
                            case 113:
                            case 114:
                            case 115:
                            case 116:
                            case 117:
                            case 118:
                            case 119:
                            case 120:
                                dato -= 112;
                                index1 = 14;
                                index2 = (dato - 1);
                                break;
                            case 121:
                            case 122:
                            case 123:
                            case 124:
                            case 125:
                            case 126:
                            case 127:
                            case 128:
                                dato -= 120;
                                index1 = 15;
                                index2 = (dato - 1);
                                break;
                        }
                        switch (tipo) {
                            case 0:
                                binCod[i][j] = bin1[index1][index2];
                                break;
                            case 1:
                                binDecod[index1][index2] = bin2[i][j];
                                break;
                        }
                                
                        // MsgBox("binCod: " & binCod(i, j))
                    }
                    
                }
                switch (tipo) {
                    case 0:
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
                        v5 = ((binCod[4][0] * 10000000) 
                                    + ((binCod[4][1] * 1000000) 
                                    + ((binCod[4][2] * 100000) 
                                    + ((binCod[4][3] * 10000) 
                                    + ((binCod[4][4] * 1000) 
                                    + ((binCod[4][5] * 100) 
                                    + ((binCod[4][6] * 10) 
                                    + (binCod[4][7] * 1))))))));
                        v6 = ((binCod[5][0] * 10000000) 
                                    + ((binCod[5][1] * 1000000) 
                                    + ((binCod[5][2] * 100000) 
                                    + ((binCod[5][3] * 10000) 
                                    + ((binCod[5][4] * 1000) 
                                    + ((binCod[5][5] * 100) 
                                    + ((binCod[5][6] * 10) 
                                    + (binCod[5][7] * 1))))))));
                        v7 = ((binCod[6][0] * 10000000) 
                                    + ((binCod[6][1] * 1000000) 
                                    + ((binCod[6][2] * 100000) 
                                    + ((binCod[6][3] * 10000) 
                                    + ((binCod[6][4] * 1000) 
                                    + ((binCod[6][5] * 100) 
                                    + ((binCod[6][6] * 10) 
                                    + (binCod[6][7] * 1))))))));
                        v8 = ((binCod[7][0] * 10000000) 
                                    + ((binCod[7][1] * 1000000) 
                                    + ((binCod[7][2] * 100000) 
                                    + ((binCod[7][3] * 10000) 
                                    + ((binCod[7][4] * 1000) 
                                    + ((binCod[7][5] * 100) 
                                    + ((binCod[7][6] * 10) 
                                    + (binCod[7][7] * 1))))))));
                        v9 = ((binCod[8][0] * 10000000) 
                                    + ((binCod[8][1] * 1000000) 
                                    + ((binCod[8][2] * 100000) 
                                    + ((binCod[8][3] * 10000) 
                                    + ((binCod[8][4] * 1000) 
                                    + ((binCod[8][5] * 100) 
                                    + ((binCod[8][6] * 10) 
                                    + (binCod[8][7] * 1))))))));
                        v10 = ((binCod[9][0] * 10000000) 
                                    + ((binCod[9][1] * 1000000) 
                                    + ((binCod[9][2] * 100000) 
                                    + ((binCod[9][3] * 10000) 
                                    + ((binCod[9][4] * 1000) 
                                    + ((binCod[9][5] * 100) 
                                    + ((binCod[9][6] * 10) 
                                    + (binCod[9][7] * 1))))))));
                        v11 = ((binCod[10][0] * 10000000) 
                                    + ((binCod[10][1] * 1000000) 
                                    + ((binCod[10][2] * 100000) 
                                    + ((binCod[10][3] * 10000) 
                                    + ((binCod[10][4] * 1000) 
                                    + ((binCod[10][5] * 100) 
                                    + ((binCod[10][6] * 10) 
                                    + (binCod[10][7] * 1))))))));
                        v12 = ((binCod[11][0] * 10000000) 
                                    + ((binCod[11][1] * 1000000) 
                                    + ((binCod[11][2] * 100000) 
                                    + ((binCod[11][3] * 10000) 
                                    + ((binCod[11][4] * 1000) 
                                    + ((binCod[11][5] * 100) 
                                    + ((binCod[11][6] * 10) 
                                    + (binCod[11][7] * 1))))))));
                        v13 = ((binCod[12][0] * 10000000) 
                                    + ((binCod[12][1] * 1000000) 
                                    + ((binCod[12][2] * 100000) 
                                    + ((binCod[12][3] * 10000) 
                                    + ((binCod[12][4] * 1000) 
                                    + ((binCod[12][5] * 100) 
                                    + ((binCod[12][6] * 10) 
                                    + (binCod[12][7] * 1))))))));
                        v14 = ((binCod[13][0] * 10000000) 
                                    + ((binCod[13][1] * 1000000) 
                                    + ((binCod[13][2] * 100000) 
                                    + ((binCod[13][3] * 10000) 
                                    + ((binCod[13][4] * 1000) 
                                    + ((binCod[13][5] * 100) 
                                    + ((binCod[13][6] * 10) 
                                    + (binCod[13][7] * 1))))))));
                        v15 = ((binCod[14][0] * 10000000) 
                                    + ((binCod[14][1] * 1000000) 
                                    + ((binCod[14][2] * 100000) 
                                    + ((binCod[14][3] * 10000) 
                                    + ((binCod[14][4] * 1000) 
                                    + ((binCod[14][5] * 100) 
                                    + ((binCod[14][6] * 10) 
                                    + (binCod[14][7] * 1))))))));
                        v16 = ((binCod[15][0] * 10000000) 
                                    + ((binCod[15][1] * 1000000) 
                                    + ((binCod[15][2] * 100000) 
                                    + ((binCod[15][3] * 10000) 
                                    + ((binCod[15][4] * 1000) 
                                    + ((binCod[15][5] * 100) 
                                    + ((binCod[15][6] * 10) 
                                    + (binCod[15][7] * 1))))))));
                        break;
                    case 1:
                        v1 = ((binDecod[0][0] * 10000000) 
                                    + ((binDecod[0][1] * 1000000) 
                                    + ((binDecod[0][2] * 100000) 
                                    + ((binDecod[0][3] * 10000) 
                                    + ((binDecod[0][4] * 1000) 
                                    + ((binDecod[0][5] * 100) 
                                    + ((binDecod[0][6] * 10) 
                                    + (binDecod[0][7] * 1))))))));
                        v2 = ((binDecod[1][0] * 10000000) 
                                    + ((binDecod[1][1] * 1000000) 
                                    + ((binDecod[1][2] * 100000) 
                                    + ((binDecod[1][3] * 10000) 
                                    + ((binDecod[1][4] * 1000) 
                                    + ((binDecod[1][5] * 100) 
                                    + ((binDecod[1][6] * 10) 
                                    + (binDecod[1][7] * 1))))))));
                        v3 = ((binDecod[2][0] * 10000000) 
                                    + ((binDecod[2][1] * 1000000) 
                                    + ((binDecod[2][2] * 100000) 
                                    + ((binDecod[2][3] * 10000) 
                                    + ((binDecod[2][4] * 1000) 
                                    + ((binDecod[2][5] * 100) 
                                    + ((binDecod[2][6] * 10) 
                                    + (binDecod[2][7] * 1))))))));
                        v4 = ((binDecod[3][0] * 10000000) 
                                    + ((binDecod[3][1] * 1000000) 
                                    + ((binDecod[3][2] * 100000) 
                                    + ((binDecod[3][3] * 10000) 
                                    + ((binDecod[3][4] * 1000) 
                                    + ((binDecod[3][5] * 100) 
                                    + ((binDecod[3][6] * 10) 
                                    + (binDecod[3][7] * 1))))))));
                        v5 = ((binDecod[4][0] * 10000000) 
                                    + ((binDecod[4][1] * 1000000) 
                                    + ((binDecod[4][2] * 100000) 
                                    + ((binDecod[4][3] * 10000) 
                                    + ((binDecod[4][4] * 1000) 
                                    + ((binDecod[4][5] * 100) 
                                    + ((binDecod[4][6] * 10) 
                                    + (binDecod[4][7] * 1))))))));
                        v6 = ((binDecod[5][0] * 10000000) 
                                    + ((binDecod[5][1] * 1000000) 
                                    + ((binDecod[5][2] * 100000) 
                                    + ((binDecod[5][3] * 10000) 
                                    + ((binDecod[5][4] * 1000) 
                                    + ((binDecod[5][5] * 100) 
                                    + ((binDecod[5][6] * 10) 
                                    + (binDecod[5][7] * 1))))))));
                        v7 = ((binDecod[6][0] * 10000000) 
                                    + ((binDecod[6][1] * 1000000) 
                                    + ((binDecod[6][2] * 100000) 
                                    + ((binDecod[6][3] * 10000) 
                                    + ((binDecod[6][4] * 1000) 
                                    + ((binDecod[6][5] * 100) 
                                    + ((binDecod[6][6] * 10) 
                                    + (binDecod[6][7] * 1))))))));
                        v8 = ((binDecod[7][0] * 10000000) 
                                    + ((binDecod[7][1] * 1000000) 
                                    + ((binDecod[7][2] * 100000) 
                                    + ((binDecod[7][3] * 10000) 
                                    + ((binDecod[7][4] * 1000) 
                                    + ((binDecod[7][5] * 100) 
                                    + ((binDecod[7][6] * 10) 
                                    + (binDecod[7][7] * 1))))))));
                        v9 = ((binDecod[8][0] * 10000000) 
                                    + ((binDecod[8][1] * 1000000) 
                                    + ((binDecod[8][2] * 100000) 
                                    + ((binDecod[8][3] * 10000) 
                                    + ((binDecod[8][4] * 1000) 
                                    + ((binDecod[8][5] * 100) 
                                    + ((binDecod[8][6] * 10) 
                                    + (binDecod[8][7] * 1))))))));
                        v10 = ((binDecod[9][0] * 10000000) 
                                    + ((binDecod[9][1] * 1000000) 
                                    + ((binDecod[9][2] * 100000) 
                                    + ((binDecod[9][3] * 10000) 
                                    + ((binDecod[9][4] * 1000) 
                                    + ((binDecod[9][5] * 100) 
                                    + ((binDecod[9][6] * 10) 
                                    + (binDecod[9][7] * 1))))))));
                        v11 = ((binDecod[10][0] * 10000000) 
                                    + ((binDecod[10][1] * 1000000) 
                                    + ((binDecod[10][2] * 100000) 
                                    + ((binDecod[10][3] * 10000) 
                                    + ((binDecod[10][4] * 1000) 
                                    + ((binDecod[10][5] * 100) 
                                    + ((binDecod[10][6] * 10) 
                                    + (binDecod[10][7] * 1))))))));
                        v12 = ((binDecod[11][0] * 10000000) 
                                    + ((binDecod[11][1] * 1000000) 
                                    + ((binDecod[11][2] * 100000) 
                                    + ((binDecod[11][3] * 10000) 
                                    + ((binDecod[11][4] * 1000) 
                                    + ((binDecod[11][5] * 100) 
                                    + ((binDecod[11][6] * 10) 
                                    + (binDecod[11][7] * 1))))))));
                        v13 = ((binDecod[12][0] * 10000000) 
                                    + ((binDecod[12][1] * 1000000) 
                                    + ((binDecod[12][2] * 100000) 
                                    + ((binDecod[12][3] * 10000) 
                                    + ((binDecod[12][4] * 1000) 
                                    + ((binDecod[12][5] * 100) 
                                    + ((binDecod[12][6] * 10) 
                                    + (binDecod[12][7] * 1))))))));
                        v14 = ((binDecod[13][0] * 10000000) 
                                    + ((binDecod[13][1] * 1000000) 
                                    + ((binDecod[13][2] * 100000) 
                                    + ((binDecod[13][3] * 10000) 
                                    + ((binDecod[13][4] * 1000) 
                                    + ((binDecod[13][5] * 100) 
                                    + ((binDecod[13][6] * 10) 
                                    + (binDecod[13][7] * 1))))))));
                        v15 = ((binDecod[14][0] * 10000000) 
                                    + ((binDecod[14][1] * 1000000) 
                                    + ((binDecod[14][2] * 100000) 
                                    + ((binDecod[14][3] * 10000) 
                                    + ((binDecod[14][4] * 1000) 
                                    + ((binDecod[14][5] * 100) 
                                    + ((binDecod[14][6] * 10) 
                                    + (binDecod[14][7] * 1))))))));
                        v16 = ((binDecod[15][0] * 10000000) 
                                    + ((binDecod[15][1] * 1000000) 
                                    + ((binDecod[15][2] * 100000) 
                                    + ((binDecod[15][3] * 10000) 
                                    + ((binDecod[15][4] * 1000) 
                                    + ((binDecod[15][5] * 100) 
                                    + ((binDecod[15][6] * 10) 
                                    + (binDecod[15][7] * 1))))))));
                        break;
                }
                
        v1=BnADec(v1);
        v2=BnADec(v2);
        v3=BnADec(v3);
        v4=BnADec(v4);
        v5=BnADec(v5);
        v6=BnADec(v6);
        v7=BnADec(v7);
        v8=BnADec(v8);
        v9=BnADec(v9);
        v10=BnADec(v10);
        v11=BnADec(v11);
        v12=BnADec(v12);
        v13=BnADec(v13);
        v14=BnADec(v14);
        v15=BnADec(v15);
        v16=BnADec(v16);
//        showMessageDialog(null, v1 + " " + v2 + " " + v3 + " " + v4);
        char1 = (char)v1;
        char2 = (char)v2;
        char3 = (char)v3;
        char4 = (char)v4;
        char5 = (char)v5;
        char6 = (char)v6;
        char7 = (char)v7;
        char8 = (char)v8;
        char9 = (char)v9;
        char10 = (char)v10;
        char11 = (char)v11;
        char12 = (char)v12;
        char13 = (char)v13;
        char14 = (char)v14;
        char15 = (char)v15;
        char16 = (char)v16;
//        showMessageDialog(null, char1 + " " + char2 + " " + char3 + " " + char4);
        if ((tipo == 0)) {
            encresult = encresult + char1 + char2 + char3 + char4 + char5 + char6 + char7 + char8 + char9 + char10 + char11 + char12 + char13 + char14 + char15 + char16;
        }
        else {
            if ( char2=='|' && char3=='|' && char4=='|' && char5=='|' && char6=='|' && char7=='|' && char8=='|' && char9=='|' && char10=='|' && char11=='|' && char12=='|' && char13=='|' && char14=='|' && char15=='|' && char16=='|'){
                char2=Character.MIN_VALUE;
                char3=Character.MIN_VALUE;
                char4=Character.MIN_VALUE;
                char5=Character.MIN_VALUE;
                char6=Character.MIN_VALUE;
                char7=Character.MIN_VALUE;
                char8=Character.MIN_VALUE;
                char9=Character.MIN_VALUE;
                char10=Character.MIN_VALUE;
                char11=Character.MIN_VALUE;
                char12=Character.MIN_VALUE;
                char13=Character.MIN_VALUE;
                char14=Character.MIN_VALUE;
                char15=Character.MIN_VALUE;
                char16=Character.MIN_VALUE;
            }
            if (char3=='|' && char4=='|' && char5=='|' && char6=='|' && char7=='|' && char8=='|' && char9=='|' && char10=='|' && char11=='|' && char12=='|' && char13=='|' && char14=='|' && char15=='|' && char16=='|'){
                char3=Character.MIN_VALUE;
                char4=Character.MIN_VALUE;
                char5=Character.MIN_VALUE;
                char6=Character.MIN_VALUE;
                char7=Character.MIN_VALUE;
                char8=Character.MIN_VALUE;
                char9=Character.MIN_VALUE;
                char10=Character.MIN_VALUE;
                char11=Character.MIN_VALUE;
                char12=Character.MIN_VALUE;
                char13=Character.MIN_VALUE;
                char14=Character.MIN_VALUE;
                char15=Character.MIN_VALUE;
                char16=Character.MIN_VALUE;
            }
            if (char4=='|' && char5=='|' && char6=='|' && char7=='|' && char8=='|' && char9=='|' && char10=='|' && char11=='|' && char12=='|' && char13=='|' && char14=='|' && char15=='|' && char16=='|'){
                char4=Character.MIN_VALUE;
                char5=Character.MIN_VALUE;
                char6=Character.MIN_VALUE;
                char7=Character.MIN_VALUE;
                char8=Character.MIN_VALUE;
                char9=Character.MIN_VALUE;
                char10=Character.MIN_VALUE;
                char11=Character.MIN_VALUE;
                char12=Character.MIN_VALUE;
                char13=Character.MIN_VALUE;
                char14=Character.MIN_VALUE;
                char15=Character.MIN_VALUE;
                char16=Character.MIN_VALUE;
            }
            if (char5=='|' && char6=='|' && char7=='|' && char8=='|' && char9=='|' && char10=='|' && char11=='|' && char12=='|' && char13=='|' && char14=='|' && char15=='|' && char16=='|'){
                char5=Character.MIN_VALUE;
                char6=Character.MIN_VALUE;
                char7=Character.MIN_VALUE;
                char8=Character.MIN_VALUE;
                char9=Character.MIN_VALUE;
                char10=Character.MIN_VALUE;
                char11=Character.MIN_VALUE;
                char12=Character.MIN_VALUE;
                char13=Character.MIN_VALUE;
                char14=Character.MIN_VALUE;
                char15=Character.MIN_VALUE;
                char16=Character.MIN_VALUE;
            }
            if (char6=='|' && char7=='|' && char8=='|' && char9=='|' && char10=='|' && char11=='|' && char12=='|' && char13=='|' && char14=='|' && char15=='|' && char16=='|'){
                char6=Character.MIN_VALUE;
                char7=Character.MIN_VALUE;
                char8=Character.MIN_VALUE;
                char9=Character.MIN_VALUE;
                char10=Character.MIN_VALUE;
                char11=Character.MIN_VALUE;
                char12=Character.MIN_VALUE;
                char13=Character.MIN_VALUE;
                char14=Character.MIN_VALUE;
                char15=Character.MIN_VALUE;
                char16=Character.MIN_VALUE;
            }
            if (char7=='|' && char8=='|' && char9=='|' && char10=='|' && char11=='|' && char12=='|' && char13=='|' && char14=='|' && char15=='|' && char16=='|'){
                char7=Character.MIN_VALUE;
                char8=Character.MIN_VALUE;
                char9=Character.MIN_VALUE;
                char10=Character.MIN_VALUE;
                char11=Character.MIN_VALUE;
                char12=Character.MIN_VALUE;
                char13=Character.MIN_VALUE;
                char14=Character.MIN_VALUE;
                char15=Character.MIN_VALUE;
                char16=Character.MIN_VALUE;
            }
            if (char8=='|' && char9=='|' && char10=='|' && char11=='|' && char12=='|' && char13=='|' && char14=='|' && char15=='|' && char16=='|'){
                char8=Character.MIN_VALUE;
                char9=Character.MIN_VALUE;
                char10=Character.MIN_VALUE;
                char11=Character.MIN_VALUE;
                char12=Character.MIN_VALUE;
                char13=Character.MIN_VALUE;
                char14=Character.MIN_VALUE;
                char15=Character.MIN_VALUE;
                char16=Character.MIN_VALUE;
            }
            if (char9=='|' && char10=='|' && char11=='|' && char12=='|' && char13=='|' && char14=='|' && char15=='|' && char16=='|'){
                char9=Character.MIN_VALUE;
                char10=Character.MIN_VALUE;
                char11=Character.MIN_VALUE;
                char12=Character.MIN_VALUE;
                char13=Character.MIN_VALUE;
                char14=Character.MIN_VALUE;
                char15=Character.MIN_VALUE;
                char16=Character.MIN_VALUE;
            }
            if (char10=='|' && char11=='|' && char12=='|' && char13=='|' && char14=='|' && char15=='|' && char16=='|'){
                char10=Character.MIN_VALUE;
                char11=Character.MIN_VALUE;
                char12=Character.MIN_VALUE;
                char13=Character.MIN_VALUE;
                char14=Character.MIN_VALUE;
                char15=Character.MIN_VALUE;
                char16=Character.MIN_VALUE;
            }
            if (char11=='|' && char12=='|' && char13=='|' && char14=='|' && char15=='|' && char16=='|'){
                char11=Character.MIN_VALUE;
                char12=Character.MIN_VALUE;
                char13=Character.MIN_VALUE;
                char14=Character.MIN_VALUE;
                char15=Character.MIN_VALUE;
                char16=Character.MIN_VALUE;
            }
            if (char12=='|' && char13=='|' && char14=='|' && char15=='|' && char16=='|'){
                char12=Character.MIN_VALUE;
                char13=Character.MIN_VALUE;
                char14=Character.MIN_VALUE;
                char15=Character.MIN_VALUE;
                char16=Character.MIN_VALUE;
            }
            if (char13=='|' && char14=='|' && char15=='|' && char16=='|'){
                char13=Character.MIN_VALUE;
                char14=Character.MIN_VALUE;
                char15=Character.MIN_VALUE;
                char16=Character.MIN_VALUE;
            }
            if (char14=='|' && char15=='|' && char16=='|'){
                char14=Character.MIN_VALUE;
                char15=Character.MIN_VALUE;
                char16=Character.MIN_VALUE;
            }
            if (char15=='|' && char16=='|'){
                char15=Character.MIN_VALUE;
                char16=Character.MIN_VALUE;
            }
            if (char16=='|'){
                char16=Character.MIN_VALUE;
            }
            desencresult = desencresult + char1 + char2 + char3 + char4 + char5 + char6 + char7 + char8 + char9 + char10 + char11 + char12 + char13 + char14 + char15 + char16;
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
