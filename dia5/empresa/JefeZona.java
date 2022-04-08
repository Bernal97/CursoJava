
package Challenges.dia5.empresa;

public class JefeZona extends Empleado{

    public Coche cocheEmpresa;
    public Secretario secretario;
    public JefeZona(String nombre, String apellido, int DNI, String direccion, int antiguedad, String telefonoContacto, Double salario) {
        super(nombre, apellido, DNI, direccion, antiguedad, telefonoContacto, (salario*20)/100);
        this.cocheEmpresa = null;
        this.secretario = null; 
    }

    public Coche getCocheEmpresa() {
        return cocheEmpresa;
    }

    public void setCocheEmpresa(Coche cocheEmpresa) {
        this.cocheEmpresa = cocheEmpresa;
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }
    
    
    
    
}
