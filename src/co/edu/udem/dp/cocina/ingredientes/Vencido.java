package co.edu.udem.dp.cocina.ingredientes;

import java.util.Date;

public class Vencido extends Estado {
    Date fechaCaducidad;

    @Override
    double restarCantidad(double cantidad) {
        return 0;
    }

    @Override
    double sumarCantidad(double cantidad) {
        return 0;
    }
}
