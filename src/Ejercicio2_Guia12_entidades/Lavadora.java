package Ejercicio2_Guia12_entidades;

import java.util.Scanner;


public class Lavadora extends Electrodomestico{
    
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    String verde = "\033[32m";
    @Override
    public String toString() {
        return verde+"Lavadora => " + "\nPrecio = " + precio + "\nColor = " + color + "\nConsumo Energetico = " + consumoEnergetico + "\nPeso=" + peso+"\n";
    }
    
    
    // Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
    // padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    // el atributo propio de la lavadora.
    
    public void crearLavadora(){
        Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        crearElectrodomestico();
        System.out.println("Ingrese carga de la lavadora: ");
        carga=sc.nextInt();
    }
    
    
    // Método precioFinal(): este método será heredado y se le sumará la siguiente
    // funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
    // carga es menor o igual, no se incrementará el precio. Este método debe llamar al
    // método padre y añadir el código necesario. Recuerda que las condiciones que hemos
    // visto en la clase Electrodoméstico también deben afectar al precio.
    
    @Override
    public double precioFinal(){
        double precioFinal = super.precio;
        if (carga>30) {
            precioFinal+=500;            
        } 
        return precioFinal;
    }
    
    
}
