package co.edu.udem.dp.cocina.ingredientes;

public class IngredienteBuilder {
    public final static String POLLO_TYPE = "Pollo";
    public final static String CERDO_TYPE = "CERDO";
    public final static String RES_TYPE = "RES";

    private String tipo;
    private String parte;
    private boolean esContable;
    private Estado estado;
    private String nombre;

    public IngredienteBuilder() {
    }

    public IngredienteBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public IngredienteBuilder parte(String parte) {
        this.parte = parte;
        return this;
    }

    public IngredienteBuilder pollo() {
        this.tipo = POLLO_TYPE;
        return this;
    }

    public IngredienteBuilder cerdo() {
        this.tipo = CERDO_TYPE;
        return this;
    }

    public IngredienteBuilder estadoSolidoContable() {
        if (this.estado == null) {
            this.estado = new Solido(true);
        }
        return this;
    }

    public IngredienteBuilder estadoSolidoIncontable() {
        this.estado = new Solido(false);
        return this;
    }


    public IngredienteBuilder estadoLiquido() {
        this.estado = new Liquido();
        return this;
    }

    public IngredienteBuilder cantidad(double cantidad) {
        this.estado.setCantidad(cantidad);
        return this;
    }

    public IngredienteBuilder res() {
        this.tipo = RES_TYPE;
        return this;
    }

    public Carne buildCarne() {
        return new Carne(this);
    }

    public Ingrediente buildIngrediente() {
        return new Ingrediente(this);
    }

    public String getNombre() {
        return nombre;
    }


    public String getTipo() {
        return tipo;
    }

    public String getParte() {
        return parte;
    }

    public Estado getEstado() {
        return estado;
    }
}
