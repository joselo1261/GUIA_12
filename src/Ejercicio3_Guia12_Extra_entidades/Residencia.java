package Ejercicio3_Guia12_Extra_entidades;

// Para las residencias se indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
// campo deportivo.

public class Residencia extends AlojamientoExtraHotelero{
    private int cantidadHabitaciones;
    private boolean descuentoGremios;
    private boolean tieneCampoDeportivo;

    
    public Residencia(String nombre, String direccion, String localidad, String gerente, boolean esPrivado,
            double metrosCuadrados, int cantidadHabitaciones, boolean descuentoGremios, boolean tieneCampoDeportivo) {
        super(nombre, direccion, localidad, gerente, esPrivado, metrosCuadrados);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }


    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }


    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }


    public boolean tieneDescuentoGremios() {
        return descuentoGremios;
    }


    public void setDescuentoGremios(boolean descuentoGremios) {
        this.descuentoGremios = descuentoGremios;
    }


    public boolean isTieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }


    public void setTieneCampoDeportivo(boolean tieneCampoDeportivo) {
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    
}
