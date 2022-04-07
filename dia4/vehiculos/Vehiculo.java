
package Challenges.dia4.vehiculos;
public class Vehiculo {
    
    
    private String matricula;
    private double velocidad;
    
    public Vehiculo(String matri){
        this.matricula = matri;
        this.velocidad = 0;
    }

    public double acelerar(double speed){
        return this.velocidad += speed;
    }
    
    public double desacelerar(double speed){
        if(this.velocidad - speed <= 0){
            System.out.println("Vehiculo detenido");
            return this.velocidad = 0;
        }else {
            return this.velocidad -= speed;
        }
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Vehiculo { " + "matricula = " + matricula + ", velocidad = " + velocidad + " KM/H "+ '}';
    } 
    
    
}
