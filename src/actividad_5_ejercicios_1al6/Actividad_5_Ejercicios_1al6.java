/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_5_ejercicios_1al6;

import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Actividad_5_Ejercicios_1al6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                System.out.println("-----EJERCICIO 1------");
        @SuppressWarnings("MismatchedReadAndWriteOfArray")
        String Semana[] = new String[7];
        
           Semana [0] = "Lunes";
           Semana [1] = "Martes";
           Semana [2] = "Miercoles";
           Semana [3] = "Jueves";
           Semana [4] = "Viernes";
           Semana [5] = "Sabado";
           Semana [6] = "Domingo"; 
           
           System.out.println("-----EJERCICIO 2------");
           System.out.println("Personajes de Star Wars");
           String[] StarWars[] = new String[3][4];
           StarWars [0][0] = "Darth Maul";
           StarWars [0][1] = "Luke Skywalker";
           StarWars [0][2] = "R2-D2";
           StarWars [0][3] = "Chew";
           StarWars [1][0] = "Han Solo";
           StarWars [1][1] = "Yoda";
           StarWars [1][2] = "C-3PO";
           StarWars [1][3] = "Lea Organa";
           StarWars [2][0] = "Boba Fett";
           StarWars [2][1] = "Palpatine";
           StarWars [2][2] = "Obi-Wan Kenobi";
           StarWars [2][3] = "Chewbacca";
           int i, j;
           for (i = 0;1<StarWars.length; i++){
               for(j=0;1<StarWars.length; j++){
                System.out.println("["+StarWars[i][j]+"]");  
               }
           }
           
        System.out.println("-----EJERCICIO 3------");
        String Codigo[][]  = new String[26][2];
        
        Codigo[0][0] = "A";
        Codigo[1][0] = "B";
        Codigo[2][0] = "C";
        Codigo[3][0] = "D";
        Codigo[4][0] = "E";
        Codigo[5][0] = "F";
        Codigo[6][0] = "G";
        Codigo[7][0] = "H";
        Codigo[8][0] = "I";
        Codigo[9][0] = "J";
        Codigo[10][0] = "K";
        Codigo[11][0] = "L";
        Codigo[12][0] = "M";
        Codigo[13][0] = "N";
        Codigo[14][0] = "O";
        Codigo[15][0] = "P";
        Codigo[16][0] = "Q";
        Codigo[17][0] = "R";
        Codigo[18][0] = "S";
        Codigo[19][0] = "T";
        Codigo[20][0] = "U";
        Codigo[21][0] = "V";
        Codigo[22][0] = "W";
        Codigo[23][0] = "X";
        Codigo[24][0] = "Y";
        Codigo[25][0] = "Z";
    
        Codigo[0][1] = ".-";
        Codigo[1][1] = "-...";
        Codigo[2][1] = "-.-.";
        Codigo[3][1] = "-..";
        Codigo[4][1] = ".";
        Codigo[5][1] = "..-.";
        Codigo[6][1] = "--.";
        Codigo[7][1] = "...";
        Codigo[8][1] = "..";
        Codigo[9][1] = ".---";
        Codigo[10][1] = "-.-";
        Codigo[11][1] = ".-..";
        Codigo[12][1] = "--";
        Codigo[13][1] = "-.";
        Codigo[14][1] = "---";
        Codigo[15][1] = ".--.";
        Codigo[16][1] = "--.-";
        Codigo[17][1] = ".-.";
        Codigo[18][1] = "...";
        Codigo[19][1] = "-";
        Codigo[20][1] = "..-";
        Codigo[21][1] = "...-";
        Codigo[22][1] = ".--";
        Codigo[23][1] = "-..-";
        Codigo[24][1] = "-.--";
        Codigo[25][1] = "--..";
        
        for (String[] Codigo1 : Codigo) {
            System.out.println(Codigo1[0] + " : " + Codigo1[1]);
        }
        
        System.out.println("-----EJERCICIO 4------");
        System.out.println("Ingrese una palabra sin agregar espacios:");
        Scanner leer = new Scanner(System.in);
        String palabra = leer.next();
        char [] bChar = palabra.toCharArray();
        for (int i = 0; i < bChar.length; i++) {
            System.out.println(bChar[i]);

        }
        
        
      System.out.println("-----EJERCICIO 5------");
    
        String Cod[][]  = new String[26][2];
        
        Cod[0][0] = "A";
        Cod[1][0] = "B";
        Cod[2][0] = "C";
        Cod[3][0] = "D";
        Cod[4][0] = "E";
        Cod[5][0] = "F";
        Cod[6][0] = "G";
        Cod[7][0] = "H";
        Cod[8][0] = "I";
        Cod[9][0] = "J";
        Cod[10][0] = "K";
        Cod[11][0] = "L";
        Cod[12][0] = "M";
        Cod[13][0] = "N";
        Cod[14][0] = "O";
        Cod[15][0] = "P";
        Cod[16][0] = "Q";
        Cod[17][0] = "R";
        Cod[18][0] = "S";
        Cod[19][0] = "T";
        Cod[20][0] = "U";
        Cod[21][0] = "V";
        Cod[22][0] = "W";
        Cod[23][0] = "X";
        Cod[24][0] = "Y";
        Cod[25][0] = "Z";
    
        Cod[0][1] = ".-";
        Cod[1][1] = "-...";
        Cod[2][1] = "-.-.";
        Cod[3][1] = "-..";
        Cod[4][1] = ".";
        Cod[5][1] = "..-.";
        Cod[6][1] = "--.";
        Cod[7][1] = "...";
        Cod[8][1] = "..";
        Cod[9][1] = ".---";
        Cod[10][1] = "-.-";
        Cod[11][1] = ".-..";
        Cod[12][1] = "--";
        Cod[13][1] = "-.";
        Cod[14][1] = "---";
        Cod[15][1] = ".--.";
        Cod[16][1] = "--.-";
        Cod[17][1] = ".-.";
        Cod[18][1] = "...";
        Cod[19][1] = "-";
        Cod[20][1] = "..-";
        Cod[21][1] = "...-";
        Cod[22][1] = ".--";
        Cod[23][1] = "-..-";
        Cod[24][1] = "-.--";
        Cod[25][1] = "--..";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra en Mayusculas:");
       
        String palabra = leer.next();
        int pagar = 10;
        int Value;
        char cChar;
        int a=0;
        char [] aChar = palabra.toCharArray();
        for (int i = 0; i < aChar.length; i++) {
            cChar = aChar[i];
            Value= (int) cChar;
            a = i;  
            switch (Value) {
                case 65: System.out.println("A:"+Cod[65-65][1]);
                    break;
                case 66: System.out.println("B:"+Cod[66-65][1]);
                    break;
                case 67: System.out.println("C:"+Cod[67-65][1]);
                    break;
                case 68: System.out.println("D:"+Cod[68-65][1]);
                    break;
                case 69: System.out.println("E:"+Cod[68-65][1]);
                    break;
                case 70: System.out.println("F:"+Cod[69-65][1]);
                    break;
                case 71: System.out.println("G:"+Cod[70-65][1]);
                    break;
                case 72: System.out.println("H:"+Cod[71-65][1]);
                    break;
                case 73: System.out.println("I:"+Cod[72-65][1]);
                    break;
                case 74: System.out.println("J:"+Cod[73-65][1]);
                    break;
                case 75: System.out.println("K:"+Cod[74-65][1]);
                    break;
                case 76: System.out.println("L:"+Cod[75-65][1]);
                     break;
                case 77: System.out.println("M:"+Cod[76-65][1]);
                     break;
                case 78: System.out.println("N:"+Cod[77-65][1]);
                     break;
                case 79: System.out.println("O:"+Cod[78-65][1]);
                    break;
                case 80: System.out.println("P:"+Cod[79-65][1]);
                    break;
                case 81: System.out.println("Q:"+Cod[80-65][1]);
                    break;
                case 82: System.out.println("R:"+Cod[81-65][1]);
                    break;
                case 83: System.out.println("S:"+Cod[82-65][1]);
                    break;
                case 84: System.out.println("T:"+Cod[83-65][1]);
                    break;
                case 85: System.out.println("U:"+Cod[84-65][1]);
                    break;
                case 86:  System.out.println("V:"+Cod[85-65][1]);
                    break;
                case 87: System.out.println("W:"+Cod[86-65][1]);
                    break;
                case 88: System.out.println("X:"+Cod[87-65][1]);
                    break;
                case 89: System.out.println("Y:"+Cod[88-65][1]);
                    break;
                case 90: System.out.println("Z:"+Cod[89-65][1]);
                    break;
            }
        }
        if (a<=aChar.length) {
                if (a<=4) {
                    System.out.println("Total a pagar sin extra ="+ pagar);
                }
                else{
                    int extra = a-4;
                    for (int j = 0; j < extra; j++) {
                        pagar = pagar +3;
                    }
                    System.out.println("Total a pagar conla palabra extra ="+ 
                            pagar);
                }
            } 
        
        System.out.println("-----EJERCICIO 6------");
        System.out.println("ingresa un genero:");
        Scanner leer = new Scanner(System.in);
        String stWar[][] = new String[3][10];
        
  
        
        stWar[0][0]="Darth Vader";
        stWar[1][0]="2,03 m";
        stWar[2][0]="male";
        
        stWar[0][1]="Luke Skywalker";
        stWar[1][1]="1.72 m";
        stWar[2][1]="male";
        
        stWar[0][2]="Han solo";
        stWar[1][2]="1.8 m";
        stWar[2][2]="male";
        
        stWar[0][3]="Lea Organa";
        stWar[1][3]="2,03 m";
        stWar[2][3]="female";
        
        stWar[0][4]="Asoka Tano";
        stWar[1][4]="1.88 m";
        stWar[2][4]="female";
        
        stWar[0][5]="Rey Skywalker";
        stWar[1][5]="1.7 m";
        stWar[2][5]="female";
        
        stWar[0][6]="Jabba el Hutt";
        stWar[1][6]="3,9 m";
        stWar[2][6]="hermafrodita";
        
        stWar[0][7]="Zorba Desilijic";
        stWar[1][7]="3,03 m";
        stWar[2][7]="hermafrodita";
        
        stWar[0][8]="R2-D2";
        stWar[1][8]="2,03 m";
        stWar[2][8]="programming";
        
        stWar[0][9]="C-3PO";
        stWar[1][9]="2,03 m";
        stWar[2][9]="programming";
        String nameS = leer.next();
        switch(nameS){
            case "male": 
                for (int i = 0; i < 3; i++) {
                    System.out.println(stWar[0][i]);
                }
                break;
            case "femele":
                for (int i = 3; i < 5; i++) {
                    System.out.println(stWar[0][i]);
                }
                break;
            case "hermafrodita":
                for (int i = 5; i < 7; i++) {
                    System.out.println(stWar[0][i]);
                }
                break;
            case "n/a":
                for (int i = 7; i < 9; i++) {
                    System.out.println(stWar[0][i]);
                }
                break;
            
        }
        
        
    }
    
}
