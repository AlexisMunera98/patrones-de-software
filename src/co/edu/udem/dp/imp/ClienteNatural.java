package co.edu.udem.dp.imp;


import co.edu.udem.dp.interfaces.Cliente;

import java.util.Date;

public class ClienteNatural extends Cliente {
    private Empresa empresa;

    public ClienteNatural(String nombre, String id, Date fechaIngreso) {
        super(nombre, id, fechaIngreso);
    }

    @Override
    public double calcularDescuento() {
        return 0.8;
    }
}
