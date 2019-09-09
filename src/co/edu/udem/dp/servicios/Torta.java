package co.edu.udem.dp.servicios;

public class Torta extends Servicio {
    public Torta(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Torta(String nombre, double precio, int horas) {
        this.nombre = nombre;
        this.precio = precio;
        this.horas = horas;
    }

    @Override
    public String servir() {
        return "Le sirven una torta muy rica";
    }
}
