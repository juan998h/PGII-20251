package co.edu.uniquindio.poo;

public class Reserva {
    private Date fechaSalida,fechaEntrada;

    public Reserva(Date fechaSalida,Date fechaEntrada) {
        this.fechaSalida = fechaSalida;
        this.fechaEntrada = fechaEntrada;
    }
    public Date getFechaSalida() {
        return fechaSalida;
    }
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    public Date getFechaEntrada() {
        return fechaEntrada;
    }
    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

}