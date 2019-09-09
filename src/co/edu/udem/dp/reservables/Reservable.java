package co.edu.udem.dp.reservables;

import co.edu.udem.dp.conforts.Confort;
import co.edu.udem.dp.motivos.Motivo;

import java.util.List;

public abstract class Reservable {
    public List<Confort> confortList;
    public Motivo motivo;
    public boolean isAvailable;

    public abstract void setMotivo(Motivo motivo);

    public abstract double calcularPrecio();

    public void disable() {
        this.isAvailable = false;
    }

    public void enable() {
        this.isAvailable = true;
    }
}