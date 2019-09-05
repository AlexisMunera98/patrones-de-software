package co.edu.udem.dp;

public class Servicio {
    public String nombre;
    public double precio;
    public int horas;

    public Servicio(String nombre, double precio, int horas) {
        this.nombre = nombre;
        this.precio = precio;
        this.horas = horas;
    }

    public double getTotal() {
        if (horas==0){
            return precio;
        }
        return horas * precio;
    }
}
