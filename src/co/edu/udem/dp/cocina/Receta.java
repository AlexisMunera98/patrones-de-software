package co.edu.udem.dp.cocina;

import co.edu.udem.dp.cocina.ingredientes.Ingrediente;

import java.util.List;

public class Receta {
    double precioBase;
    String nombre;
    List<Ingrediente> listaIngredientes;

    public Receta(String nombre, List<Ingrediente> listaIngredientes, double precioBase) {
        this.nombre = nombre;
        this.listaIngredientes = listaIngredientes;
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}
