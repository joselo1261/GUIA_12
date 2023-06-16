
package Ejercicio4_Guia12_entidades;

public class Circulo implements calculoFormas {
    
    private double radio;

    public Circulo() {
    }
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }
    
    @Override
    public double calcularPerimetro() {
        return PI * 2 * radio;
    }
    
    
}
