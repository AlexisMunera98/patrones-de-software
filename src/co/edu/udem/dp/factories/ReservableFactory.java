package co.edu.udem.dp.factories;

import co.edu.udem.dp.reservables.Mesa;
import co.edu.udem.dp.conforts.Confort;
import co.edu.udem.dp.reservables.Reservable;
import co.edu.udem.dp.motivos.Motivo;

import java.util.List;

public class ReservableFactory {
    private static ReservableFactory reservableFactory;

    private ReservableFactory() {
    }

    public static ReservableFactory getInstance() {
        if (reservableFactory == null) {
            reservableFactory = new ReservableFactory();
        }
        return reservableFactory;
    }

    public Reservable createMesa(List<Confort> conforts, Motivo motivo, int cantidadComensales) {
        Mesa mesa = new Mesa(null, cantidadComensales);
        mesa.setMotivo(motivo);
        return mesa;
    }

    public Reservable createMesa(Motivo motivo, int cantidadComensales) {
        Mesa mesa = new Mesa(null, cantidadComensales);
        mesa.setMotivo(motivo);
        return mesa;
    }

    public Reservable createMesa(int cantidadComensales) {
        return new Mesa(null, cantidadComensales);
    }
}
