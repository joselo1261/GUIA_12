
package Ejercicio2_Guia12_entidades;

import java.util.Scanner;

// Crear una superclase llamada Electrodoméstico con los siguientes atributos:
// precio, color,
// consumo energético (letras entre A y F) y peso.
// Los constructores que se deben implementar son los siguientes:
// • Un constructor vacío.
// • Un constructor con todos los atributos pasados por parámetro.

public class Electrodomestico {
    
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
        this.precio = 1000;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 0;
    }   

        
    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    String verde = "\033[32m";
    @Override
    public String toString() {
        comprobarConsumoEnergetico(consumoEnergetico);
        return verde+"Electrodomestico => " + "\nPrecio = " + precio + "\nColor = " + color + "\nConsumo Energetico = "+consumoEnergetico + "\nPeso=" + peso+"\n";
    }
    
    
    // Método comprobarConsumoEnergetico(char letra): 
    // comprueba que la letra es correcta, sino es correcta usara la letra F por defecto.
    // Este método se debe invocar al crear el objeto y no será visible.
    
    public void comprobarConsumoEnergetico(char letra) {

        if (letra < 'A' || letra > 'F') {

            consumoEnergetico = 'F';

        }
        System.out.println("Consumo Energetico "+consumoEnergetico);
    }
    
    
    // Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    // usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    // blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    // minúsculas. Este método se invocará al crear el objeto y no será visible.
    
    public String comprobarColor(String color) {
        String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};

        for (String colorDisponible : coloresDisponibles) {
            if (color.equalsIgnoreCase(colorDisponible)) {
                return colorDisponible;
            }
        }

        return "blanco";
    }
    
    
    // Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    // electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    // precio se le da un valor base de $1000.
    
    public void crearElectrodomestico() {
        Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese el precio: ");
        precio = sc.nextDouble();
        System.out.println("Ingrese el color: ");
        color = sc.next();
        color = comprobarColor(color);
        System.out.println("Ingrese el consumo energetico: ");
        consumoEnergetico = sc.next().charAt(0);
        comprobarConsumoEnergetico(consumoEnergetico);
        System.out.println("Ingrese el peso: ");
        peso = sc.nextDouble();
        System.out.println("Electrodomestico => " + "\nPrecio = " + precio + "\nColor = " + color + "\nConsumo Energetico = " + consumoEnergetico + "\nPeso=" + peso+"\n");
    }
    
    
    // Método precioFinal(): según el consumo energético y su tamaño, 
    // aumentará el valor del precio.
    
    public double precioFinal() {

        double precioFinal = precio;

        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }

        return precioFinal;
    }
}

