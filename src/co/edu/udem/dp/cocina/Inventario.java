package co.edu.udem.dp.cocina;

import javafx.util.Pair;

import java.util.List;
import java.util.Map;

public class Inventario {
    private static Inventario inventario = null;
    Map<IngredienteABS, Integer> cantidadPorIngrediente;

    public static Inventario getInstance() {
        if (inventario == null) {
            inventario = new Inventario();
        }
        return inventario;
    }

    public void addInventario(IngredienteABS ingrediente, Integer cantidad) {
        cantidadPorIngrediente.replace(ingrediente, cantidadPorIngrediente.get(ingrediente) + cantidad);
    }
}
