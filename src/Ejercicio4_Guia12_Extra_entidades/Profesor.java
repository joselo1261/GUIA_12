
package Ejercicio4_Guia12_Extra_entidades;


public class Profesor extends Empleado {

    protected String departamento;

    public Profesor(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil, int anioIngreso,
            String numeroDespacho, String departamento) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil, anioIngreso, numeroDespacho);
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public void cambiarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartamento => "+departamento;
    }
       
}
