
package Ejercicio2_Guia12_Extra_entidades;


public class EdificioDeOficinas extends Edificio {
    
    private int numOfic;
    private int persPorOfic;
    private int numP;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOfic, int persPorOfic, int numP, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOfic = numOfic;
        this.persPorOfic = persPorOfic;
        this.numP = numP;
    }

    @Override
    public double calcularSuperficie() {
        return ancho * largo * numP;
    }

    @Override
    public double calcularVolumen() {
        return ancho * largo * alto;
    }
    
    public void cantPers() {
        int persUnPiso = numOfic * persPorOfic;
        int persTodoEdif = persUnPiso * numP;
        
        System.out.println("Personas en un piso: " + persUnPiso);
        System.out.println("Personas en todo el edificio: " + persTodoEdif);
    } 
    
    
    
    
}
