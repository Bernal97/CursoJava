
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
    
    @Override
    public double acelerar(double speed) {  
            if (this.getVelocidad() + speed > 100 && this.carga != null){
                System.out.println("Alcanzo el limite maximo de velocidad permitida");
                setVelocidad(100);
                return getVelocidad();
            }
            setVelocidad(this.getVelocidad() + speed);
        return getVelocidad();
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
