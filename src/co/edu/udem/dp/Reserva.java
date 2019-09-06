package co.edu.udem.dp;

import co.edu.udem.dp.imp.ClienteNatural;
import co.edu.udem.dp.imp.ClienteVip;
import co.edu.udem.dp.imp.Empresa;
import co.edu.udem.dp.interfaces.Cliente;
import co.edu.udem.dp.interfaces.Confort;
import co.edu.udem.dp.interfaces.Reservable;

import java.util.List;

public class Reserva {
    public Cliente cliente;
    public Reservable reservable;

    public Reservable getReservable() {
        return reservable;
    }

    private boolean active;

    public Reserva(Cliente cliente, Reservable reservable) {
        this.cliente = cliente;
        this.reservable = reservable;
        active = true;
    }

    public void setReservable(Mesa reservable) {
        this.reservable = reservable;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean finishReserva() {
        this.active = false;
        return true;
    }

    public Reservable createReservable(int cantidadComensales) {
        return new Mesa(cantidadComensales);
    }

    public Cliente createClient(String tipoCliente, String nombre, String id) {
        switch (tipoCliente) {
            case "Empresa":
                return new Empresa();
            case "ClienteNatural":
                return new ClienteNatural(nombre, id);
            case "ClienteVIP":
                return new ClienteVip(nombre, id);
        }
        return new ClienteNatural(nombre, id);
    }

    public void activate() {
        this.active = true;
    }

    public boolean isActive() {
        return this.active;
    }
}
