
package Challenges.dia6.Academia;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int dni;
    private char estadoCivil;

    public Persona(String nombre, String apellido, int dni, char estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }
    
    
    public void actualizarEstadoCivil(char estado){
        this.estadoCivil = estado;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre= " + nombre + ", apellido= " + apellido + ", dni= " + dni + ", estadoCivil= " + estadoCivil + '}';
    }
    
}
