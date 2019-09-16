package co.edu.udem.dp.reservables;

import co.edu.udem.dp.cocina.Receta;
import co.edu.udem.dp.motivos.Motivo;

public class Plato extends Reservable {
    boolean esMedio;
    Receta receta;

    public Plato(boolean esMedio, Receta receta) {
        this.esMedio = esMedio;
        this.receta = receta;
        this.isAvailable = true;
    }

    @Override
    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;

    }

    @Override
    public double calcularPrecio() {
        return esMedio ? receta.getPrecioBase() * 0.80 : receta.getPrecioBase();
    }

    public Receta getReceta() {
        return receta;
    }
}
