package co.edu.udem.dp.factories;

import co.edu.udem.dp.Servicio;

public class ServicioFactory {
    private static ServicioFactory servicioFactory;

    private ServicioFactory() {
    }

    public static ServicioFactory getInstance() {
        if (servicioFactory == null) {
            servicioFactory = new ServicioFactory();
        }
        return servicioFactory;
    }

    public Servicio createServicio(String nombre, double precio){
        return new Servicio(nombre, precio, 0);
    }
    public Servicio createServicio(String nombre, double precio, int horas){
        return new Servicio(nombre, precio, horas);
    }
}
