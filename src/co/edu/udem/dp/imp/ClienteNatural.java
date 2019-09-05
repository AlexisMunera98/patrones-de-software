package co.edu.udem.dp.imp;


import co.edu.udem.dp.interfaces.Cliente;

import java.util.Date;

public class ClienteNatural extends Cliente {
    private Empresa empresa;

    public ClienteNatural(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.fechaIngreso = new Date();
    }

    @Override
    public double calcularDescuento() {
        return 0.8;
    }
}
