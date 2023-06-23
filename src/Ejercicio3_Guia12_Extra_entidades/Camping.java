package Ejercicio3_Guia12_Extra_entidades;

// Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
// disponibles y si posee o no un restaurante dentro de las instalaciones.

public class Camping extends AlojamientoExtraHotelero{
    protected int capacidadMaximaCarpas;
    protected int cantidadBanios;
    protected boolean tieneRestaurante;

    public Camping(String nombre, String direccion, String localidad, String gerente, boolean esPrivado,
            double metrosCuadrados, int capacidadMaximaCarpas, int cantidadBanios, boolean tieneRestaurante) {
        super(nombre, direccion, localidad, gerente, esPrivado, metrosCuadrados);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBanios = cantidadBanios;
        this.tieneRestaurante = tieneRestaurante;
    }

    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public void setCapacidadMaximaCarpas(int capacidadMaximaCarpas) {
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
    }

    public int getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public boolean tieneRestaurante() {
        return tieneRestaurante;
    }

    public void setTieneRestaurante(boolean tieneRestaurante) {
        this.tieneRestaurante = tieneRestaurante;
    }
 
        
}
