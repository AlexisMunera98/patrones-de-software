package co.edu.udem.dp.visitors;

import co.edu.udem.dp.Cocina;
import co.edu.udem.dp.interfaces.Visitor;
import co.edu.udem.dp.Reserva;

import java.time.Instant;
import java.util.Date;
import java.util.List;

public class RecorrerReservasHechasVisitor implements Visitor {


    public void run(Cocina cocina) {
        List<Reserva> reservas = cocina.reservas;
        for (Reserva reserva :
                reservas) {
            Date fechaIngreso = reserva.fechaReserva;
            Date now = Date.from(Instant.now());
            if (fechaIngreso.before(now)) {
                System.out.println(reserva.cliente.nombre);
            }
        }
    }
}
