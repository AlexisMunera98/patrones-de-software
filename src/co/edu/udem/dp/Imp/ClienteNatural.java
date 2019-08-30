package co.edu.udem.dp.Imp;


import co.edu.udem.dp.Cocina;
import co.edu.udem.dp.Interfaces.Cliente;
import co.edu.udem.dp.Reserva;

public class ClienteNatural extends Cliente {
    private Empresa empresa;

    @Override
    public double calcularDescuento() {
        return 0.8;
    }
}
