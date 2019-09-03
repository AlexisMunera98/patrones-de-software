package co.edu.udem.dp;

import co.edu.udem.dp.factories.ClientFactory;
import co.edu.udem.dp.interfaces.Cliente;
import co.edu.udem.dp.interfaces.Reservable;
import co.edu.udem.dp.visitors.RecorrerReservasHechasVisitor;

import java.util.ArrayList;
import java.util.List;

public class Cocina {
    public List<Reserva> reservas;
    public List<Reservable> mesas;
    public List<Cliente> clientes;
    public Jefe jefe;

    public Cocina(Jefe jefe) {
        this.jefe = jefe;
    }

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

    public void accept(RecorrerReservasHechasVisitor recorrerReservasHechasVisitor) {
        recorrerReservasHechasVisitor.run(this);
    }

    public void newNaturalClient(String nombre, String id) {
        this.clientes.add(ClientFactory.getclientFactory().createClienteNatural(nombre, id));
    }

    public void newVipClient(String nombre, String id) {
        this.clientes.add(ClientFactory.getclientFactory().createClienteVip(nombre, id));
    }

}
