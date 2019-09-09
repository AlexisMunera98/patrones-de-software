package co.edu.udem.dp.servicios;

public class Serenata extends Servicio {
    public Serenata(String nombre, double precio, int horas) {
        this.nombre = nombre;
        this.precio = precio;
        this.horas = horas;
    }

    public Serenata(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String servir() {
        return "Suena musiquita chevere";
    }
}
