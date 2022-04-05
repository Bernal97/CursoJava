
package Challenges.dia2;
import java.util.Scanner;
public class calculadora {
    
    
    public static void main (String [] args){
        int opcion;
        double x, y;
        Scanner teclado = new Scanner (System.in);
        // Uso valores double para asi tener en cuenta si se
        // ingresa valores con coma
        do{           
            System.out.println("Que desea hacer?");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Salir");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1: System.out.println("Ingrese 2 numeros");
                        x = teclado.nextDouble();
                        y = teclado.nextDouble();
                        double totalSum = x + y;
                        System.out.println("El resultado es: " + totalSum);
                        break;
                case 2: System.out.println("Ingrese 2 numeros");
                        x = teclado.nextDouble();
                        y = teclado.nextDouble();
                        double totalRes = x - y;
                        System.out.println("El resultado es: " + totalRes);                      
                        break;
                case 3: System.out.println("Ingrese 2 numeros");
                        x = teclado.nextDouble();
                        y = teclado.nextDouble();
                        double totalMult = x * y;
                        System.out.println("El resultado es: " + totalMult);
                        break;
                case 4: System.out.println("Ingrese 2 numeros");
                        x = teclado.nextDouble();
                        y = teclado.nextDouble();
                        double totalDiv = x / y;
                        System.out.println("El resultado es: " + totalDiv);
                        break;
                default: System.out.println ("Opcion no valida");
                        break;
            }
            
        }while (opcion != 0);
    }
}
