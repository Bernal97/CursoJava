
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
    
    public void disparar(int balas){
        
        if (cantMuniciones > 0){
            System.out.println("Ronda de balas disparadas");
            this.cantMuniciones =- balas;
        } else {
            System.out.println("Balas agotadas");
        }    
    }
    
    public void lanzarMisiles(int misil){
        if (cantMisiles > 0){
            this.cantMisiles =- misil;
        } else {
            System.out.println("Misiles agotados");
        }
    }
    
    public void comprobarSuministros(){
        System.out.println("Cantidad de misiles: " + this.cantMisiles);
        System.out.println("Cantidad de balas: " + this.cantMuniciones);
    }
    
}
