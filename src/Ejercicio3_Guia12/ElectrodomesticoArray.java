
package Ejercicio3_Guia12;

import Ejercicio2_Guia12_entidades.Electrodomestico;
import Ejercicio2_Guia12_entidades.Lavadora;
import Ejercicio2_Guia12_entidades.Televisor;
import java.util.ArrayList;


public class ElectrodomesticoArray {

    
// Siguiendo el ejercicio 2, en el main vamos a crear un ArrayList de Electrodomésticos
// para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
// Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
// deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
// televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
// precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
// 2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
// electrodomésticos, 2000 para lavadora y 5000 para televisor.
   
    public static void main(String[] args) {
       
    ArrayList<Electrodomestico> electros = new ArrayList();  
       
        Lavadora l3 = new Lavadora (45, 100000,"negro",'Z',50);
        Lavadora l4 = new Lavadora (10, 100000,"negro",'A',70);
        
        Televisor t4 = new Televisor(55,true,230000, "negro",'B',10);
        Televisor t5 = new Televisor(24,true,80000, "negro",'B',5);
    
        electros.add(l3);
        electros.add(l4);
        electros.add(t4);
        electros.add(t5);
        
        double precioTotalElectro = 0;
        double precioTotalLava = 0;
        double precioTotalTele = 0;
        
        for (Electrodomestico electro : electros) {
            double precioFinal = electro.precioFinal();
            precioTotalElectro += precioFinal;

            if (electro instanceof Lavadora) {
                precioTotalLava += precioFinal;
            } else if (electro instanceof Televisor) {
                precioTotalTele += precioFinal;
            }
        }
        System.out.println("Precio Total Electrodomésticos => " + precioTotalElectro);
        System.out.println("\nPrecio Total Lavadoras         => " + precioTotalLava);
        System.out.println("\nPrecio Total Televisores       => " + precioTotalTele);
        System.out.println("");
       
    }
}
