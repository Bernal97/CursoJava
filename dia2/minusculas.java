
package Challenges.dia2;
import java.util.Scanner;
public class minusculas {
    
    
    public static void main (String [] args){
        String cadena;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese una cadena de texto");
        cadena = teclado.next();
        
        for (int x = 0; x < cadena.length(); x++){
             if (cadena.charAt(x) >= 'a' && cadena.charAt(x) < 'z'){
                 System.out.print(cadena.charAt(x) + " ");
             }
            
        }
    }
}
