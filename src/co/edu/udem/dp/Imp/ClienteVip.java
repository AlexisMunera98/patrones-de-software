package co.edu.udem.dp.Imp;

import co.edu.udem.dp.Interfaces.Cliente;

public class ClienteVip extends ClienteNatural{

    @Override
    public double calcularDescuento() {
        return 0.5;
    }
}
