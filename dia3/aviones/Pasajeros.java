
package Challenges.dia3.aviones;
import java.util.List;
public class Pasajeros extends Avion{
    
    private float cargaTotal;
    private float cargaMaxima;
    private List<Aeromoza> cantAeromozas;
    private List <Pasajero> cantPasajeros;
    
    public Pasajeros(int cantAsi, int hs, float tamanio, float cargaMax, 
            List<Aeromoza> total1, List<Pasajero> total2){
        super(cantAsi,hs,tamanio);
        this.cargaMaxima = cargaMax;
        this.cantAeromozas = total1;
        this.cantPasajeros = total2;
    }
    
    public void cargarEquipaje(float peso){
        if((peso+cargaTotal) < this.cargaMaxima){
            cargaTotal=+ peso;
        } else {
            System.out.println("Se alcanzo el peso maximo");
        }
    }
    
    
    public void comprobarEspacio(){
        System.out.println("Queda libre para cargar: " + (this.cargaMaxima - this.cargaTotal)
        + " Kg");
    }
    
}
