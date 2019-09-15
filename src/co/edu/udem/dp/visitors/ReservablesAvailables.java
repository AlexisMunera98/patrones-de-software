package co.edu.udem.dp.visitors;

import co.edu.udem.dp.cocina.Cocina;
import co.edu.udem.dp.Reserva;
import co.edu.udem.dp.reservables.Reservable;

import java.util.List;

public class ReservablesAvailables implements Visitor {

    public void run(Cocina cocina) {
        for (Reserva reserva : cocina.reservas) {
            List<Reservable> reservables = reserva.getReservables();
            for (Reservable reservable :
                    reservables) {
                if (reservable.isAvailable) System.out.println(reservable);
            }
        }
    }
}
