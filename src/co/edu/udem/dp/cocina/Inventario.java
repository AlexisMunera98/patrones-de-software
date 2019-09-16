package co.edu.udem.dp.cocina;

import co.edu.udem.dp.cocina.ingredientes.Ingrediente;
import co.edu.udem.dp.reservables.Plato;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private static Inventario inventario = null;
    List<Inventariable> inventariables;

    private Inventario() {
        inventariables = new ArrayList<>();
    }

    public static Inventario getInstance() {
        if (inventario == null) {
            inventario = new Inventario();
        }
        return inventario;
    }

    public void addInventario(Ingrediente ingrediente) {
        inventariables.add(ingrediente);
    }

    private boolean suficientesIngredientes(Plato plato) {
        for (Ingrediente ingrediente : plato.getReceta().listaIngredientes) {
            if (!inventariables.contains(ingrediente)) {
                return false;
            }
            int index = inventariables.indexOf(ingrediente);
            Ingrediente ingredienteEnInventario = (Ingrediente) inventariables.get(index);
            if (ingrediente.estado.cantidad < ingredienteEnInventario.estado.cantidad) {
                return false;
            }
        }
        return true;
    }

    public boolean extraerIngredientesPlato(Plato plato) {
        if (!suficientesIngredientes(plato)) {
            return false;
        }
        for (Ingrediente ingrediente : plato.getReceta().listaIngredientes) {
            ingrediente.estado.setCantidad(ingrediente.estado.cantidad - 1);
        }
        return true;
    }

    public Inventariable getInventariable(String nombre){
        for (Inventariable inventariable: inventariables) {
            if (inventariable.nombre.equals(nombre)){
                return inventariable;
            }
        }
        return null;
    }
}
