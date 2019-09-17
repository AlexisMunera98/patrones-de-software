package co.edu.udem.dp;

import co.edu.udem.dp.cocina.Cocina;
import co.edu.udem.dp.cocina.Receta;
import co.edu.udem.dp.factories.*;
import co.edu.udem.dp.motivos.Motivo;
import co.edu.udem.dp.reservables.Plato;
import co.edu.udem.dp.servicios.Servicio;
import co.edu.udem.dp.visitors.ReservasHechas;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Cocina cocina = CocinaFactory.getCocinaFactory().createCocina("Jefe", "1234");
        System.out.println("Inventario Inicial: ");
        System.out.println(cocina.inventario.toString());
        cocina.nuevoClienteNatural("Carlos", "1");
        cocina.nuevoClienteNatural("Juan", "2");
        cocina.nuevoClienteVip("Juanito alimaña", "666");
        cocina.nuevoClienteVip("Anderson", "4");
        System.out.println("Clientes iniciales:");
        System.out.println(cocina.clientesToString());

        Servicio torta = ServicioFactory.getInstance().crearServicio("Torta", 25000);
        Servicio serenata = ServicioFactory.getInstance().crearServicio("Serenata", 20000, 2);
        Motivo cumpleanos = MotivoFactory.getInstance().createMotivo("Cumpleaños", Arrays.asList(torta, serenata));

        cocina.anadirReservable(ReservableFactory.getInstance().crearMesa(cumpleanos, 4));
        Receta pizza = RecetaFactory.getInstance().crearRecetaPizza(cocina.inventario);
        cocina.addReceta(pizza);
        Plato platoPizza = (Plato) PlatoFactory.getInstance().crearPlato(cumpleanos,pizza, false);
        cocina.anadirReservable(platoPizza);

        if (!cocina.hacerReserva(cocina.reservables, cumpleanos, cocina.clientes.get(0))){
            System.out.println("No hay ingredientes suficientes para realizar la reserva");
        }
        System.out.println("Reservas hechas;");
        System.out.println(cocina.reservasToString());
        System.out.println(" ");
        ReservasHechas recorrerReservasHechas = new ReservasHechas();
        cocina.accept(recorrerReservasHechas);

        System.out.println("Inventario Final: ");
        System.out.println(cocina.inventario.toString());
    }
}
