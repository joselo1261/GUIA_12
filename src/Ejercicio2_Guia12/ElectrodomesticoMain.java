
package Ejercicio2_Guia12;

import Ejercicio2_Guia12_entidades.Lavadora;
import Ejercicio2_Guia12_entidades.Televisor;


public class ElectrodomesticoMain {

   
    public static void main(String[] args) {
        Lavadora l1 = new Lavadora (45, 100000,"negro",'Z',50);
        Lavadora l2 = new Lavadora (10, 100000,"negro",'A',70);
        
        Televisor t1 = new Televisor(55,true,230000, "negro",'B',10);
        Televisor t2 = new Televisor(24,true,80000, "negro",'B',5);
        Televisor t3 = new Televisor(24,false,80000, "negro",'B',5);
        
        String amarillo = "\033[33m";
        System.out.println("Electrodomestico");
        System.out.println("----------------");
        System.out.println(l1.toString());
        System.out.println("Precio Final: "+l1.precioFinal());
        System.out.println(amarillo+".......................");
        
        System.out.println("Electrodomestico");
        System.out.println("----------------");
        System.out.println(l2.toString());
        System.out.println("Precio Final: "+l2.precioFinal());
        System.out.println(amarillo+".......................");
        
        System.out.println("Electrodomestico");
        System.out.println("----------------");
        System.out.println(t1.toString());
        System.out.println("Precio Final: "+t1.precioFinal());
        System.out.println(amarillo+".......................");
        
        System.out.println("Electrodomestico");
        System.out.println("----------------");
        System.out.println(t2.toString());
        System.out.println("Precio Final: "+t2.precioFinal());
        System.out.println(amarillo+".......................");
        
        System.out.println("Electrodomestico");
        System.out.println("----------------");
        System.out.println(t3.toString());
        System.out.println("Precio Final: "+t3.precioFinal());
        System.out.println(amarillo+".......................");
    }   
 }
   
