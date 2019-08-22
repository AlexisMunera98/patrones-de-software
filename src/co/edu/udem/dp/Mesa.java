package co.edu.udem.dp;

import co.edu.udem.dp.Interfaces.IMotivo;
import co.edu.udem.dp.Interfaces.ITipo;

public class Mesa {
    IMotivo motivo;
    ITipo tipo;

    public Mesa(IMotivo motivo, ITipo tipo) {
        this.motivo = motivo;
        this.tipo = tipo;
    }

    public double calcularPrecio() {
        return 0;
    }

}
