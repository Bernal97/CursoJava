
package Challenges.dia1;
import java.util.Scanner;

public class EcuacionesGrado2 {
    
    
    public static void main (String [] args){
        double a,b,c, discriminante;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el valor de x al cuadrado");
        a = teclado.nextDouble();
        System.out.println("Ingrese el valor de x");
        b = teclado.nextDouble();
        System.out.println("Ingrese el termino independiente");
        c = teclado.nextDouble();
        discriminante = (b*b) - (4 * a * c);
        if (discriminante > 0){
            System.out.println("Son raices Distitas");
        } else if (discriminante < 0){
            System.out.println("Son raices Imaginarias");
        } else {
            System.out.println("Son raices Iguales");
        }
    }
}
