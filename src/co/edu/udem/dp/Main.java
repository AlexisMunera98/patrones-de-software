package co.edu.udem.dp;

import co.edu.udem.dp.cocina.Cocina;
import co.edu.udem.dp.cocina.Receta;
import co.edu.udem.dp.factories.*;
import co.edu.udem.dp.motivos.Motivo;
import co.edu.udem.dp.servicios.Servicio;
import co.edu.udem.dp.visitors.ReservasHechas;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Cocina cocina = CocinaFactory.getCocinaFactory().createCocina("Jefe", "1234");
        cocina.nuevoClienteNatural("Cliente1", "1");
        cocina.nuevoClienteNatural("Cliente2", "2");
        cocina.nuevoClienteVip("Cliente3", "3");

        Servicio torta = ServicioFactory.getInstance().crearServicio("Torta", 25000);
        Servicio serenata = ServicioFactory.getInstance().crearServicio("Serenata", 20000, 2);
        Motivo cumpleanos = MotivoFactory.getInstance().createMotivo("Cumpleaños", Arrays.asList(torta, serenata));

        cocina.anadirReservable(ReservableFactory.getInstance().crearMesa(cumpleanos, 4));
        Receta pizza = RecetaFactory.getInstance().crearRecetaPizza();
        cocina.addReceta(pizza);
        cocina.anadirReservable(PlatoFactory.getInstance().crearPlato(cumpleanos,pizza, false));

        cocina.nuevoClienteNatural("Pepito", "1");
        cocina.nuevoClienteNatural("Juanito", "2");
        cocina.nuevoClienteVip("Anderson", "3");
        if (!cocina.hacerReserva(cocina.reservables, cumpleanos, cocina.clientes.get(0))){
            System.out.println("No hay ingredientes suficientes para realizar la reserva");
        }
        ReservasHechas recorrerReservasHechas = new ReservasHechas();
        cocina.accept(recorrerReservasHechas);
    }
}
