
package Challenges.dia3;
import java.util.Scanner;
public class testPila {
    
    static void sumatoria(pila array){
        pila aux = array;
        int num = 0;
        while(!aux.pilaVacia()){
            num = num + aux.push();
        }
        System.out.println("La sumatoria de todos los numeros es: " + num);
    }
    
    static void mostrar(pila array){
        pila aux = array;
        pila aux2 = new pila(aux.tope());
        while(!aux.pilaVacia()){
            
        }
    }
    public static void main (String [] args){
        int opcion;
        pila array = new pila(6);
        Scanner teclado = new Scanner (System.in);
        do{
            System.out.println("1- Ingresar elemento");
            System.out.println("2- Quitar elemento");
            System.out.println("3- Mostrar elemento del tope");
            System.out.println("4- Verificar si la pila esta llena");
            System.out.println("5- Verificar si la pila esta vacia");
            System.out.println("6- Mostrar todos los elementos de la pila");
            System.out.println("7- Sumar todos los elementos de la pila");
            System.out.println("8- Imprimir pila inversa en base a una posicion");
            System.out.println("0- Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: array.pop(); break;
                case 2: array.push(); break;
                case 3: System.out.println(array.top()); break;
                case 4: System.out.println(array.pilaLlena()); break;
                case 5: System.out.println(array.pilaVacia()); break;
                
            }
            
        }while (opcion != 0);
    } 
}
