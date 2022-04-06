
package Challenges.dia3;
import java.util.Scanner;
public class partido {
    
    
    static void datosJugadores(int[][] jugadores){
        int numero;
        Scanner teclado = new Scanner (System.in);
        for(int x = 0; x < jugadores.length; x++){
            System.out.println("Jugador: " + x + " ingrese 4 numeros entre 1 y 10");
            for(int y = 0; y < jugadores[0].length; y++){
                numero = teclado.nextInt();
                while(numero < 1 || numero > 10){
                    System.out.println("Numero incorrecto, elija entre el rango establecido");
                    numero = teclado.nextInt();
                }
                jugadores[x][y] = numero;
            }
        }
       
    }
    
    static void mostrar(int[][] jugadores, int A, int B){
        int count = 0;
        for(int x = 0; x < jugadores.length; x++){
            System.out.println("Verificando valores del jugador: " + x);
            for (int y = 0; y < jugadores[0].length; y++){
                System.out.print(jugadores[x][y] + " ");
                if (jugadores[x][y] >= A && jugadores[x][y] <= B){
                    count++;
                }
            }
            System.out.println("Acerto: " + count);
            count = 0;
        }
    }
    
    public static void main (String [] args){
        Scanner teclado = new Scanner (System.in);
        int A, B, cantJugadores;
        System.out.println("Cuantos jugadores participaran?");
        cantJugadores = teclado.nextInt();
        int[][] jugadores = new int[cantJugadores][4];
        datosJugadores(jugadores);
        
        System.out.println("Arbitro ingrese un intervalo de numeros");
        A = teclado.nextInt();
        B = teclado.nextInt();
        while (A >= B){
            System.out.println("Intervalo invalido, vuelva a ingresar");
            A = teclado.nextInt();
            B = teclado.nextInt();
        }
        mostrar(jugadores,A,B);
    }
}
