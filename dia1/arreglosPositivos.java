
package Challenges.dia1;
import java.util.Scanner;
public class arreglosPositivos {
    
    //Modulo Auxiliar
     static void mostrarArray (int[] array, int pos, int mostrar){
        for (int x = 0; x < pos; x++){
            if (array[x] > mostrar){
                System.out.print(array[x] + " ");
            }           
        }
        System.out.println();
    }
    
    
    public static void main (String [] args){
        int[] array = new int [20];
        array[1] = 12;
        array[2] = 7;
        array[3] = 15;
        int opcion, pos = 4, mostrar;
        Scanner teclado = new Scanner (System.in);     
        do{
            System.out.println("Ingrese un valor positivo menor a 80 para sumar al arreglo o 0 para salir");
            opcion = teclado.nextInt();
            if (opcion > 0 && opcion < 80 && pos < array.length){
                array[pos] = opcion;
                pos++;
            } else  if (pos == array.length){
                System.out.println("Se alcanzo el limite del arreglo");
            } else {
                System.out.println("No pertenece al rango establecido");
            }
            System.out.print("Mostrar arreglos mayores a: ");
            mostrar = teclado.nextInt();
            mostrarArray(array, pos, mostrar); 
            
            System.out.println("Todavia hay espacio para " + (array.length - pos) + " numeros mas");
        }while (opcion != 0);
    }
    }

