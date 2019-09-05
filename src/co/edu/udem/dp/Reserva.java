package co.edu.udem.dp;

import co.edu.udem.dp.interfaces.Cliente;
import co.edu.udem.dp.interfaces.Reservable;

public class Reserva {
    public Cliente cliente;
    public Mesa reservable;

    public Reservable getReservable() {
        return reservable;
    }

    private boolean active;

    public Reserva(Cliente cliente, Mesa reservable) {
        this.cliente = cliente;
        this.reservable = reservable;
    }

    public void setReservable(Mesa reservable) {
        this.reservable = reservable;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void finishReserva(){
        this.active = false;
    }

    public void activate(){
        this.active = true;
    }

    public boolean isActive() {
        return this.active;
    }
}
