package co.edu.udem.dp;

import co.edu.udem.dp.interfaces.Confort;
import co.edu.udem.dp.interfaces.Reservable;

import java.util.List;

public class Mesa extends Reservable {
    public int cantidadComensales;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }

    public Mesa(List<Confort> conforts, int cantidadComensales) {
        this.cantidadComensales = cantidadComensales;
        this.confortList = conforts;
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
