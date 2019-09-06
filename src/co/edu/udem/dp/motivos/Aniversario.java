package co.edu.udem.dp.motivos;

import co.edu.udem.dp.servicios.Serenata;
import co.edu.udem.dp.servicios.Servicio;

import java.util.List;

public class Aniversario extends Motivo {
    public Aniversario(List<Servicio> servicios) {
        super(servicios);
    }

    @Override
    public String mensaje() {
        return "Feliz Año";
    }
}
