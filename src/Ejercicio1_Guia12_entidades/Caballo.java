
package Ejercicio1_Guia12_entidades;


public class Caballo extends Animal {
    String verde = "\033[32m";
    public Caballo() {
    }

    public Caballo(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }
    
    @Override
    public void alimentarse(){
       System.out.println(verde+"Soy un Caballo y me alimento de " + alimento);
    } 
}