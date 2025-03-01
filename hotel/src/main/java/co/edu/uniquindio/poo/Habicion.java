package co.edu.uniquindio.poo;

public class Habitacion {
    private int numero;
    private String tipo;
    private double precio;

    public Habitacion(int numero, String tipo, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getNumero() { return numero; }
    public String getTipo() { return tipo; }
    public double getPrecio() { return precio; }
}
