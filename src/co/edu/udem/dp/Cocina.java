package co.edu.udem.dp;

import co.edu.udem.dp.Interfaces.Cliente;
import co.edu.udem.dp.Interfaces.Reservable;

import java.util.ArrayList;
import java.util.List;

public class Cocina {
    public List<Reserva> reservas;
    public Jefe jefe;

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public List<Reservable> getReservablesAvailables() {
        List<Reservable> availables = new ArrayList<>();
        for (Reserva reserva : reservas) {
            Reservable reservable = reserva.getReservable();
            if (reservable.isAvailable) availables.add(reservable);
        }
        return availables;
    }

    public Reserva hacerReserva(Mesa mesa, Motivo motivo, Cliente cliente) {
        if (!mesa.isAvailable()) return null;
        mesa.setMotivo(motivo);
        return new Reserva(cliente, mesa);
    }

    public boolean terminarReserva(Reserva reserva) {
        if (reservas.contains(reserva)) {
            reservas.get(reservas.indexOf(reserva)).reservable.disable();
            reservas.get(reservas.indexOf(reserva)).finishReserva();
            return true;
        }
        return false;
    }
}
