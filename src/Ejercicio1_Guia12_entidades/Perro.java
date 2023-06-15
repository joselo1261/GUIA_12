
package Ejercicio1_Guia12_entidades;


public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    String rojo = "\033[31m";
    
    @Override
    public void alimentarse(){
    System.out.println(rojo+"Soy un Perro y me alimento de " + alimento);
    }
    
}
    