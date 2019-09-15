package co.edu.udem.dp.cocina.ingredientes;

public interface Estado {
    abstract double restarCantidad(double cantidad);
    abstract double sumarCantidad(double cantidad);
}
