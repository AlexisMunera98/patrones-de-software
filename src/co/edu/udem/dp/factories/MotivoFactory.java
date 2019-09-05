package co.edu.udem.dp.factories;

import co.edu.udem.dp.Motivo;
import co.edu.udem.dp.Servicio;

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
        return new Motivo(nombre, servicios);
    }
}
