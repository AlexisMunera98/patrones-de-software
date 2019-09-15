package co.edu.udem.dp.cocina;

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
}
