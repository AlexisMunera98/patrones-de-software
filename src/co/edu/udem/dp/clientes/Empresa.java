package co.edu.udem.dp.clientes;

import co.edu.udem.dp.clientes.Cliente;

import java.util.Date;

public class Empresa extends Cliente {
    public Empresa(String nombre, String id, Date fechaIngreso) {
        super(nombre, id, fechaIngreso);
    }

    @Override
    public double calcularDescuento() {
        return 0;
    }
}
