
package Challenges.dia5.empresa;

public class Secretario extends Empleado{
    
        private String despacho;
        private int nroFax;
        
    
    public Secretario(String nombre, String apellido, int DNI, String direccion, int antiguedad, String telefonoContacto, Double salario
                      , String despacho, int nroFax){
        super(nombre, apellido, DNI, direccion, antiguedad, telefonoContacto, (salario*5)/100);
        this.despacho = despacho;
        this.nroFax = nroFax;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public int getNroFax() {
        return nroFax;
    }

    public void setNroFax(int nroFax) {
        this.nroFax = nroFax;
    }
    
    
    public String informacionAdicional(){
        return "Despacho = " + this.despacho + " nroFax = " + this.nroFax;
    }
    
}
