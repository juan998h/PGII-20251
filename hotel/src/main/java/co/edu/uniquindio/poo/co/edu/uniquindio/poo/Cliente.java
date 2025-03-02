package co.edu.uniquindio.poo;
import java.util.ArrayList;
import java.util.List;


public class Cliente {
    private String nombre;
    private String dni;
    private List<Reserva> reservas;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.reservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Reserva> getReservas() { return reservas; }
}

