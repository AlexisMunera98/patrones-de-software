package co.edu.udem.dp.reservables;

import co.edu.udem.dp.cocina.Receta;

public class Plato extends Reservable{
    int porcion;
    Receta receta;

    @Override
    public double calcularPrecio() {
        return 0;
    }
}
