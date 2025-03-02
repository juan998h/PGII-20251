import java.time.LocalDate;

public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;

    public Reserva(Cliente cliente, Habitacion habitacion, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public Cliente getCliente() { return cliente; }
    public Habitacion getHabitacion() { return habitacion; }
}
