
package Challenges.dia4.vehiculos;

public class Particular extends Vehiculo{
    
    
    private int puertas;
    
    public Particular(String matri, int door){
        super (matri);
        this.puertas = door;
    }

    public int getPuertas() {
        return puertas;
    }
    
    
}
