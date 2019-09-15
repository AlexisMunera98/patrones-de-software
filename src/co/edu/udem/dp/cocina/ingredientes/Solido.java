package co.edu.udem.dp.cocina.ingredientes;

public class Solido implements Estado {
    boolean esContable;

    @Override
    public double restarCantidad(double cantidad) {
        return 0;
    }

    @Override
    public double sumarCantidad(double cantidad) {
        return 0;
    }
}
