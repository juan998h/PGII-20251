package co.edu.uniquindio.poo;

public class Habitacion {
    private int numero;
    private double precio;
    TipoHabitacion tipo;

    public Habitacion(int numero, double precio, TipoHabitacion tipo) {
        this.numero = numero;
        this.precio = precio;
        this.tipo = tipo;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;

    }

    public double getPrecio() {
        return precio;

    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public TipoHabitacion getTipo() {
        return tipo;
    }
    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }

}