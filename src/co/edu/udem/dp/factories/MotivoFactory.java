package co.edu.udem.dp.factories;

import co.edu.udem.dp.motivos.Aniversario;
import co.edu.udem.dp.motivos.Cumpleaños;
import co.edu.udem.dp.motivos.Motivo;
import co.edu.udem.dp.servicios.Servicio;

import java.util.List;

public class MotivoFactory {
    private static MotivoFactory motivoFactory;

    private MotivoFactory() {
    }

    public static MotivoFactory getInstance() {
        if (motivoFactory == null) {
            motivoFactory = new MotivoFactory();
        }
        return motivoFactory;
    }

    public Motivo createMotivo(String nombre, List<Servicio> servicios){
        if (nombre.equals("Cumpleaños")) {
            return new Cumpleaños(servicios);
        }
        if(nombre.equals("Aniversario")){
            return new Aniversario(servicios);
        }
        return null;
    }
}
