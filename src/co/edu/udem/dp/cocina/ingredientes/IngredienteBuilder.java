package co.edu.udem.dp.cocina.ingredientes;

public class IngredienteBuilder {
    public final static String POLLO_TYPE = "Pollo";
    public final static String CERDO_TYPE = "CERDO";
    public final static String RES_TYPE = "RES";

    private String tipo;
    private String parte;
    private boolean esContable;
    private Estado estado;


    public IngredienteBuilder() {
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
    public IngredienteBuilder estadoSolido(boolean esContable ,double cantidad){
        this.estado = new Solido(esContable, 5);
        return this;
    }

    public Estado getEstado() {
        return estado;
    }

    public IngredienteBuilder estadoLiquido(double cantidad){
        this.estado = new Liquido( 5);
        return this;
    }


    public IngredienteBuilder res() {
        this.tipo = RES_TYPE;
        return this;
    }

    public Carne build() {
        return new Carne(this);
    }


    public String getTipo() {
        return tipo;
    }

    public String getParte() {
        return parte;
    }

    public boolean isEsContable() {
        return esContable;
    }
}
