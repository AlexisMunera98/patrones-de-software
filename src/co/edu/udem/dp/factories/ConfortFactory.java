package co.edu.udem.dp.factories;

import co.edu.udem.dp.conforts.Televisor;
import co.edu.udem.dp.conforts.Confort;

public class ConfortFactory {
    private static ConfortFactory confortFactory;

    public ConfortFactory() {
    }

    public static ConfortFactory getconfortFactory() {
        if (confortFactory == null) {
            confortFactory = new ConfortFactory();
        }
        return confortFactory;
    }

    public Confort createTelevisor(){
        return new Televisor();
    }
}
