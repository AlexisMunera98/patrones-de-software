package co.edu.udem.dp.factories;

import co.edu.udem.dp.Cocina;
import co.edu.udem.dp.Jefe;

public class JefeFactory {
    private static JefeFactory jefeFactory;

    private JefeFactory() {
    }

    public static JefeFactory getInstance(){
        if (jefeFactory == null){
            jefeFactory = new JefeFactory();
        }
        return jefeFactory;
    }

    public Jefe createJefe(String nombre, String id){
        return new Jefe(nombre, id);
    }

}
