
package Challenges.dia1;
import java.util.Scanner;

public class promedioNotas {
    
    public static void main (String [] args){
        double nota1, nota2, nota3, promedio;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese las notas");
        nota1 = teclado.nextDouble();
        nota2 = teclado.nextDouble();
        nota3 = teclado.nextDouble();
        promedio = (nota1 + nota2 + nota3)/3;
        if (promedio < 10){
            System.out.println("Usted esta desaprobado");
        } else if (promedio >= 10 && promedio < 15){
            System.out.println("Usted esta aprobado");
        } else  if (promedio >= 15 && promedio < 20){
            System.out.println("Usted esta eximido");
        }
    }
}
