package co.edu.udem.dp.visitors;

import co.edu.udem.dp.Cocina;
import co.edu.udem.dp.Reserva;
import co.edu.udem.dp.interfaces.Reservable;
import co.edu.udem.dp.interfaces.Visitor;

public class ReservablesAvailables implements Visitor {

    public void run(Cocina cocina) {
        for (Reserva reserva : cocina.reservas) {
            Reservable reservable = reserva.getReservable();
            if (reservable.isAvailable) System.out.println(reservable);
        }
    }
}
