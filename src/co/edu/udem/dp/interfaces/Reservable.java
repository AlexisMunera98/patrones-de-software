package co.edu.udem.dp.interfaces;

import co.edu.udem.dp.Motivo;
import co.edu.udem.dp.Servicio;

import java.util.List;

public abstract class Reservable {
    public List<Confort> confortList;
    public Motivo motivo;
    public boolean isAvailable;

    public abstract double calcularPrecio();

    public abstract void setMotivo(Motivo motivo);

    public Motivo createMotivo(String nombre) {
        return new Motivo(nombre);

    }

}