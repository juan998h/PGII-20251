public class Main {
    public static void main(String[] args) {
        HotelManager hotel = HotelManager.getInstancia();

        Cliente cliente1 = new Cliente("Juan Pérez", "12345678A");
        hotel.registrarCliente(cliente1);

        Habitacion habitacion1 = new Habitacion(101, "Doble", 100.0);
        hotel.agregarHabitacion(habitacion1);

        hotel.realizarReserva(cliente1, habitacion1, "2025-03-10", "2025-03-15");

        System.out.println("Clientes en el hotel: " + hotel.getClientes().size());
        System.out.println("Reservas registradas: " + hotel.getReservas().size());
    }
}

