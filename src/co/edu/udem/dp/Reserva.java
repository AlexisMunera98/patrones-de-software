package co.edu.udem.dp;

import co.edu.udem.dp.clientes.Cliente;
import co.edu.udem.dp.reservables.Reservable;

import java.util.Date;
import java.util.List;

public class Reserva {
    public Cliente cliente;
    public List<Reservable> reservables;
    public Date fechaReserva;

    public List<Reservable> getReservables() {
        return reservables;
    }

    private boolean active;

    public Reserva(Cliente cliente, List<Reservable> reservables) {
        this.cliente = cliente;
        this.reservables = reservables;
    }

    public void setReservables(List<Reservable> reservables) {
        this.reservables = reservables;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void finalizarReserva() {
        this.active = false;
        for (Reservable reservable :
                reservables) {
            reservable.enable();
        }

    }

    public void activate() {
        this.active = true;
    }

    public boolean isActive() {
        return this.active;
    }
}
