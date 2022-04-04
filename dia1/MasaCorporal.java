
package Challenges.dia1;
import java.util.Scanner;
public class MasaCorporal {
    
    
    public static void main (String [] args){
        double peso,altura, MC;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingrese su Peso");
        peso = teclado.nextDouble();
        System.out.println("Ingrese su Altura");
        altura = teclado.nextDouble();
        MC = peso / (altura*altura);
        System.out.println(MC);
        if (MC < 20){
            System.out.println("Mal Estado");
        } else if (MC >= 20 && MC < 22){
            System.out.println("Bajo Peso");
        } else if (MC >= 22 && MC < 25){
            System.out.println("Peso Normal");
        } else if (MC >= 25 && MC < 30){
            System.out.println("Sobrepeso");
        } else if (MC >= 30 && MC < 40){
            System.out.println("Sobrepeso Cronico");
        } else {
            System.out.println("Hospitalizado");
        }
            
    }
}
