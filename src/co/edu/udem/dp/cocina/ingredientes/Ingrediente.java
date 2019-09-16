package co.edu.udem.dp.cocina.ingredientes;

import co.edu.udem.dp.cocina.Inventariable;


public class Ingrediente extends Inventariable {
    public String nombre;

    private Ingrediente() {
    }

    public Estado estado;

    public Ingrediente( IngredienteBuilder builder) {
        this.estado = builder.getEstado();
        this.nombre = builder.getNombre();
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
