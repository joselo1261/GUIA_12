package Ejercicio3_Guia12_Extra_entidades;

// Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
// Pisos, Precio de Habitaciones.

public class Hotel extends Alojamiento {
    private int cantidadHabitaciones;
    private int numeroCamas;
    private int cantidadPisos;
    private String gimnasioTipo;
    private String nombreRestaurante;
    private int capacidadRestaurante;

    public Hotel(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones,
            int numeroCamas, int cantidadPisos, String gimnasioTipo, String nombreRestaurante,
            int capacidadRestaurante) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.gimnasioTipo = gimnasioTipo;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public String getGimnasioTipo() {
        return gimnasioTipo;
    }

    public void setGimnasioTipo(String gimnasioTipo) {
        this.gimnasioTipo = gimnasioTipo;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public double getPrecioHabitacion() {
        double precioHabitacion = 50 + (1 * getCantidadHabitaciones());
        precioHabitacion += valorAgregadoRestaurante();
        precioHabitacion += valorAgregadoGimnasio();
        precioHabitacion += valorAgregadoLimosinas();
        return precioHabitacion;
    }

    private double valorAgregadoRestaurante() {
        if (getCapacidadRestaurante() < 30) {
            return 10;
        } else if (getCapacidadRestaurante() >= 30 && getCapacidadRestaurante() <= 50) {
            return 30;
        } else {
            return 50;
        }
    }

    private double valorAgregadoGimnasio() {
        if (getGimnasioTipo().equals("A")) {
            return 50;
        } else {
            return 30;
        }
    }

    // Supongamos que el hotel tiene una cantidad fija de limosinas
    private int getCantidadLimosinas() {
        if (this instanceof HotelCincoEstrellas) {
            return 5; // Ejemplo: hotel 5 estrellas tiene 5 limosinas
        } else {
            return 0; // Ejemplo: hotel 4 estrellas no tiene limosinas
        }
    }

    private double valorAgregadoLimosinas() {
        // Supongamos que cada limosina tiene un costo fijo de $15
        return 15 * getCantidadLimosinas();
    }
    
}

