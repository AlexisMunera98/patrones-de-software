package co.edu.udem.dp.factories;

import co.edu.udem.dp.cocina.Inventario;
import co.edu.udem.dp.cocina.ingredientes.Estado;
import co.edu.udem.dp.cocina.ingredientes.Ingrediente;
import co.edu.udem.dp.cocina.ingredientes.Solido;

import java.util.ArrayList;
import java.util.List;

public class InventarioFactory {
    private static InventarioFactory inventarioFactory;

    public InventarioFactory() {
    }

    public static InventarioFactory getInventarioFactory() {
        if (inventarioFactory== null) {
            inventarioFactory= new InventarioFactory();
        }
        return inventarioFactory;
    }


    public Inventario createInventario() {
        Inventario inventario = Inventario.getInstance();
        Estado quesoSolido = new Solido(true, 5);
        Ingrediente queso = new Ingrediente("queso", quesoSolido ) ;

        Estado masaSolida= new Solido(true, 1);
        Ingrediente masa = new Ingrediente("masa", masaSolida) ;
        Estado estadoTomate = new Solido(true, 3);

        Ingrediente tomate = new Ingrediente("tomate", estadoTomate) ;


        inventario.addInventario(queso);
        inventario.addInventario(masa);
        inventario.addInventario(tomate);
        return inventario;
    }
}
