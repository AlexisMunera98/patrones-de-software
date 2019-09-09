package co.edu.udem.dp.motivos;


import co.edu.udem.dp.servicios.Servicio;

import java.util.List;

public abstract class Motivo {
    public String nombre;
    public List<Servicio> servicios;

    public Motivo( String nombre,  List<Servicio> servicios) {
        this.nombre =nombre;
        this.servicios = servicios;
    }


    public double calcularPrecio() {
        double total = 0;
        for (Servicio servicio : servicios) {
            total += (servicio.precio* servicio.horas);
        }
        return total;
    }
    abstract public String mensaje();
}
