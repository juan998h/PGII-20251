package co.edu.uniquindio.poo;
public class Cliente {
    private String nombre;
    private int DNI;
    private boolean reserva;

    public Cliente(String nombre, int DNI, boolean reserva) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.reserva = reserva;

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDNI() {
        return DNI;
    }
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    public boolean isReserva() {
        return reserva;
    }
    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }
}