package co.edu.udem.dp;

import co.edu.udem.dp.Interfaces.Reservable;

public class Mesa implements Reservable {
    public int cantidadComensales;
    public Motivo motivo;
    public Cocina cocina;

    public Mesa(Motivo motivo) {
        this.motivo = motivo;
    }

    @Override
    public double calcularPrecio() {
        return 0;
    }
}
