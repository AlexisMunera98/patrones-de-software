package co.edu.udem.dp.factories;

import co.edu.udem.dp.imp.ClienteNatural;
import co.edu.udem.dp.imp.ClienteVip;

import java.time.Instant;
import java.util.Date;

public class ClientFactory {
    private static ClientFactory clientFactory;

    public ClientFactory() {
    }

    public static ClientFactory getclientFactory() {
        if (clientFactory == null) {
            clientFactory = new ClientFactory();
        }
        return clientFactory;
    }

    public ClienteVip createClienteVip(String nombre, String id){
        return new ClienteVip(nombre, id, Date.from(Instant.now()));
    }

    public ClienteNatural createClienteNatural(String nombre, String id){
        return new ClienteNatural(nombre, id, Date.from(Instant.now()));
    }
}
