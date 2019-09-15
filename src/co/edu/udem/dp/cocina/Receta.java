package co.edu.udem.dp.cocina;

import co.edu.udem.dp.cocina.ingredientes.Estado;
import co.edu.udem.dp.cocina.ingredientes.Ingrediente;
import co.edu.udem.dp.cocina.ingredientes.Solido;
import co.edu.udem.dp.factories.RecetaFactory;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Receta {
    String nombre;
    List<Ingrediente> listaIngredientes;

    public Receta(String nombre, List<Ingrediente> listaIngredientes) {
        this.nombre = nombre;
        this.listaIngredientes = listaIngredientes;

    }
}
