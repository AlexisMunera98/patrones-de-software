package co.edu.udem.dp.factories;

import co.edu.udem.dp.clientes.ClienteNatural;
import co.edu.udem.dp.clientes.ClienteVip;

import java.time.Instant;
import java.util.Date;

public class ClienteFactory {
    private static ClienteFactory clienteFactory;

    public ClienteFactory() {
    }

    public static ClienteFactory getclientFactory() {
        if (clienteFactory == null) {
            clienteFactory = new ClienteFactory();
        }
        return clienteFactory;
    }

    public ClienteVip crearClienteVip(String nombre, String id){
        return new ClienteVip(nombre, id, Date.from(Instant.now()));
    }

    public ClienteNatural crearClienteNatural(String nombre, String id){
        return new ClienteNatural(nombre, id, Date.from(Instant.now()));
    }
}
