
package Challenges.dia3;
import java.util.Scanner;

public class pila {
    private int[] pila;
    private int tope = -1;
    private int max = 0;
    
    public pila (){
        tope = -1;
        pila = new int[10];
        max = pila.length;
    }
    
     public void pop(int val){

        if(tope < pila.length){
            this.tope++;
            this.pila[this.tope] = val;
            
        }else{
            System.out.println("Maximo alcanzado, no puede agregarse mas");
        }
    }
    
     int push(){
        int val = 0;
        if(tope != -1){
            val = this.pila[this.tope];
            tope--;
        } else {
            System.out.println("La pila esta vacia");
        }
        return val;
    }
    
     int top (){
        return this.pila[this.tope];
    }
     
     int tope(){
         return this.tope;
     }
    
     public pila clone(){
        pila clonar;
        clonar = new pila();
        clonar.tope = this.tope;
        clonar.pila = this.pila.clone();
        return clonar;
    }
     
    public boolean pilaLlena(){
        return (this.tope == this.max);
    }
    
    public boolean pilaVacia(){
        return this.tope == -1;
    }
    
    /*
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
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: pop(array.pila, array.tope); break;
                case 2: push(array.pila, array.tope); break;
            }
            
        }while (opcion != 0);
    }
    */
    
}
