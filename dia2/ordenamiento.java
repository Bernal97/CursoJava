
package Challenges.dia2;

import java.util.Arrays;

public class ordenamiento {
    
    
    public static void main (String [] args){
        
        String[] cadena = {"coder", "devplace", "personas", "curso", "alumnado"};
        int aux1, aux2;
        for (int i = 0; i < cadena.length-1; i++){
            if (cadena[i].charAt(0) > 'a' && cadena[i].charAt(0) <= 'l'){
                if(cadena[i].compareTo(cadena[i+1]) > 0){
                    String aux = cadena[i];
                    cadena[i] = cadena[i + 1];
                    cadena[i+1] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(cadena));
        
    }
}
