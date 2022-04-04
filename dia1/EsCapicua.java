
package Challenges.dia1;
import java.util.Scanner;

public class EsCapicua {
    
    public static void main (String [] args){
        String val;
        boolean esCapicua = true;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        val = teclado.next();
        int ini = 0, fin = val.length()-1;
        while(ini < fin && esCapicua){
            if (val.charAt(ini) != val.charAt(fin)){
                esCapicua = false;
                System.out.println("El valor ingresado no es capicua");
            } else{
                ini++;
                fin--;
            }
        }
        
        if (esCapicua){
            System.out.println("El valor ingresado es capicua");
        }
    }
}
