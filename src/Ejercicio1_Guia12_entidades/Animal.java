
package Ejercicio1_Guia12_entidades;


public class Animal {
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String razaAnimal;

    public Animal() {
    }

    public Animal(String nombre, String alimento, int edad, String razaAnimal) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.razaAnimal = razaAnimal;
    }

    public void alimentarse(){
    System.out.println("Soy un Animal ...... y me alimento de " + alimento);
    }

    String celeste = "\033[36m";
    String rojo = "\033[31m";
    
    @Override
    public String toString() {
        return "Nombre: " + nombre +"\nAlimento: " + alimento + "\nEdad: " + edad + "\nRaza Animal: " + razaAnimal;
    }   
}
