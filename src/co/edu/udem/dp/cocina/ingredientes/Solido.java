package co.edu.udem.dp.cocina.ingredientes;

public class Solido extends Estado {
    boolean esContable;

    @Override
    double restarCantidad(double cantidad) {
        return 0;
    }

    @Override
    double sumarCantidad(double cantidad) {
        return 0;
    }
}
