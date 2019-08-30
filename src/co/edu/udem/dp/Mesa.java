package co.edu.udem.dp;

import co.edu.udem.dp.Interfaces.Reservable;

public class Mesa extends Reservable {
    public int cantidadComensales;
    public Motivo motivo;
    public boolean isAvailable;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }

    public Mesa() {
        this.motivo = motivo;
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
}
