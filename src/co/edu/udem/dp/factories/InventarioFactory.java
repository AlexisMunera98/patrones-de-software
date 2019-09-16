package co.edu.udem.dp.factories;

import co.edu.udem.dp.cocina.Inventario;
import co.edu.udem.dp.cocina.ingredientes.Estado;
import co.edu.udem.dp.cocina.ingredientes.Ingrediente;
import co.edu.udem.dp.cocina.ingredientes.IngredienteBuilder;
import co.edu.udem.dp.cocina.ingredientes.Solido;

import java.util.ArrayList;
import java.util.List;

public class InventarioFactory {
    private static InventarioFactory inventarioFactory;

    public InventarioFactory() {
    }

    public static InventarioFactory getInventarioFactory() {
        if (inventarioFactory == null) {
            inventarioFactory = new InventarioFactory();
        }
        return inventarioFactory;
    }


    public Inventario createInventario() {
        Inventario inventario = Inventario.getInstance();
        IngredienteBuilder ingredienteBuilder = new IngredienteBuilder();
        ingredienteBuilder.nombre("queso");
        Ingrediente queso = new IngredienteBuilder()
                .nombre("queso")
                .estadoSolidoContable().buildIngrediente();
        Ingrediente masa = new IngredienteBuilder()
                .nombre("masa")
                .estadoSolidoContable().buildIngrediente();
        Ingrediente tomate = new IngredienteBuilder()
                .nombre("tomate")
                .estadoSolidoContable().buildIngrediente();
        inventario.addInventario(queso);
        inventario.addInventario(masa);
        inventario.addInventario(tomate);
        return inventario;
    }
}
