package co.edu.udem.dp;

import co.edu.udem.dp.factories.*;
import co.edu.udem.dp.imp.ClienteVip;
import co.edu.udem.dp.interfaces.Cliente;
import co.edu.udem.dp.interfaces.Reservable;
import co.edu.udem.dp.visitors.ReservasHechasVisitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Cocina cocina = new Cocina();
//        Jefe jefe = new Jefe("Jefe", "1234", cocina);

        Cocina cocina = CocinaFactory.getCocinaFactory().createCocina("Jefe", "1234");
        cocina.newNaturalClient("Cliente1", "1");
        cocina.newNaturalClient("Cliente2", "2");
        cocina.newVipClient("Cliente3", "3");

        Servicio torta = ServicioFactory.getInstance().createServicio("Torta", 25000);
        Servicio gorros = ServicioFactory.getInstance().createServicio("Gorros", 8000);
        Servicio serenata = ServicioFactory.getInstance().createServicio("Gorros", 20000, 2);
        Motivo cumpleanos = MotivoFactory.getInstance().createMotivo("Cumpleaños", Arrays.asList(torta, gorros, serenata));

        cocina.addReservable(ReservableFactory.getInstance().createMesa(cumpleanos, 4));

        cocina.newNaturalClient("Pepito", "1");
        cocina.newNaturalClient("Juanito", "2");
        cocina.newVipClient("Anderson", "3");

        cocina.hacerReserva(cocina.reservables.get(0), cumpleanos, cocina.clientes.get(0));
        ReservasHechasVisitor recorrerReservasHechasVisitor = new ReservasHechasVisitor();
        cocina.accept(recorrerReservasHechasVisitor);

        JefeFactory jefeFactory = JefeFactory.getInstance();
    }
}
