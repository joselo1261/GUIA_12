
package Ejercicio4_Guia12;

import Ejercicio4_Guia12_entidades.Circulo;
import Ejercicio4_Guia12_entidades.Rectangulo;
import java.text.DecimalFormat;


public class FigurasMain {

    
    public static void main(String[] args) {
       
        DecimalFormat df = new DecimalFormat("#.###"); // Para redondear decimales
        
        Circulo circ = new Circulo(3.2);
        Rectangulo rect = new Rectangulo(5.4, 7.8);

        
        double areaCirculo = circ.calcularArea();
        double perimetroCirculo = circ.calcularPerimetro();

        System.out.println("\nCalculo de Figuras Geometricas");
        System.out.println("------------------------------");
        System.out.println("\nArea del circulo: " + df.format(areaCirculo));
        System.out.println("\nPerimetro del circulo: " + df.format(perimetroCirculo));
        System.out.println("\n.......................................");
        
        double areaRectangulo = rect.calcularArea();
        double perimetroRectangulo = rect.calcularPerimetro();

        System.out.println("\nArea del rectangulo: " + df.format(areaRectangulo));
        System.out.println("\nPerimetro del rectangulo: " + df.format(perimetroRectangulo));
        System.out.println(".......................................");
    }
     
    }
   
