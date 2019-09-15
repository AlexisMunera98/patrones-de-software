package co.edu.udem.dp.cocina.ingredientes;

import java.util.Date;

public class Vencido extends Estado {
    Date fechaCaducidad;

    @Override
    void restarCantidad(double cantidad) {
        System.out.println("El producto esta vencido, se han perdido "+ this.cantidad +" "+this.unidadDeMedicion );
    }

    @Override
    void sumarCantidad(double cantidad) {
        System.out.println("El producto esta vencido, se han perdido "+ this.cantidad +" "+this.unidadDeMedicion );
    }
}
