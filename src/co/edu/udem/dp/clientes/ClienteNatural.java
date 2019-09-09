package co.edu.udem.dp.clientes;


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
