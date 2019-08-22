package co.edu.udem.dp;

public class Servicio {
    public String nombre;
    public double precio;
    public int horas;

    public double getTotal() {
        return horas * precio;
    }
}
