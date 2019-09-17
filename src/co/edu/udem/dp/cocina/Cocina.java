package co.edu.udem.dp.cocina;

import co.edu.udem.dp.Jefe;
import co.edu.udem.dp.Reserva;
import co.edu.udem.dp.factories.ClienteFactory;
import co.edu.udem.dp.clientes.Cliente;
import co.edu.udem.dp.reservables.Plato;
import co.edu.udem.dp.reservables.Reservable;
import co.edu.udem.dp.visitors.Visitor;
import co.edu.udem.dp.motivos.Motivo;

import java.util.ArrayList;
import java.util.List;

public class Cocina {
    public List<Reserva> reservas;
    public List<Reservable> reservables;
    public List<Receta> recetas;
    public List<Cliente> clientes;
    public Inventario inventario;
    public String especialidad;
    public String direccion;
    public String telefono;
    public Jefe jefe;
    public String clientesToString(){

        StringBuilder stringBuilder = new StringBuilder();
        for (Cliente cliente :
                clientes) {
            stringBuilder.append(cliente.id).append(" ").append(cliente.nombre).append("\n");

        }
        return stringBuilder.toString();
    }

    public Cocina(Jefe jefe, Inventario inventario) {
        reservables = new ArrayList<Reservable>();
        clientes = new ArrayList<Cliente>();
        reservas = new ArrayList<Reserva>();
        this.jefe = jefe;
        this.inventario = inventario;
        this.recetas = new ArrayList<>();
        this.especialidad = "Comida";
        this.direccion = "UdeM";
        this.telefono = "666";
    }

    public void addReceta(Receta receta) {
        recetas.add(receta);


    }

    public void anadirReservable(Reservable reservable) {
        reservables.add(reservable);
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public boolean hacerReserva(List<Reservable> reservables, Motivo motivo, Cliente cliente) {
        for (Reservable reservable :
                reservables) {
            if (reservable instanceof Plato) {
                if (!Inventario.getInstance().extraerIngredientesPlato((Plato) reservable)){
                    return false;
                }
            } else {
                if (!reservable.isAvailable) return false;
                if (motivo != null) reservable.setMotivo(motivo);
                reservable.disable();
            }
        }
        Reserva reserva = new Reserva(cliente, reservables);
        reservas.add(reserva);
        cliente.addReserva(reserva);
        return true;
    }

    public boolean terminarReserva(Reserva reserva) {
        if (reservas.contains(reserva)) {
            reservas.get(reservas.indexOf(reserva)).finalizarReserva();
            return true;
        }
        return false;
    }

    public void accept(Visitor visitor) {
        visitor.run(this);
    }

    public void nuevoClienteNatural(String nombre, String id) {
        this.clientes.add(ClienteFactory.getclientFactory().crearClienteNatural(nombre, id));
    }

    public void nuevoClienteVip(String nombre, String id) {
        this.clientes.add(ClienteFactory.getclientFactory().crearClienteVip(nombre, id));
    }

    public String reservasToString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Reserva reserva:
                reservas) {
            stringBuilder.append(reserva.cliente.nombre).append( " ").append(reserva.fechaReserva );

        }
        return stringBuilder.toString();
    }
}
