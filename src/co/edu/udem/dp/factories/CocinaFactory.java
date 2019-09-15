package co.edu.udem.dp.factories;

import co.edu.udem.dp.cocina.Cocina;
import co.edu.udem.dp.Jefe;

public class CocinaFactory {
    private static CocinaFactory cocinaFactory;

    public CocinaFactory() {
    }

    public static CocinaFactory getCocinaFactory() {
        if (cocinaFactory == null) {
            cocinaFactory = new CocinaFactory();
        }
        return cocinaFactory;
    }

    public Cocina createCocina(Jefe jefe) {
        return new Cocina(jefe);
    }

    public Cocina createCocina(String nombreJefe, String idJefe) {
        return new Cocina(JefeFactory.getInstance().createJefe(nombreJefe, idJefe));
    }
}
