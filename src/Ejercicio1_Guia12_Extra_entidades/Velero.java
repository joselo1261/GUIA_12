
package Ejercicio1_Guia12_Extra_entidades;


public class Velero extends Barco {
    
    private int numMastiles;

    public Velero(String matricula, double eslora, int anioFabricacion, int numMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numMastiles = numMastiles;
    }
    
    @Override
    public double calcularModulo() {
        return super.calcularModulo()+eslora * 10;
    }
    
        
}
