package co.edu.udem.dp.reservables;

import co.edu.udem.dp.conforts.Confort;
import co.edu.udem.dp.motivos.Motivo;

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

}
