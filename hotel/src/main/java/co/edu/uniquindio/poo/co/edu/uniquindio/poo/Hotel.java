package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Hotel {
    private static Hotel instancia;  // Instancia única
    private List<Habitacion> habitaciones;
    private List<Cliente> clientes;
    private List<Reserva> reservas;

    private Hotel() {  // Constructor privado
        habitaciones = new ArrayList<>();
        clientes = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public static Hotel getInstancia() {
        if (instancia == null) {
            instancia = new Hotel();
        }
        return instancia;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void realizarReserva(Cliente cliente, Habitacion habitacion, LocalDate fechaEntrada, LocalDate fechaSalida) {
        Reserva reserva = new Reserva(cliente, habitacion, fechaEntrada, fechaSalida);
        reservas.add(reserva);
        cliente.agregarReserva(reserva);
        System.out.println("Reserva realizada para " + cliente.getNombre());
    }


    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
