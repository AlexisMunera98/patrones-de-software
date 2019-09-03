package co.edu.udem.dp;

import co.edu.udem.dp.factories.CocinaFactory;
import co.edu.udem.dp.imp.ClienteVip;
import co.edu.udem.dp.interfaces.Cliente;
import co.edu.udem.dp.interfaces.Reservable;
import co.edu.udem.dp.factories.JefeFactory;
import co.edu.udem.dp.visitors.RecorrerReservasHechasVisitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Cocina cocina = new Cocina();
//        Jefe jefe = new Jefe("Jefe", "1234", cocina);
        
        Cocina cocina = CocinaFactory.getCocinaFactory().createCocina("Jefe", "1234");
        cocina.newNaturalClient("Cliente1", "1");
        cocina.newNaturalClient("Cliente2", "2");
        cocina.newVipClient("Cliente3", "3");


        List<Reservable> mesas = new ArrayList<Reservable>();

        Mesa mesa1 = new Mesa();
        Mesa mesa2 = new Mesa();

        mesas.add(mesa1);
        mesas.add(mesa2);

//        Cliente cliente = new ClienteVip();
//        Cliente cliente2 = new ClienteVip();

        List<Servicio> servicios = new ArrayList<Servicio>();

        Servicio servicio1 = new Servicio();
        Servicio servicio2 = new Servicio();

        servicios.add(servicio2);

        Motivo motivo1 = new Motivo();
        motivo1.setServicios(servicios);

        RecorrerReservasHechasVisitor recorrerReservasHechasVisitor = new RecorrerReservasHechasVisitor();
        cocina.accept(recorrerReservasHechasVisitor);

        JefeFactory jefeFactory = JefeFactory.getInstance();
    }
}
