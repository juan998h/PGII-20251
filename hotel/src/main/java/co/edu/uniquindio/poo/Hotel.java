package co.edu.uniquindio.poo;

public abstract class Hotel {

    protected Servicio servicio;

    public Hotel() {
        this.servicio = Servicio.getInstancia();
    }


    public abstract void TipoHabitacion();
}