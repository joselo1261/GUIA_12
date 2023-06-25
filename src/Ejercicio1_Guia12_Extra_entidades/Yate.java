
package Ejercicio1_Guia12_Extra_entidades;


public class Yate extends Barco {
    
    private int potenciaCV;
    private int numCamarotes;
    
    public Yate(String matricula, double eslora, int anioFabricacion, int potenciaCV, int numCamarotes) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }
    
    @Override
    public String toString() {
        return super.toString()+"\nPotencia => "+potenciaCV+" CV"+"\nNumero Camarotes => "+numCamarotes;
    }
    
    
    
    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV + numCamarotes;
    }
}
    
    
