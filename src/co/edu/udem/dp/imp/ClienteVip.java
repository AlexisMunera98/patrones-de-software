package co.edu.udem.dp.imp;

public class ClienteVip extends ClienteNatural{

    public ClienteVip(String nombre, String id) {
        super(nombre, id);
    }

    @Override
    public double calcularDescuento() {
        return 0.5;
    }
}
