package co.edu.udem.dp.Imp;


import co.edu.udem.dp.Interfaces.Cliente;

public class ClienteNatural extends Cliente {
    private Empresa empresa;

    @Override
    public double calcularDescuento() {
        return 0.8;
    }
}
