/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4_Guia12_Extra_entidades;

/**
 *
 * @author dell
 */
public class Empleado extends Persona{
    protected int anioIngreso;
    protected String numeroDespacho;
    
    public Empleado(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil, int anioIngreso,
            String numeroDespacho) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.anioIngreso = anioIngreso;
        this.numeroDespacho = numeroDespacho;
    }
    public int getAnioIngreso() {
        return anioIngreso;
    }
    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
    public String getNumeroDespacho() {
        return numeroDespacho;
    }
    public void setNumeroDespacho(String numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    public void reasignarDespacho(String nuevoDespacho) {
        this.numeroDespacho = nuevoDespacho;
    }

    String blanco = "\033[37m";

    @Override
    public String toString() {
        return super.toString() + blanco+"\nAño Incorporación => " + anioIngreso +blanco+
                "\nNumero de despacho => " + numeroDespacho;
    }
}


