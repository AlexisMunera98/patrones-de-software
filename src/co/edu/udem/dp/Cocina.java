package co.edu.udem.dp;

import co.edu.udem.dp.interfaces.Cliente;
import co.edu.udem.dp.interfaces.Reservable;

import java.util.ArrayList;
import java.util.List;

public class Cocina {
    public List<Reserva> reservas;
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

    public Cocina(Jefe jefe) {
        this.jefe = jefe;
        reservas = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public void hacerReserva(Mesa mesa, Motivo motivo, Cliente cliente) {
        mesa.setMotivo(motivo);
        reservas.add(new Reserva(cliente, mesa));
    }


    public boolean finishReserva(Reserva reserva) {
        if (reservas.contains(reserva)) {
            return reserva.finishReserva();
        }
        return false;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }


    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }


    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
