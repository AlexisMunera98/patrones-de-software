package co.edu.udem.dp.cocina.ingredientes;

public class Carne extends Ingrediente {
    private String tipo;
    private String parte;

    Carne(IngredienteBuilder builder){
        if (builder.getParte() == null || builder.getTipo() == null){
            throw new IllegalArgumentException("La carne debe tener tipo y parte");
        }
        this.parte =  builder.getParte();
        this.tipo =  builder.getTipo();
    }
}
