package co.edu.udem.dp;

import co.edu.udem.dp.factories.*;
import co.edu.udem.dp.motivos.Motivo;
import co.edu.udem.dp.servicios.Servicio;
import co.edu.udem.dp.visitors.ReservasHechasVisitor;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Cocina cocina = CocinaFactory.getCocinaFactory().createCocina("Jefe", "1234");
        cocina.nuevoClienteNatural("Cliente1", "1");
        cocina.nuevoClienteNatural("Cliente2", "2");
        cocina.nuevoClienteVip("Cliente3", "3");

        Servicio torta = ServicioFactory.getInstance().createServicio("Torta", 25000);
        Servicio serenata = ServicioFactory.getInstance().createServicio("Gorros", 20000, 2);
        Motivo cumpleanos = MotivoFactory.getInstance().createMotivo("Cumpleaños", Arrays.asList(torta, serenata));

        cocina.añadirReservable(ReservableFactory.getInstance().createMesa(cumpleanos, 4));

        cocina.nuevoClienteNatural("Pepito", "1");
        cocina.nuevoClienteNatural("Juanito", "2");
        cocina.nuevoClienteVip("Anderson", "3");

        cocina.hacerReserva(cocina.reservables, cumpleanos, cocina.clientes.get(0));
        ReservasHechasVisitor recorrerReservasHechasVisitor = new ReservasHechasVisitor();
        cocina.accept(recorrerReservasHechasVisitor);

        JefeFactory jefeFactory = JefeFactory.getInstance();
    }
}
