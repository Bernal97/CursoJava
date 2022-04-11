
package Challenges.dia6.Academia;

public class Personal extends Empleados implements Asignaciones{
    
    private String seccion;
    
    public Personal (String nombre, String apellido, int dni, char estadoCivil){
        super(nombre, apellido, dni, estadoCivil);
        seccion = "";
    }
    
    @Override
    public void asignarPosicion(String pos){
        this.seccion = pos;
    }

    @Override
    public String toString() {
        return "Personal{" + "seccion= " + seccion + '}';
    }
    
    
}
