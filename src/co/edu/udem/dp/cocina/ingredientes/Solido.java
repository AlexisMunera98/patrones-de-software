package co.edu.udem.dp.cocina.ingredientes;

public class Solido extends  Estado {
    boolean esContable;

    public Solido(boolean esContable) {
        this.esContable = esContable;
        this.cantidad = 0;
    }

    @Override
    public void restarCantidad(double cantidad) {
        if(esContable){
            this.cantidad -= cantidad;
        }
    }

    @Override
    public void sumarCantidad(double cantidad) {
        if(esContable){
            this.cantidad += cantidad;
        }
    }
}
