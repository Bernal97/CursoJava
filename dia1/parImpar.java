
package Challenges.dia1;
import java.util.Scanner;
public class parImpar {
    
    
    public static void main (String [] args){
        int num, resultado;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        num = teclado.nextInt();
        if (num == 0){
            resultado = -1;
        }
         else if (num % 2 == 1){
            resultado = 1;
        } else {
            resultado = 0;
        }
        
        switch (resultado){
            case 0: System.out.println("Es par"); break;
            case 1: System.out.println("Es impar"); break;
            case -1: System.out.println("Es 0"); break;
        }
    }
}
