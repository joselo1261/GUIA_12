
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRazaAnimal() {
        return razaAnimal;
    }

    public void setRazaAnimal(String razaAnimal) {
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
