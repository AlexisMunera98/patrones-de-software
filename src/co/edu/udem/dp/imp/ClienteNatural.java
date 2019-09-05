package co.edu.udem.dp.imp;


import co.edu.udem.dp.interfaces.Cliente;

public class ClienteNatural extends Cliente {
    private Empresa empresa;

    @Override
    public double calcularDescuento() {
        return 0.8;
    }
}
