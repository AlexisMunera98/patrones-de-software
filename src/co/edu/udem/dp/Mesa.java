package co.edu.udem.dp;

import co.edu.udem.dp.interfaces.Reservable;

public class Mesa extends Reservable {
    public int cantidadComensales;


    public Mesa() {
    }

    @Override
    public double calcularPrecio() {
        return 0;
    }

    public void enable() {
        this.isAvailable = true;
    }

    public void disable() {
        this.isAvailable = false;
    }

    @Override
    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }
}
