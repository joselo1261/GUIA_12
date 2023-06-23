
package Ejercicio4_Guia12_Extra;

import Ejercicio4_Guia12_Extra_entidades.Estudiante;
import Ejercicio4_Guia12_Extra_entidades.Persona;
import Ejercicio4_Guia12_Extra_entidades.PersonalServicio;
import Ejercicio4_Guia12_Extra_entidades.Profesor;

// Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
// la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
// tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
// información debe gestionar esta aplicación:
// • Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
// identificación y su estado civil.
// • Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
// incorporación a la facultad y qué número de despacho tienen asignado.
// • En cuanto a los estudiantes, se requiere almacenar el curso en el que están
// matriculados.
// • Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
// pertenecen (lenguajes, matemáticas, arquitectura, ...).
// • Sobre el personal de servicio, hay que conocer a qué sección están asignados
// (biblioteca, decanato, secretaría, ...).
// El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
// continuación, debe programar las clases definidas en las que, además de los constructores,
// hay que desarrollar los métodos correspondientes a las siguientes operaciones:
// • Cambio del estado civil de una persona.
// • Reasignación de despacho a un empleado.
// • Matriculación de un estudiante en un nuevo curso.
// • Cambio de departamento de un profesor.
// • Traslado de sección de un empleado del personal de servicio.
// • Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
// que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.

public class FacultadMain {

    public static void main(String[] args) {
        String amarillo = "\033[33m";
        String magenta = "\033[35m";
        String celeste = "\033[36m";

        Estudiante estudiante = new Estudiante("Jose", "Perez", "123456", "Soltero", "Full Stack");
        Profesor profesor = new Profesor("Emiliano", "Estevez", "654321", "Casado", 2020, "A04", "Informatica");
        PersonalServicio personalServicio = new PersonalServicio("Lusiano", "Garcia", "66666", "Separado", 2010, "9B", "Mantenimiento");

        // Imprimir Original
        System.out.println(amarillo+"\nInformacion Estudiante:");
        System.out.println("-----------------------");
        System.out.println(estudiante.toString());

        System.out.println(magenta+"\nInformacion Profesor:");
        System.out.println("---------------------");
        System.out.println(profesor.toString());

        System.out.println(celeste+"\nInformacion Personal Servicio:");
        System.out.println("------------------------------");
        System.out.println(personalServicio.toString());
        System.out.println( );

        // Realizar cambios
        estudiante.matricularEnCurso("UX");
        profesor.cambiarDepartamento("Ciencias");
        personalServicio.trasladarSeccion("Controller");

        // Imprimir Cambiado
        String rojo = "\033[31m";
        System.out.println(rojo+"DESPUES DEL CAMBIO");
        System.out.println("******************");
        System.out.println(amarillo+"Informacion Estudiante:");
        System.out.println("-----------------------");
        System.out.println(estudiante.toString());

        System.out.println(magenta+"\nInformacion Profesor:");
        System.out.println("---------------------");
        System.out.println(profesor.toString());

        System.out.println(celeste+"\nInformacion Personal Servicio:");
        System.out.println("------------------------------");
        System.out.println(personalServicio.toString());
        System.out.println( );
    }
}
