
package Challenges.dia4.vehiculos;

public class DemasiadoRapidoException extends Exception{
    
        private String mensaje;
    
    public DemasiadoRapidoException(){
    }
    
    public DemasiadoRapidoException(String mensaje){
        super(mensaje);
    }
}
