
package Ejercicio1_Guia12_entidades;


public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }
    
    @Override
    public void alimentarse(){
       System.out.println("Soy un Gato y me alimento de " + alimento);
    } 
            
}