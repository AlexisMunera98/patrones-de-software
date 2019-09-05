package co.edu.udem.dp;

import java.util.ArrayList;
import java.util.List;

public class Jefe {
    public String nombre;
    public String id;
    public List<Cocina> cocinas;

    public Jefe(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        cocinas = new ArrayList<>();
    }

    public Cocina getCocina(int post) {

        return cocinas.get(post);
    }

    public void addCocina() {
        Cocina cocina = new Cocina(this);
        cocinas.add(cocina);
    }
}
