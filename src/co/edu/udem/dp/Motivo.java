package co.edu.udem.dp;

import java.util.List;

public class Motivo {
    public String nombre;
    public List<Servicio> servicios;

    public Motivo(String nombre, List<Servicio> servicios) {
        this.nombre = nombre;
        this.servicios = servicios;
    }

    public double calcularPrecio() {
        double total = 0;
        for (Servicio servicio : servicios) {
            total += (servicio.precio * servicio.horas);
        }
        return total;
    }
}
