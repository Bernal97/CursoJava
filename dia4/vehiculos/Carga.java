
package Challenges.dia4.vehiculos;

public class Carga extends Vehiculo{
    
    
    private Remolque carga;
    
    public Carga(String matricula){
        super(matricula);
        this.carga = null;
    }
    
    
    public Remolque ponRemolque(Remolque a){
        this.setVelocidad(0);
       return this.carga = a;
    }
    
    public void verificarAceleracion(double speed){
        if(this.carga == null){
            double velocidad = getVelocidad()+ speed;
            setVelocidad(velocidad);         
        }else {
            if (this.getVelocidad() + speed > 100 && this.carga != null){
                System.out.println("Alcanzo el limite maximo de velocidad permitida");
                setVelocidad(100);
            }
        }
    }
    
    public Remolque quitarRemolque(){
        return this.carga = null;
    }
    
    public Remolque verCarga(){
        return carga;
    }
    
    public boolean verificarCarga(){
        return this.carga != null;
    }
}
