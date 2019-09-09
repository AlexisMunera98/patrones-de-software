package co.edu.udem.dp.servicios;

public abstract class Servicio {
    public String nombre;
    public double precio;
    public int horas;

    public abstract String servir();
}
