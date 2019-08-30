package co.edu.udem.dp.Interfaces;

import co.edu.udem.dp.Cocina;
import co.edu.udem.dp.Reserva;

import java.util.Date;
import java.util.List;

public abstract class Cliente {

    public List<Reserva> reservas;
    public String nombre;
    public String id;
    public Date fechaIngreso;

    public int calcularNumeroDeReservas(Cocina cocina) {
        int count = 0;
        for (Reserva reserva :cocina.reservas) {
            if(reserva.cliente.equals(this)) count ++;
        }
        return count;
    }


    public abstract double calcularDescuento();


}
