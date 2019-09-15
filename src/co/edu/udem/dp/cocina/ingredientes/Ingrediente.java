package co.edu.udem.dp.cocina.ingredientes;

import co.edu.udem.dp.cocina.Inventariable;


public class Ingrediente extends Inventariable {
    public String nombre;

    public Ingrediente() {
    }

    public Estado estado;

    public Ingrediente( String nombre , Estado estado ) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public void consumir(double cantidad) {
        if (estado.estaAgotado()) {
            System.out.println("Esta agotado");
        }
        estado.restarCantidad(cantidad);
    }

    public void surtir(double cantidad) {
        estado.sumarCantidad(cantidad);
    }
}
