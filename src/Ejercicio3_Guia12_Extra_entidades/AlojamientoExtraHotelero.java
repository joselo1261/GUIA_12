package Ejercicio3_Guia12_Extra_entidades;

// En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
// hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
// Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
// cuadrados que ocupa.
// Existen dos tipos de alojamientos extrahoteleros: los Camping y las Residencias.

public class AlojamientoExtraHotelero extends Alojamiento {
    protected boolean esPrivado;
    protected double metrosCuadrados;

    public AlojamientoExtraHotelero(String nombre, String direccion, String localidad, String gerente,
            boolean esPrivado, double metrosCuadrados) {
        super(nombre, direccion, localidad, gerente);
        this.esPrivado = esPrivado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isEsPrivado() {
        return esPrivado;
    }

    public void setEsPrivado(boolean esPrivado) {
        this.esPrivado = esPrivado;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public double getPrecioHabitacion() {
        // No aplica para alojamientos extrahoteleros
        return 0;
    }
        
}
