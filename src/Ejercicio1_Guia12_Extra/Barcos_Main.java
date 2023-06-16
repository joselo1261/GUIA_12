
package Ejercicio1_Guia12_Extra;

import Ejercicio1_Guia12_Extra_entidades.Alquiler;
import Ejercicio1_Guia12_Extra_entidades.Barco;
import Ejercicio1_Guia12_Extra_entidades.BarcoMotor;
import Ejercicio1_Guia12_Extra_entidades.Velero;
import Ejercicio1_Guia12_Extra_entidades.Yate;
import java.time.LocalDate;


public class Barcos_Main {

// En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
// nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
// amarre y el barco que lo ocupará.
// Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
// Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
// • Número de mástiles para veleros.
// • Potencia en CV para barcos a motor.
// • Potencia en CV y número de camarotes para yates de lujo.
// Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
// alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
// multiplicando por 10 los metros de eslora).
// En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
// sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
// en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
// el número de camarotes.
// Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
// métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
// precio final de su alquiler.
   
    
    public static void main(String[] args) {
       
        
        Barco barco = new Barco("X1234", 20.2, 2001);
        Velero velero = new Velero("V1234", 15.5, 2000, 3);
        BarcoMotor barcom = new BarcoMotor("Y1234", 25.5, 2010,500);
        Yate yate = new Yate("Z1234", 35.3, 2015, 500,5);
        
             
        System.out.println("Alquiler Barco");
        System.out.println("--------------");
        Alquiler alq = new Alquiler("Jose Gomez", "12345678", LocalDate.of(2023, 6, 15),
                LocalDate.of(2023, 6, 20), 1, barco);
        double precioAlquiler = alq.calcularPrecioAlquiler();
        System.out.println("Precio Alquiler: " + precioAlquiler);
        System.out.println("");
        
        System.out.println("Alquiler Velero");
        System.out.println("---------------");
        Alquiler alq1 = new Alquiler("Jose Garcia", "23456789", LocalDate.of(2023, 6, 16),
                LocalDate.of(2023, 6, 24), 2, velero);
        precioAlquiler = alq1.calcularPrecioAlquiler();
        System.out.println("Precio Alquiler: " + precioAlquiler);
        System.out.println("");
        
        System.out.println("Alquiler Barco Motor");
        System.out.println("--------------------");
        Alquiler alq2 = new Alquiler("Jose Guzman", "34567890", LocalDate.of(2023, 6, 16),
                LocalDate.of(2023, 7, 30), 3, barcom);
        precioAlquiler = alq2.calcularPrecioAlquiler();
        System.out.println("Precio Alquiler: " + precioAlquiler);
        System.out.println("");
        
        System.out.println("Alquiler Yate");
        System.out.println("-------------");
        Alquiler alq3 = new Alquiler("Jose Esteves", "45678901", LocalDate.of(2023, 6, 20),
                LocalDate.of(2023, 7, 30), 4, yate);
        precioAlquiler = alq3.calcularPrecioAlquiler();
        System.out.println("Precio Alquiler: " + precioAlquiler);
        System.out.println("");
        

        
        
        
        
        
    }
}
