
package Challenges.dia2;
import java.util.Scanner;
public class auto implements Tunear{

    @Override
    public void hacerRuido() {
        System.out.println("vrom");
    }
    
    public void elegirColor(){
        String[] color = {"Blanco", "Negro", "Rojo", "Azul"};
        int op;
        Scanner teclado = new Scanner(System.in);
        System.out.println("1- Blanco");
        System.out.println("2- Negro");
        System.out.println("3- Rojo");
        System.out.println("4- Azul");
        op = teclado.nextInt();
        boolean flag = false;
        while(!flag){
            switch(op){
                case 1: System.out.println("Eligio el Blanco");
                flag = true;break;
                case 2: System.out.println("Eligio el Negro"); 
                flag = true; break;
                case 3: System.out.println("Eligio el Rojo");
                flag = true; break;
                case 4: System.out.println("Eligio el Azul");
                flag = true; break;
                default: System.out.println("No es una opcion correcta");
                break;
            }
        }
    }
    
    public static void main (String [] args){
        auto a = new auto();
        Scanner teclado = new Scanner(System.in);
        int op = 0;
        boolean flag = false;
        do{          
            System.out.println("Que desea hacer con el auto?");
            System.out.println("1- Hacer ruido");
            System.out.println("2- Elegir color");
            op = teclado.nextInt();
            switch(op){
                case 1: a.hacerRuido();flag = true; break;
                case 2: a.elegirColor(); flag = true; break;
                default: System.out.println("Eleccion Incorrecta"); 
                    flag = false; break;
            }
            
        }while(flag);
    }
    
}
