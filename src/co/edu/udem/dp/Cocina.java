package co.edu.udem.dp;

import co.edu.udem.dp.interfaces.Cliente;
import co.edu.udem.dp.interfaces.Reservable;

import java.util.ArrayList;
import java.util.List;

public class Cocina {
    public List<Reserva> reservas;
    public List<Reservable> reservables;
    public List<Cliente> clientes;
    public Jefe jefe;


    public List<Reservable> getReservablesAvailables() {
        List<Reservable> availables = new ArrayList<>();
        for (Reserva reserva : reservas) {
            Reservable reservable = reserva.getReservable();
            if (reservable.isAvailable) availables.add(reservable);
        }
        return availables;
    }

    public void hacerReserva(Mesa mesa, Motivo motivo, Cliente cliente) {
        mesa.setMotivo(motivo);
        reservas.add(new Reserva(cliente, mesa));
    }

    public boolean terminarReserva(Reserva reserva) {
        if (reservas.contains(reserva)) {
            reservas.get(reservas.indexOf(reserva)).reservable.disable();
            reservas.get(reservas.indexOf(reserva)).finishReserva();
            return true;
        }
        return false;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    public void setReservables(List<Reservable> reservables) {
        this.reservables = reservables;
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void addReservable(Reservable reservable) {
        reservables.add(reservable);
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
