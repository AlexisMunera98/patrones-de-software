package co.edu.udem.dp;

import java.util.ArrayList;
import java.util.List;

public class Motivo {
    public String nombre;
    public List<Servicio> servicios;

    public Motivo(String nombre) {
        this.nombre = nombre;
        servicios = new ArrayList<>();
    }

    public void addServicio(String nombre, double precio, int horas) {

        servicios.add(new Servicio(nombre, precio, horas));
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public double calcularPrecio() {

        return 3000;
    }
}
