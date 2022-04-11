
package Challenges.dia6.Academia;
import java.util.List;
public class Estudiante extends Persona{
    
    private List<Curso> materias;
    
    
    public Estudiante (String nombre, String apellido, int dni, char estadoCivil){
        super(nombre, apellido, dni, estadoCivil);
        materias = null;
    }
    
    private void asignarCurso(Curso materia){
        materias.add(materia);
    }
    
    
    public void listarMaterias(){
        for(int x = 0; x < this.materias.size(); x++){
            System.out.println(this.materias.get(x));
        }
    }


}
