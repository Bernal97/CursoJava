
package Challenges.dia6.Academia;

public class Curso {
    
    
    private String nombreCurso;
    private String materias;
    private int nroCurso;

    public Curso(String nombreCurso, String materias, int nroCurso) {
        this.nombreCurso = nombreCurso;
        this.materias = materias;
        this.nroCurso = nroCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public int getNroCurso() {
        return nroCurso;
    }

    public void setNroCurso(int nroCurso) {
        this.nroCurso = nroCurso;
    }
    
    
    
    
    
}
