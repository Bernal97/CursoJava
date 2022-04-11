
package Challenges.dia6.Academia;

public class Profesores extends Empleados implements Asignaciones{
    
    private String departamento;
    
    public Profesores(String nombre, String apellido, int dni, char estadoCivil){
        super(nombre, apellido, dni, estadoCivil);
        this.departamento = "";
    }
    
    @Override
    public void asignarPosicion(String num){
        this.departamento = num;
    }

    @Override
    public String toString() {
        return "Profesores{" + " departamento= " + departamento + '}';
    }

        
}
