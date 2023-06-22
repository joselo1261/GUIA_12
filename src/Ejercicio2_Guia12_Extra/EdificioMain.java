
package Ejercicio2_Guia12_Extra;

import Ejercicio2_Guia12_Extra_entidades.Edificio;
import Ejercicio2_Guia12_Extra_entidades.EdificioDeOficinas;
import Ejercicio2_Guia12_Extra_entidades.Polideportivo;
import java.util.ArrayList;


// Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
// edificio tendrá como métodos:
// • Método calcularSuperficie(): calcula la superficie del edificio.
// • Método calcularVolumen(): calcula el volumen del edifico.
// Estos métodos serán abstractos y los implementarán las siguientes clases:
// • Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
// Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
// • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
// por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
// los atributos del padre.
// De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
// usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
// (suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
// cuantas personas entrarían en un piso y cuantas en todo el edificio.
// Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
// dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
// métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
// uperficie y el volumen de cada edificio.
// Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
// echados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
// antPersonas() y mostrar los resultados de cada edificio de oficinas.

public class EdificioMain {

   
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList();
        
        Polideportivo poli1 = new Polideportivo("Polideportivo 1", "Techado",20, 8, 25);
        Polideportivo poli2 = new Polideportivo("Polideportivo 2", "Abierto",25, 8, 30);
        
        EdificioDeOficinas edif1 = new EdificioDeOficinas(10, 10, 10, 5, 30, 3);
        EdificioDeOficinas edif2 = new EdificioDeOficinas(15, 10, 20, 7, 60, 4);
        
        edificios.add(poli1);
        edificios.add(poli2);
        edificios.add(edif1);
        edificios.add(edif2);
        
        int numTech = 0;
        int numAbtos = 0;
        
        for (Edificio edificio : edificios) {
            System.out.println("\nSuperficie: " + edificio.calcularSuperficie());
            System.out.println("Volumen: " + edificio.calcularVolumen());
            
            if (edificio instanceof Polideportivo) {
                Polideportivo polidep = (Polideportivo) edificio;
                if (polidep.getTipoInstalacion().equals("Techado")) {
                    System.out.println("Polideportivo techado");
                    numTech++;
                } else {
                    System.out.println("Polideportivo abierto");
                    numAbtos++;
                }
            } else if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edificioDeOficinas = (EdificioDeOficinas) edificio;
                edificioDeOficinas.cantPers();
            }
            
            System.out.println("----------------------------------");
        }
        
        System.out.println("Polideportivos techados: " + numTech);
        System.out.println("");
        System.out.println("Polideportivos abiertos: " + numAbtos);
        System.out.println("");
 }
}
        
        






