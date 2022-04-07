
package Challenges.dia4.vehiculos;

public class Remolque {
    
        private String contenido;
        private double peso;
        
        
        public Remolque(String conte, double pes){
            this.contenido = conte;
            this.peso = pes;
        }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Remolque {" + "contenido = " + contenido + ", peso = " + peso + '}';
    }
        
}
