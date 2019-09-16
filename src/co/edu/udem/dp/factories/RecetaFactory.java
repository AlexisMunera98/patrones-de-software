package co.edu.udem.dp.factories;

import co.edu.udem.dp.cocina.Receta;
import co.edu.udem.dp.cocina.ingredientes.Estado;
import co.edu.udem.dp.cocina.ingredientes.Ingrediente;
import co.edu.udem.dp.cocina.ingredientes.Solido;
import co.edu.udem.dp.motivos.Motivo;
import co.edu.udem.dp.reservables.Plato;
import co.edu.udem.dp.reservables.Reservable;

import java.util.ArrayList;
import java.util.List;

public class RecetaFactory {
    private static RecetaFactory recetaFactory;

    private RecetaFactory() {
    }

    public static RecetaFactory getInstance() {
        if (recetaFactory == null) {
            recetaFactory = new RecetaFactory();
        }
        return recetaFactory;
    }

    public Receta crearRecetaPizza() {
        List<Ingrediente> ingredientes = new ArrayList<>();
        Estado quesoSolido = new Solido(true, 5);
        Ingrediente queso = new Ingrediente("queso", quesoSolido);

        Estado masaSolida = new Solido(true, 1);
        Ingrediente masa = new Ingrediente("masa", masaSolida);
        Estado estadoTomate = new Solido(true, 3);

        Ingrediente tomate = new Ingrediente("tomate", estadoTomate);

        ingredientes.add(queso);
        ingredientes.add(masa);
        ingredientes.add(tomate);

        return new Receta("pizza", ingredientes, 25000);

    }

}
