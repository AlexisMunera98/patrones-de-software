package co.edu.udem.dp.factories;

import co.edu.udem.dp.servicios.Serenata;
import co.edu.udem.dp.servicios.Servicio;
import co.edu.udem.dp.servicios.Torta;
import sun.plugin.dom.core.CoreConstants;

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

    public Servicio createServicio(String nombre, double precio) {
        if (nombre.equals("Torta")) {
            return new Torta(nombre, precio);
        }
        if (nombre.equals("Serenata")) {
            return new Serenata(nombre, precio);
        }
        return null;
    }

    public Servicio createServicio(String nombre, double precio, int horas) {
        if (nombre.equals("Torta")) {
            return new Torta(nombre, precio, horas);
        }
        if (nombre.equals("Serenata")) {
            return new Serenata(nombre, precio, horas);
        }
        return null;
    }
}
