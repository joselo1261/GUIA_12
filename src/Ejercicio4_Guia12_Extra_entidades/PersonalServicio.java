
package Ejercicio4_Guia12_Extra_entidades;


public class PersonalServicio extends Empleado {

    protected String seccionAsignada;

    public PersonalServicio(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil,
            int anioIngreso, String numeroDespacho, String seccionAsignada) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil, anioIngreso, numeroDespacho);
        this.seccionAsignada = seccionAsignada;
    }

    public String getSeccionAsignada() {
        return seccionAsignada;
    }

    public void setSeccionAsignada(String seccionAsignada) {
        this.seccionAsignada = seccionAsignada;
    }

    public void trasladarSeccion(String nuevaSeccion) {
        this.seccionAsignada = nuevaSeccion;
    }

    @Override
    public String toString() {
        return super.toString() +"\nSeccion Asignada =>" +seccionAsignada;
    }
         
}
