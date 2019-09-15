package co.edu.udem.dp.reservables;

import co.edu.udem.dp.cocina.Receta;
import co.edu.udem.dp.motivos.Motivo;

public class Plato extends Reservable {
    boolean esMedio;
    Receta receta;
    double precioBase;

    public Plato(boolean esMedio, Receta receta, double precioBase ) {
        this.esMedio = esMedio;
        this.receta = receta;
    }

    @Override
    public void setMotivo(Motivo motivo) {

    }

    @Override
    public double calcularPrecio() {
        return esMedio ? precioBase * 0.80 : precioBase;
    }

    public Receta getReceta() {
        return receta;
    }
}
