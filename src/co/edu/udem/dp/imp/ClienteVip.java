package co.edu.udem.dp.imp;

import java.util.Date;

public class ClienteVip extends ClienteNatural{

    public ClienteVip(String nombre, String id, Date fechaIngreso) {
        super(nombre, id, fechaIngreso);
    }

    @Override
    public double calcularDescuento() {
        return 0.5;
    }
}
