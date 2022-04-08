
package Challenges.dia5.empresa;

public class Empleado {
    
    private String nombre;
    private String apellido;
    private int DNI;
    private String direccion;
    private int antiguedad;
    private String telefonoContacto;
    private Double salario;
    private Supervisor sup;

    public Empleado(String nombre, String apellido, int DNI, String direccion, int antiguedad, String telefonoContacto, Double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.direccion = direccion;
        this.antiguedad = antiguedad;
        this.telefonoContacto = telefonoContacto;
        this.salario = salario;
        this.sup = null;
    }

    public Empleado() {
        this.nombre = "";
        this.apellido = "";
        this.DNI = 0;
        this.direccion = "";
        this.antiguedad = 0;
        this.telefonoContacto = "";
        this.salario = 0.0;
        this.sup = null;
    }
    
    
    
    public void asignarSupervisor(Supervisor a){
        this.sup = a;
    }
    
    public Double incrementarSalario(Double sal){
        return this.salario+= sal;
    }
    
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

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre= " + nombre + ", apellido= " + apellido + ", DNI= " + DNI + ", direccion= " + direccion + ", antiguedad= " + antiguedad + ", telefonoContacto= " + telefonoContacto + ", salario= " + salario + ", sup= " + sup + '}';
    }
    
    
    
           
}
