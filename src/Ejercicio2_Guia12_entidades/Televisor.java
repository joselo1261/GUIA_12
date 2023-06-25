
package Ejercicio2_Guia12_entidades;

import java.util.Scanner;


public class Televisor extends Electrodomestico {
    
    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    String verde = "\033[32m";
    @Override
    public String toString() {
        return verde+"Televisor => " + "\nPrecio = " + precio + "\nColor = " + color + "\nConsumo Energetico = " + consumoEnergetico + "\nPeso=" + peso+"\n";
    }
    
    
    // Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
    // padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    // los atributos del televisor.
    
    public void crearTelevisor() {
        try (Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n")) {
            crearElectrodomestico();
            System.out.println("Ingrese resolucion en pulgadas: ");
            resolucion = sc.nextInt();
            System.out.println("El televisor cuenta con sintonizador TDT? (S/N)");
            String resp = sc.next();
            if (resp.equalsIgnoreCase("N")) {
                sintonizador = false;
            }
        }

    }
    
    
    // Método precioFinal(): este método será heredado y se le sumará la siguiente
    // funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
    // incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
    // $500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
    // también deben afectar al precio.
    
    @Override
    public double precioFinal() {
        double precioFinal = super.precio;
        if (resolucion > 40) {
            precioFinal = precioFinal * 1.3;
        }
        if (sintonizador) {
            precioFinal += 500;
        }

        return precioFinal;
    }
    
    
}
