package co.edu.udem.dp.motivos;

import co.edu.udem.dp.servicios.Servicio;

import java.util.List;

public abstract class Motivo {
    public Motivo(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    protected List<Servicio> servicios;
    abstract public String mensaje();
}
