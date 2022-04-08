
package Challenges.dia5.empresa;
import java.util.List;
public class Vendedor extends Empleado{
    
    private Coche autoEmpresa;
    private String movil;
    private String areaVenta;
    private List<Clientes> listaClientes;
    
    
    public Vendedor(String nombre, String apellido, int DNI, String direccion, int antiguedad, 
            String telefonoContacto, Double salario, String movi, String areaVenta){
        super(nombre, apellido, DNI, direccion, antiguedad, telefonoContacto,(salario*10)/100);
        
        this.autoEmpresa = null;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.listaClientes = null;
    }

    
    public Coche getAutoEmpresa() {
        return autoEmpresa;
    }

    public void setAutoEmpresa(Coche autoEmpresa) {
        this.autoEmpresa = autoEmpresa;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getAreaVenta() {
        return areaVenta;
    }

    public void setAreaVenta(String areaVenta) {
        this.areaVenta = areaVenta;
    }

    public List<Clientes> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Clientes> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    
}
