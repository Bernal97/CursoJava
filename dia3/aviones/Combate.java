
package Challenges.dia3.aviones;

public class Combate extends Avion{
    private int cantMisiles;
    private int cantMuniciones;
    
    
    public Combate (int cantAsi, int hs, float tamanio, int misil, int muni){
        super(cantAsi,hs,tamanio);
        this.cantMisiles = misil;
        this.cantMuniciones = muni;
    }
    
    public void accionesEvasivas(){
        System.out.println("ACCIONES EVASIVAS AHHHHHHH");
    }
    
    
    
}
