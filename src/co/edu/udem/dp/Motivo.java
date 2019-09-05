package co.edu.udem.dp;

import java.util.List;

public class Motivo {
    public String nombre;
    public List<Servicio> servicios;

    public void addServicio(Servicio servicio){
        servicios.add(servicio);
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public double calcularPrecio() {

        return 3000;
    }
}
