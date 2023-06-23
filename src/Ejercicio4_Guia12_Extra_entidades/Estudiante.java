
package Ejercicio4_Guia12_Extra_entidades;


public class Estudiante extends Persona {
    protected String cursoMatriculado;

    public Estudiante(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil,
            String cursoMatriculado) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.cursoMatriculado = cursoMatriculado;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public void matricularEnCurso(String nuevoCurso) {
        this.cursoMatriculado = nuevoCurso;
    }
    String blanco = "\033[37m";
    @Override
    public String toString() {
        return super.toString() + blanco+"\nCurso Matriculado => " + cursoMatriculado;
    }
    
}

