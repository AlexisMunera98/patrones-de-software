package co.edu.udem.dp.motivos;

import co.edu.udem.dp.servicios.Servicio;

import java.util.List;

public class Cumpleaños extends Motivo {
    public Cumpleaños(List<Servicio> servicios) {
        super("Cumpleanos", servicios);
    }

    @Override
    public String mensaje() {
        return "Feliz cumpleaños";
    }
}
