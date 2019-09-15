package co.edu.udem.dp.cocina.ingredientes;

public abstract  class Estado {
    public double cantidad;
    public String unidadDeMedicion;
    abstract void restarCantidad(double cantidad);
    abstract void sumarCantidad(double cantidad);

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public boolean estaAgotado(){
        return cantidad<=0;
    }
}
