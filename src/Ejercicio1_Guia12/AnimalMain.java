
package Ejercicio1_Guia12;

import Ejercicio1_Guia12_entidades.Caballo;
import Ejercicio1_Guia12_entidades.Gato;
import Ejercicio1_Guia12_entidades.Perro;


public class AnimalMain {

   
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Perro perro1 = new Perro("Greta","Huesos",3,"Caniche");
        perro1.alimentarse();
        Gato gato1 = new Gato("Pelusa","Galletas",15,"Siames");
        gato1.alimentarse();
        Caballo caballo1 = new Caballo("Sparky","Pasto",25,"Fino");
        caballo1.alimentarse();
        Caballo caballo2 = new Caballo("Pepe","Pastizal",10,"Alazan");
        caballo2.alimentarse();

        System.out.println("\nPerro: ");
        System.out.println("------");
        System.out.println(perro1.toString());
        System.out.println("\nGato: ");
        System.out.println("-----");
        System.out.println(gato1.toString());
        System.out.println("\nCaballo: ");
        System.out.println("--------");
        System.out.println(caballo1.toString());
        System.out.println("");
        System.out.println(caballo2.toString());
        System.out.println("");
          
}

    
}
