
package Ejercicio1_Guia12_Extra_entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Alquiler {
    private String nombreCliente;
    private String documentoCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, String documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public Alquiler(Barco barco) {
        this.barco = barco;
    }
    
    

    @Override
    public String toString() {
        return "Nombre Cliente => " + nombreCliente + "\nDocumento Cliente => " + documentoCliente
                + "\nFecha Alquiler => " + fechaAlquiler + "\nFecha Devolucion => " + fechaDevolucion + "\nPosicion Amarre => "
                + posicionAmarre+"\nDatos del Barco: "+"\n==============="+"\n"+barco;
    }

    public double calcularPrecioAlquiler() {
        long diasOcupacion = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        double modulo = barco.calcularModulo();
        return diasOcupacion * modulo;
    }
}
