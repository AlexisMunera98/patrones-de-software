package co.edu.udem.dp;

import co.edu.udem.dp.Imp.ClienteVip;
import co.edu.udem.dp.Interfaces.Cliente;
import co.edu.udem.dp.Interfaces.Reservable;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cocina cocina = new Cocina();
        Jefe jefe = new Jefe("Jefe", "1234", cocina);
        List<Reservable> mesas = new ArrayList<Reservable>();

        Mesa mesa1 = new Mesa();
        Mesa mesa2 = new Mesa();

        mesas.add(mesa1);
        mesas.add(mesa2);

        cocina.setMesas(mesas);

        Cliente cliente = new ClienteVip();
        Cliente cliente2 = new ClienteVip();


        List<Servicio> servicios = new ArrayList<Servicio>();

        Servicio servicio1 = new Servicio();
        Servicio servicio2 = new Servicio();

        servicios.add(servicio2);

        Motivo motivo1 = new Motivo();
        motivo1.setServicios(servicios);

    }
}
