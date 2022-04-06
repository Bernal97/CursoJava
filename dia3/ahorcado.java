
package Challenges.dia3;
import java.util.Scanner;
public class ahorcado {
    //Modulos
    static char[] palabra(String cadena){
        //Pasa la cadena ingresada a un arreglo por letras
        char[] cade = new char[cadena.length()];
        for(int x = 0; x < cade.length; x++){
            cade[x] = cadena.charAt(x);
        }
        
        return cade;
}
    
    static boolean buscar(String letra, char[] palabra){
    //Modulo enfocado en recorrer el arreglo y verificar si la letra esta en la cadena
        for(int x = 0; x < palabra.length; x++){
            if(String.valueOf(palabra[x]).equals(letra)){
                return true;
            }
        }
        return false;
    }
    static boolean jugada (char[] palabra){
        //Ingresa letras tratando de acertar
        Scanner teclado = new Scanner (System.in);
        int partes = 0, acertado = 0;
        String letra;
        boolean gano = false;
        do{
            System.out.println("Ingrese una letra");
            letra = teclado.next();
            if(buscar(letra, palabra)){
                System.out.println("Letra correcta");
                acertado++;
            }else{
                System.out.println("Letra Incorrecta");
                partes++;
                System.out.println("Le quedan: " + (6-partes) + " Intentos");
            }
        }while (partes != 6 & acertado != palabra.length);
        if (partes < 6){
            gano = true;
        }
        return gano;
    }
    
    public static void main (String [] args){
        String player1, player2, cadena, pista;
        int count1 = 0, count2 = 0;
        char[] texto;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Jugador 1, ingrese su nombre");
        player1 = teclado.next();
        System.out.println("Jugador 2, ingrese su nombre");
        player2 = teclado.next();
        do{
            System.out.println(player1+ " ingrese su palabra");
            cadena = teclado.next();
            System.out.println("Ingrese una pista");
            pista = teclado.next();
            texto = palabra(cadena);
            System.out.println(player2 +" intente adivinar la palabra. Pista: "+
                    pista);
            if(jugada(texto)){
                System.out.println("Gano " + player2);
                count2++;
            }else{
                System.out.println("No acerto, gano " + player1);
                count1++;
            }
            System.out.println(player2 +"ingrese su palabra");
            cadena = teclado.next();
            System.out.println("Ingrese una pista");
            pista = teclado.next();
            texto = palabra(cadena);
            System.out.println(player1 +"intente adivinar la palabra. Pista: "+
                    pista);
            if(jugada(texto)){
                System.out.println("Gano "+ player1);
                count1++;
            }else{
                System.out.println("No acerto, gano " + player2);
                count2++;
            }       
        }while (count1 != 6 && count2 != 6);
    }
}
