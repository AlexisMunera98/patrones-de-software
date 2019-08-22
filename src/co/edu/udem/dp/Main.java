package co.edu.udem.dp;

import co.edu.udem.dp.Imp.ClienteVip;
import co.edu.udem.dp.Interfaces.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Cocina cocina = new Cocina();
        Jefe jefe = new Jefe("Jefe", "1234", cocina);
        List<Mesa> mesas = new ArrayList<Mesa>();

        Motivo motivo1 = new Motivo();
        Mesa mesa1 = new Mesa(motivo1);
        Mesa mesa2 = new Mesa(motivo1);
        Mesa mesa3 = new Mesa(motivo1);
        Mesa mesa4 = new Mesa(motivo1);
        Mesa mesa5 = new Mesa(motivo1);
        mesas.add(mesa1);
        mesas.add(mesa2);
        mesas.add(mesa3);
        mesas.add(mesa4);
        mesas.add(mesa5);

        List<Servicio> servicios = new ArrayList<Servicio>();
        Servicio servicio1 = new Servicio();
        Servicio servicio2 = new Servicio();
        Servicio servicio3 = new Servicio();
        servicios.add(servicio1);
        servicios.add(servicio2);
        servicios.add(servicio3);

        motivo1.setServicios(servicios);


        cocina.setMesas(mesas);

        Cliente cliente = new ClienteVip();
        Reserva reserva = new Reserva();
        reserva.setMesa(mesa1);
        reserva.setCliente(cliente);

    }
}
