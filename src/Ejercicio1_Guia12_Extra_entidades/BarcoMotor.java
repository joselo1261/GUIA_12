
package Ejercicio1_Guia12_Extra_entidades;


public class BarcoMotor extends Barco{
    
    private final int potenciaCV;
    
    public BarcoMotor(String matricula, double eslora, int anioFabricacion, int potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }
    
    
    @Override
    public String toString() {
        return "> Matricula: " + matricula + "\n> Eslora: " + eslora + "\n> Año Fabricacion: " + anioFabricacion + "\n> Potencia: " + potenciaCV +" CV";
    }
    
    
    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV;
    }
}
    
    
