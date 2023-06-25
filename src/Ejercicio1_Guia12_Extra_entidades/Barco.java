package Ejercicio1_Guia12_Extra_entidades;

public class Barco {
    protected String matricula;
    protected double eslora;
    protected int anioFabricacion;

    public Barco(){
        
    }

    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }
    
    
    @Override
    public String toString() {
        return "Matricula => " + matricula + "\nEslora => " + eslora + "\nAño Fabricacion => " + anioFabricacion;
    }
    
    
    public double calcularModulo() {
        return eslora * 10;
    }
}
    