
package Challenges.dia3.aviones;


public class Avion {
    private int cantAsientos;
    private int horas;
    private float tamanio;
    
    public Avion (int cantAsi, int hs, float tam){
        this.cantAsientos = cantAsi;
        this.horas = hs;
        this.tamanio = tam;
    }

    
    
    public void despegar(){
        System.out.println("DESPEGANDO");
    }
    
    public void aterrizar(){
        System.out.println("ATERRIZANDO");
    }
    
    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }
    
    
}
