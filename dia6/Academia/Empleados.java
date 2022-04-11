
package Challenges.dia6.Academia;

public class Empleados extends Persona{
    
        private int ingreso;
        protected int despacho;

    public Empleados(String nombre, String apellido, int dni, char estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        ingreso = 0;
        despacho = 0;
    }

    
    public void asignarDespacho(int desp){
        this.despacho = desp;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }
        
    
        
}
