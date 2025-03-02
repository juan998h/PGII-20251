package co.edu.uniquindio.poo;

public abstract class Servicio implements Consumible {
    protected String nombre;
    protected double precio;

    public Servicio(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract void consumir();
