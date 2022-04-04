
package Challenges.dia1;
import java.util.Scanner;
public class ElMayor {
    
    public static void main (String [] args){
        int a, b, c;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese 3 numeros");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        if (a > b && a > c){
            System.out.println("El valor mas grande de los 3 es: " + a);    
        } else if (b > a && b > c){
            System.out.println("El valor mas grande de los 3 es: " + b);
        } else {
            System.out.println("El valor mas grande de los 3 es: " + c);
        }
    }
}
