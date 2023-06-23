package Ejercicio3_Guia12_Extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import Ejercicio3_Guia12_Extra_entidades.Alojamiento;
import Ejercicio3_Guia12_Extra_entidades.Camping;
import Ejercicio3_Guia12_Extra_entidades.Hotel;
import Ejercicio3_Guia12_Extra_entidades.HotelCincoEstrellas;
import Ejercicio3_Guia12_Extra_entidades.HotelCuatroEstrellas;
import Ejercicio3_Guia12_Extra_entidades.Residencia;

// Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
// • todos los alojamientos.
// • todos los hoteles de más caro a más barato.
// • todos los campings con restaurante
// • todos las residencias que tienen descuento.

public class AlojamientoTuristas {

    public static void main(String[] args) {
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        alojamientos.add(new HotelCuatroEstrellas("Hotel A", "Calle 123", "Ciudad A", "Gerente A",
                100, 200, 5, "A", "Restaurante A", 40));
        alojamientos.add(new HotelCincoEstrellas("Hotel B", "Calle 456", "Ciudad B", "Gerente B",
                200, 400, 10, "B", "Restaurante B", 60, 5, 10, 3));
        alojamientos.add(new Camping("Camping C", "Calle 789", "Ciudad C", "Gerente C",
                true, 1000, 50, 10, true));
        alojamientos.add(new Residencia("Residencia D", "Calle 987", "Ciudad D", "Gerente D",
                false, 500, 30, true, false));

        // Consulta: todos los alojamientos
        System.out.println("\nTodos los alojamientos:");
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println("Nombre: " + alojamiento.getNombre());
            System.out.println("Dirección: " + alojamiento.getDireccion());
            System.out.println("Localidad: " + alojamiento.getLocalidad());
            System.out.println("Gerente: " + alojamiento.getGerente());
            System.out.println();
        }

        /// Consulta: todos los hoteles de más caro a más barato
        ArrayList<Hotel> hoteles = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) {
                hoteles.add((Hotel) alojamiento);
            }
        }

        System.out.println("Hoteles de más caro a más barato:");
        Collections.sort(hoteles, new Comparator<Hotel>() {
            @Override
            public int compare(Hotel h1, Hotel h2) {
                return Double.compare(h2.getCantidadHabitaciones(), h1.getCantidadHabitaciones());
            }
        });

        for (Hotel hotel : hoteles) {
            System.out.println("Nombre: " + hotel.getNombre());
            System.out.println("Dirección: " + hotel.getDireccion());
            System.out.println("Localidad: " + hotel.getLocalidad());
            System.out.println("Gerente: " + hotel.getGerente());
            System.out.println("Precio habitaciones: " + hotel.getCantidadHabitaciones());
            System.out.println();
        }

        // Consulta: todos los campings con restaurante
        System.out.println("Campings con restaurante:");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                Camping camping = (Camping) alojamiento;
                if (camping.tieneRestaurante()) {
                    System.out.println("Nombre: " + camping.getNombre());
                    System.out.println("Dirección: " + camping.getDireccion());
                    System.out.println("Localidad: " + camping.getLocalidad());
                    System.out.println("Gerente: " + camping.getGerente());
                    System.out.println();
                }
            }
        }
        
        // Consulta: todas las residencias que tienen descuento
        System.out.println("Residencias con descuento:");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia) {
                Residencia residencia = (Residencia) alojamiento;
                if (residencia.tieneDescuentoGremios()) {
                    System.out.println("Nombre: " + residencia.getNombre());
                    System.out.println("Dirección: " + residencia.getDireccion());
                    System.out.println("Localidad: " + residencia.getLocalidad());
                    System.out.println("Gerente: " + residencia.getGerente());
                    System.out.println();
                }
            }
        }
    }
}






