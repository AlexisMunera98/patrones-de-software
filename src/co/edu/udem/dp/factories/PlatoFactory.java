package co.edu.udem.dp.factories;

import co.edu.udem.dp.cocina.Receta;
import co.edu.udem.dp.conforts.Confort;
import co.edu.udem.dp.motivos.Motivo;
import co.edu.udem.dp.reservables.Mesa;
import co.edu.udem.dp.reservables.Plato;
import co.edu.udem.dp.reservables.Reservable;

import java.util.List;

public class PlatoFactory {
    private static PlatoFactory platoFactory;

    private PlatoFactory() {
    }

    public static PlatoFactory getInstance() {
        if (platoFactory== null) {
            platoFactory= new PlatoFactory();
        }
        return platoFactory;
    }

    public Reservable crearPlato(Motivo motivo, Receta receta, boolean esMedio, double precioBase) {
        Plato plato = new Plato(esMedio, receta, precioBase );
        plato.setMotivo(motivo);
        return plato;

    }

}
