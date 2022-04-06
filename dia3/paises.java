
package Challenges.dia3;
import java.util.Scanner;
public class paises {
    
    //modulos
    static String[][] Ciudades (String[] array1, String[][] array2){
        Scanner teclado = new Scanner (System.in);
        for(int x = 0; x < array1.length; x++){
            System.out.println(x + " " + array1[x]);
            for (int y = 0; y < array2[0].length;y++){
                array2[x][y] = teclado.next();
            }
        }
        return array2;
    }
    
    static void mostrar(String[] array1, String[][] array2){
        for (int x = 0; x < array1.length; x++){
            System.out.println(array1[x] + ": ");
            for (int y = 0; y < array2[0].length; y++){
                System.out.print(array2[x][y] + " , ");
            }
            System.out.println();
        }
    }
    
    //principal
    public static void main (String [] args){
        Scanner teclado = new Scanner (System.in);
        String[] paises = new String [5];
        String[][] ciudades = new String[5][3];
        System.out.println("Ingrese 5 paises");
        for(int x = 0; x < paises.length; x++){
            paises[x] = teclado.next();
        }
        System.out.println("Ingrese 3 ciudades para las respectivas ciudades");
        ciudades = Ciudades(paises, ciudades);
        mostrar(paises,ciudades);
    }
}
