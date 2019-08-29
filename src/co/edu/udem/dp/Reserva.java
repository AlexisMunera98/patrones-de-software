package co.edu.udem.dp;

import co.edu.udem.dp.Interfaces.Cliente;
import co.edu.udem.dp.Interfaces.Reservable;

public class Reserva {
    public Cliente cliente;
    public Mesa mesa;
    private Reservable reservable;

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;

    }
}
