package co.edu.udem.dp;

import co.edu.udem.dp.Interfaces.Reservable;

import java.util.List;

public class Cocina {
    public List<Reservable> reservables;
    public Jefe jefe;

    public void setMesas(List<Reservable> reservables) {
        this.reservables = reservables;
    }
}
