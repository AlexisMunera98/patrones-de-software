package co.edu.udem.dp;

import co.edu.udem.dp.factories.ClientFactory;
import co.edu.udem.dp.interfaces.Cliente;
import co.edu.udem.dp.interfaces.Reservable;
import co.edu.udem.dp.interfaces.Visitor;
import java.util.List;

public class Cocina {
    public List<Reserva> reservas;
    public List<Reservable> reservables;
    public List<Cliente> clientes;
    public Jefe jefe;

    public Cocina(Jefe jefe) {
        this.jefe = jefe;
    }

    public void addReservable(Reservable reservable){
        reservables.add(reservable);
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public boolean hacerReserva(Reservable reservable, Motivo motivo, Cliente cliente) {
        if (!reservable.isAvailable) return false;
        if (motivo != null) reservable.setMotivo(motivo);
        reservas.add(new Reserva(cliente, reservable));
        return true;
    }

    public boolean terminarReserva(Reserva reserva) {
        if (reservas.contains(reserva)) {
            reservas.get(reservas.indexOf(reserva)).reservable.disable();
            reservas.get(reservas.indexOf(reserva)).finishReserva();
            return true;
        }
        return false;
    }

    public void accept(Visitor visitor) {
        visitor.run(this);
    }

    public void newNaturalClient(String nombre, String id) {
        this.clientes.add(ClientFactory.getclientFactory().createClienteNatural(nombre, id));
    }

    public void newVipClient(String nombre, String id) {
        this.clientes.add(ClientFactory.getclientFactory().createClienteVip(nombre, id));
    }
}
