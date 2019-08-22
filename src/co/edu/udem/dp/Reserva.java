package co.edu.udem.dp;

import co.edu.udem.dp.Interfaces.Cliente;

public class Reserva {
    public Cliente cliente;
    public Mesa mesa;

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;

    }
}
