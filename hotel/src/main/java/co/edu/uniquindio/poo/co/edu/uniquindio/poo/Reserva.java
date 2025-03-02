package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;

    public Reserva(Cliente cliente, Habitacion habitacion, LocalDate fechaEntrada, LocalDate fechaSalida) {
        if (fechaSalida.isBefore(fechaEntrada)) {
            throw new IllegalArgumentException("La fecha de salida no puede ser anterior a la de entrada.");
        }
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public Cliente getCliente() { return cliente; }
    public Habitacion getHabitacion() { return habitacion; }
    public LocalDate getFechaEntrada() { return fechaEntrada; }
    public LocalDate getFechaSalida() { return fechaSalida; }

    @Override
    public String toString() {
        return "Reserva{" +
                "cliente=" + cliente.getNombre() +
                ", habitacion=" + habitacion.getNumero() +
                ", fechaEntrada=" + fechaEntrada +
                ", fechaSalida=" + fechaSalida +
                '}';
    }
}