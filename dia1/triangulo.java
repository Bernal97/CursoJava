
package Challenges.dia1;
import java.util.Scanner;
        
public class triangulo {
    
  
    static void queSoy(double lado1, double lado2, double lado3){
        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("Es un Equilatero");
        } else if ((lado1 != lado2 && lado1 == lado3) || (lado1 != lado3 && lado1 == lado2)){
            System.out.println("Es un Isoceles");
        } else {
            System.out.println("Es un Escaleno");
        }
    }
    
    
    public static void main (String [] args){
        double lad1, lad2, lad3;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingrese los lados del triangulo");
        lad1 = teclado.nextDouble();
        lad2 = teclado.nextDouble();
        lad3 = teclado.nextDouble();
        
        queSoy(lad1, lad2, lad3);
    }
    
    
}
