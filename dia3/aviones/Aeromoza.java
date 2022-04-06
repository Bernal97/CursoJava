
package Challenges.dia3.aviones;


    public class Aeromoza {
    private String nombre;
    private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Aeromoza{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}
