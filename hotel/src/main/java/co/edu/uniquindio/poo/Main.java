package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Hotel hotel = Hotel.getInstancia();

        Cliente cliente1 = new Cliente("Juan Pérez", "12345678A");
        hotel.registrarCliente(cliente1);

        Habitacion habitacion1 = new Habitacion(101, 100, TipoHabitacion.DOBLE);
        hotel.agregarHabitacion(habitacion1);

        LocalDate fechaEntrada = LocalDate.of(2025, 3, 10);
        LocalDate fechaSalida = LocalDate.of(2025, 3, 15);

        hotel.realizarReserva(cliente1, habitacion1, fechaEntrada, fechaSalida);

        System.out.println("Clientes en el hotel: " + hotel.getClientes().size());
        System.out.println("Reservas registradas: " + hotel.getReservas().size());
    }
}

