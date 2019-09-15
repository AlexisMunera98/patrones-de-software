package co.edu.udem.dp.cocina.ingredientes;

public class Liquido extends Estado {
    @Override
    public void restarCantidad(double cantidad) {
        this.cantidad -= cantidad;
    }

    public Liquido(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public void sumarCantidad(double cantidad) {
        this.cantidad += cantidad;
    }
}
