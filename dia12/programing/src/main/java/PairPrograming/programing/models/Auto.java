
package PairPrograming.programing.models;


public class Auto {
    
    
    private String Marca, Modelo;
    private int año, id;
    private double Km;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Auto(int idAuto, String Marca, String Modelo, int año, double Km) {
        this.id = idAuto;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.año = año;
        this.Km = Km;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getKm() {
        return Km;
    }

    public void setKm(double Km) {
        this.Km = Km;
    }
    
    
    
}
