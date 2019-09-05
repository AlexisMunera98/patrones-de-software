package co.edu.udem.dp;

import co.edu.udem.dp.imp.ClienteVip;
import co.edu.udem.dp.interfaces.Cliente;
import co.edu.udem.dp.interfaces.Reservable;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cocina cocina = new Cocina();
        Jefe jefe = new Jefe("Jefe", "1234", cocina);
        cocina.setJefe(jefe);

        Mesa mesa1 = new Mesa();
        Mesa mesa2 = new Mesa();

        cocina.addReservable(mesa1);
        cocina.addReservable(mesa2);

        Cliente cliente = new ClienteVip();
        Cliente cliente2 = new ClienteVip();

        cocina.addCliente(cliente);
        cocina.addCliente(cliente2);


        Servicio servicio1 = new Servicio();
        Servicio servicio2 = new Servicio();


        Motivo motivo1 = new Motivo();
        motivo1.addServicio(servicio1);
        motivo1.addServicio(servicio2);

        mesa1.setMotivo(motivo1);

        cocina.hacerReserva(mesa1, motivo1, cliente);
    }
}
