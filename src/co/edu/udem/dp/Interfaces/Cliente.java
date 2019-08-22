package co.edu.udem.dp.Interfaces;

import co.edu.udem.dp.Reserva;

import java.util.Date;
import java.util.List;

public abstract class Cliente {

    public List<Reserva> reservas;
    public String nombre;
    public String id;
    public Date fechaIngreso;

    public int calcularNumeroDeReservas() {
        return reservas.size();
    }

    public abstract double calcularDescuento();


}
