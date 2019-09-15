package co.edu.udem.dp.cocina;

import co.edu.udem.dp.cocina.ingredientes.Ingrediente;
import co.edu.udem.dp.reservables.Plato;
import javafx.util.Pair;

import java.util.Map;

public class Inventario {
    private static Inventario inventario = null;
    Map<Inventariable, Integer> cantidadPorIngrediente;

    public static Inventario getInstance() {
        if (inventario == null) {
            inventario = new Inventario();
        }
        return inventario;
    }

    public void addInventario(Inventariable ingrediente, Integer cantidad) {
        cantidadPorIngrediente.replace(ingrediente, cantidadPorIngrediente.get(ingrediente) + cantidad);
    }

    public boolean suficientesIngredientes(Plato plato) {
        for (Pair<Ingrediente, Integer> ingrediente : plato.getReceta().listaIngredientes) {
            if (cantidadPorIngrediente.get(ingrediente.getKey()) < ingrediente.getValue()) {
                return false;
            }
        }
        return true;
    }

    public boolean extraerIngredientesPlato(Plato plato) {
        if (!suficientesIngredientes(plato)) {
            return false;
        }
        for (Pair<Ingrediente, Integer> ingrediente : plato.getReceta().listaIngredientes) {
            cantidadPorIngrediente.compute(ingrediente.getKey(), (inventariable, integer)
                    -> integer - ingrediente.getValue());
        }
        return true;
    }
}
