package co.edu.udem.dp.clientes;

import co.edu.udem.dp.cocina.Cocina;
import co.edu.udem.dp.Reserva;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Cliente {

    public Cliente(String nombre, String id, Date fechaIngreso) {
        this.nombre = nombre;
        this.id = id;
        this.fechaIngreso = fechaIngreso;
        this.reservas = new ArrayList<Reserva>();
    }

    public List<Reserva> reservas;
    public String nombre;
    public String id;
    public Date fechaIngreso;

    public int calcularNumeroDeReservas(Cocina cocina) {
        int count = 0;
        for (Reserva reserva : cocina.reservas) {
            if (reserva.cliente.equals(this)) count++;
        }
        return count;
    }

    public void addReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }


    public abstract double calcularDescuento();


}
