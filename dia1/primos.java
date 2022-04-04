
package Challenges.dia1;
import java.util.Scanner;
public class primos {
    
    
    public static void main (String [] args){
        int numero , val = -1;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese un numero entre 1 y 14");
        numero = teclado.nextInt();
        if (numero > 1 && numero < 14){
            val = esPrimo(numero);
        }
        switch(val) {
            case 1: System.out.println("Es primo"); break;
            case 0: System.out.println("No es primo"); break;
            default: System.out.println("Fuera de Rango"); break;
        }
    }
    
    
    
    static int esPrimo(int num){
        int primo = 1;
        for (int x = 2; x < num; x++){
            if (num % x == 0){
                return 0;
            }
        } 
        return primo;
    }
} 
