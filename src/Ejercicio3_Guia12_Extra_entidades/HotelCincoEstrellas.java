package Ejercicio3_Guia12_Extra_entidades;

// Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
// Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
// Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
// Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
// acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
// cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, 
// más caro será.

public class HotelCincoEstrellas extends Hotel {
    protected int cantidadSalonesConferencia;
    protected int cantidadSuites;
    protected int cantidadLimosinas;

    public HotelCincoEstrellas(String nombre, String direccion, String localidad, String gerente,
            int cantidadHabitaciones, int numeroCamas, int cantidadPisos, String gimnasioTipo, String nombreRestaurante,
            int capacidadRestaurante, int cantidadSalonesConferencia, int cantidadSuites, int cantidadLimosinas) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos, gimnasioTipo,
                nombreRestaurante, capacidadRestaurante);
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public int getCantidadSalonesConferencia() {
        return cantidadSalonesConferencia;
    }

    public void setCantidadSalonesConferencia(int cantidadSalonesConferencia) {
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    @Override
    public double getPrecioHabitacion() {
        double precioHabitacion = super.getPrecioHabitacion();
        precioHabitacion += valorAgregadoSalonesConferencia();
        precioHabitacion += valorAgregadoSuites();

        return precioHabitacion;
    }

    private double valorAgregadoSalonesConferencia() {
        // Supongamos que cada salón de conferencia tiene un costo fijo de $20
        return 20 * getCantidadSalonesConferencia();
    }

    private double valorAgregadoSuites() {
        // Supongamos que cada suite tiene un costo fijo de $25
        return 25 * getCantidadSuites();
    }
        
}
