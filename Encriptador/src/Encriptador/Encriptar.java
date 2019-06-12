package Encriptador;

public class Encriptar {
    private String encresult="";
    private String desencresult="";
    private static int cod[][] = new int[16][8];
    private int bin1[][] = new int[16][8];
    private int bin2[][] = new int[16][8];
    private int binCod[][] = new int[16][8];
    private int binDecod[][] = new int[16][8];
    private String letra[]=new String[16];
    private int numero[]=new int[16];
    private int index1=0;
    private int index2=0;
    private String texto="";
    private String textoT="";
    private int tamTexto;
    private int dato=0;
    private int con1 = 7;
    private final static String newline = "\n";
    public Encriptar(){
    }
    public String Encriptando(String textoE) {
        this.textoT=textoE;
        if (encresult.equals("")) {
            texto = textoT;
        }
        while ((!texto.equals(""))) {
            String linea="|||||||||||||||";
            int n=0;
//            JOptionPane.showMessageDialog(new JPanel(),texto.length());
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
            this.extraerCaracteres('e');
            this.convertiraBinario(0);
            this.encriptacion(0);
        }
        texto = encresult;
        encresult="";
        return texto;
    }
    public String Desencriptando(String textoE) {
        this.textoT=textoE;
        texto = textoT;
        while ((!texto.equals(""))) {
            extraerCaracteres('d');
            convertiraBinario(1);
            encriptacion(1);
        }
        texto = desencresult;
        desencresult = "";
        return texto;
    }
    private void extraerCaracteres(char tipo) {
        int largoTexto=texto.length();
        boolean paso =true;
        String linea="|||||||||||||||";
        
        switch(tipo){
            case 'e':
        //      JOptionPane.showMessageDialog(new JPanel(), texto);
                for(int i=0; i<16;i++){
                    int n=0;
        //      JOptionPane.showMessageDialog(new JPanel(),texto.length());
                    if(paso){
                    if(texto.length()<16){
                        for(int m=15;m>0;m--){                
                            if ((texto.length() == m)) {
                                texto = (texto + linea.substring(0, n+1));
                                break;
                            }
                            n++;
                        }
                    }
                    paso=false;
                    }
                    tamTexto = texto.length();
                    letra[i] = String.valueOf(texto.charAt(0));
                    texto = texto.substring(texto.length() - (tamTexto - 1));
                }
                break;
            case 'd':
        //      JOptionPane.showMessageDialog(new JPanel(), texto);
                
                for(int i=0; i<16;i++){
                    int n=0;
        //      JOptionPane.showMessageDialog(new JPanel(),texto.length());
                    if(paso){
                        if(texto.length()<16){
                            for(int m=15;m>0;m--){                
                                if ((texto.length() == m)) {
                                    texto = (texto + linea.substring(0, n+1));
                                    break;
                                }
                                n++;
                            }
                        }
                    paso=false;
                    }
                    tamTexto = texto.length();
//                    System.out.println(texto);
                    if(texto.length() > 15){
                    if (texto.substring(0,16).equals("||||||||KEY9KEY9")){
                        letra[i]=String.valueOf((char)0);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||||KEY6KEY6")){
                        letra[i]=String.valueOf((char)1);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||||KEY2KEY2")){
                        letra[i]=String.valueOf((char)2);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY22KEY22")){
                        letra[i]=String.valueOf((char)3);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||||KEY5KEY5")){
                        letra[i]=String.valueOf((char)4);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY17KEY17")){
                        letra[i]=String.valueOf((char)5);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY24KEY24")){
                        letra[i]=String.valueOf((char)6);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||||KEY7KEY7")){
                        letra[i]=String.valueOf((char)7);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY20KEY20")){
                        letra[i]=String.valueOf((char)8);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY13KEY13")){
                        letra[i]=String.valueOf((char)9);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY15KEY15")){
                        letra[i]=String.valueOf((char)10);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||||KEY4KEY4")){
                        letra[i]=String.valueOf((char)11);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY28KEY28")){
                        letra[i]=String.valueOf((char)12);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY32KEY32")){
                        letra[i]=String.valueOf((char)13);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY11KEY11")){
                        letra[i]=String.valueOf((char)14);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY19KEY19")){
                        letra[i]=String.valueOf((char)15);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||||KEY1KEY1")){
                        letra[i]=String.valueOf((char)16);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||||KEY3KEY3")){
                        letra[i]=String.valueOf((char)17);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY29KEY29")){
                        letra[i]=String.valueOf((char)18);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY10KEY10")){
                        letra[i]=String.valueOf((char)19);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY27KEY27")){
                        letra[i]=String.valueOf((char)20);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY18KEY18")){
                        letra[i]=String.valueOf((char)21);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY14KEY14")){
                        letra[i]=String.valueOf((char)22);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY21KEY21")){
                        letra[i]=String.valueOf((char)23);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY33KEY33")){
                        letra[i]=String.valueOf((char)24);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY26KEY26")){
                        letra[i]=String.valueOf((char)25);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY16KEY16")){
                        letra[i]=String.valueOf((char)26);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY30KEY30")){
                        letra[i]=String.valueOf((char)27);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY12KEY12")){
                        letra[i]=String.valueOf((char)28);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||||KEY8KEY8")){
                        letra[i]=String.valueOf((char)29);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY31KEY31")){
                        letra[i]=String.valueOf((char)30);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY25KEY25")){
                        letra[i]=String.valueOf((char)31);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{ if (texto.substring(0,16).equals("||||||KEY23KEY23")){
                        letra[i]=String.valueOf((char)127);
                        texto = texto.substring(texto.length() - (tamTexto - 16));
                    }else{
                        tamTexto = texto.length();
                        letra[i] = String.valueOf(texto.charAt(0));
                        texto = texto.substring(texto.length() - (tamTexto - 1));
                    }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
                }else{
                    tamTexto = texto.length();
                    letra[i] = String.valueOf(texto.charAt(0));
                    texto = texto.substring(texto.length() - (tamTexto - 1));   
                }
                }
            break;
        }

    } 
    private void convertiraBinario(int tipo) {
        for(int i=0; i<letra.length;i++){
            numero[i] = (int)letra[i].charAt(0);
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
    private void DecABn(int dec, int binNro, int tipo) {
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
    private void encriptacion(int tipo) { 
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
            letra[i] = String.valueOf((char)numero[i]);
        }
        if ((tipo == 0)) {
            for(int i=0; i<letra.length;i++){
                switch((int)letra[i].charAt(0)){
                    case 0:
                        letra[i]="||||||||KEY9KEY9";
                        break;
                    case 1:
                        letra[i]="||||||||KEY6KEY6";
                        break;
                    case 2:
                        letra[i]="||||||||KEY2KEY2";
                        break;
                    case 3:
                        letra[i]="||||||KEY22KEY22";
                        break;
                    case 4:
                        letra[i]="||||||||KEY5KEY5";
                        break;
                    case 5:
                        letra[i]="||||||KEY17KEY17";
                        break;
                    case 6:
                        letra[i]="||||||KEY24KEY24";
                        break;
                    case 7:
                        letra[i]="||||||||KEY7KEY7";
                        break;
                    case 8:
                        letra[i]="||||||KEY20KEY20";
                        break;
                    case 9:
                        letra[i]="||||||KEY13KEY13";
                        break;
                    case 10:
                        letra[i]="||||||KEY15KEY15";
                        break;
                    case 11:
                        letra[i]="||||||||KEY4KEY4";
                        break;
                    case 12:
                        letra[i]="||||||KEY28KEY28";
                        break;
                    case 13:
                        letra[i]="||||||KEY32KEY32";
                        break;
                    case 14:
                        letra[i]="||||||KEY11KEY11";
                        break;
                    case 15:
                        letra[i]="||||||KEY19KEY19";
                        break;
                    case 16:
                        letra[i]="||||||||KEY1KEY1";
                        break;
                    case 17:
                        letra[i]="||||||||KEY3KEY3";
                        break;
                    case 18:
                        letra[i]="||||||KEY29KEY29";
                        break;
                    case 19:
                        letra[i]="||||||KEY10KEY10";
                        break;
                    case 20:
                        letra[i]="||||||KEY27KEY27";
                        break;
                    case 21:
                        letra[i]="||||||KEY18KEY18";
                        break;
                    case 22:
                        letra[i]="||||||KEY14KEY14";
                        break;
                    case 23:
                        letra[i]="||||||KEY21KEY21";
                        break;
                    case 24:
                        letra[i]="||||||KEY33KEY33";
                        break;
                    case 25:
                        letra[i]="||||||KEY26KEY26";
                        break;
                    case 26:
                        letra[i]="||||||KEY16KEY16";
                        break;
                    case 27:
                        letra[i]="||||||KEY30KEY30";
                        break;
                    case 28:
                        letra[i]="||||||KEY12KEY12";
                        break;
                    case 29:
                        letra[i]="||||||||KEY8KEY8";
                        break;
                    case 30:
                        letra[i]="||||||KEY31KEY31";
                        break;
                    case 31:
                        letra[i]="||||||KEY25KEY25";
                        break;
                    case 127:
                        letra[i]="||||||KEY23KEY23";
                        break;
                }
                encresult = encresult + letra[i];
            }
        }else{
            int letraCon=0;
            for(int i=0;i<16;i++){
                if(letra[i].charAt(0)=='|'){
                    letraCon++;      
                }
            }
            for(int i=letra.length-1;i>letra.length-letraCon-1;i--){
                letra[i]="";
            }
            for(int i=0; i<letra.length;i++){
                desencresult = desencresult + letra[i];
            }
        }
    }
    private static String reverseIt(String source) {
    int i, len = source.length();
    StringBuilder dest = new StringBuilder(len);

    for (i = (len - 1); i >= 0; i--){
        dest.append(source.charAt(i));
    }
    return dest.toString();
    }
    private int BnADec(int v) {
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
    public void setCod(int[][] cod){
        this.cod=cod;
    }
}
