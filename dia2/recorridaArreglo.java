
package Challenges.dia2;
import java.util.Scanner;

public class recorridaArreglo {
    
    // Modulos   
    static void mayorNumero (int[] array){
        int aux = array[0];    
        for (int x = 0; x < array.length - 1; x++){
            if (aux < array[x+1]){
                aux = array[x+1];
            }
        }
        System.out.println("El mayor numero ingresado es: " + aux);
    }   
    static void menorNumero (int[] array){
        int aux = array[0];     
        for (int x = 0; x < array.length - 1; x++){
            if (aux > array[x+1]){
                aux = array[x+1];
            }
        }
        System.out.println("El menor numero ingresado es: " + aux);
    }    
    static void numerosPares (int[] array){
        System.out.println("Los numeros pares son: ");
        for (int x = 0; x < array.length; x++){
            if (array[x] % 2 == 0){
                System.out.print(array[x] + " ");
            }
        }
        System.out.println();
    }    
    static void numerosImpares (int[] array){
        System.out.println("Los numeros impares son: ");
        for (int x = 0; x < array.length; x++){
            if (array[x] % 2 != 0){
                System.out.print(array[x] + " ");
            }
        }
        System.out.println();
    }   
    //Metodo de ordenamiento para ordenarlo Ascendentemente
    static void insercion(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int aux = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > aux) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = aux;
        }
    }
    //Metodo de ordenamiento modificado de orden inverso
    static void burbujaInv(int[] array){
       for (int x = 1; x < array.length; x++){
           for (int y = 0; y < array.length - x; y++){
               if (array[y] < array[y+1]){
                   int aux = array[y];
                   array[y] = array[y+1];
                   array[y+1] = aux;
               }
           }
       }
    }    
    static void mostrarArray (int[] array, int pos){
        for (int x = 0; x < pos; x++){
            System.out.print(array[x] + " ");
        }
        System.out.println();
    }
 
    
    public static void main (String [] args){
        int[] array = new int [10];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros");
        for(int x = 0; x < array.length; x++){
            array[x] = teclado.nextInt();
        }
        mayorNumero(array);
        menorNumero(array);
        numerosPares(array);
        numerosImpares(array);
        insercion(array);
        mostrarArray(array, array.length);
        burbujaInv(array);
        mostrarArray(array, array.length);  
    }
}
