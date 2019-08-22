package co.edu.udem.dp.Imp;


import co.edu.udem.dp.Interfaces.Cliente;

public class ClientNormal extends Cliente {
    @Override
    public double calcularDescuento() {
        return 0.8;
    }
}
