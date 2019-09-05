package co.edu.udem.dp;

import co.edu.udem.dp.imp.ClienteNatural;
import co.edu.udem.dp.imp.ClienteVip;
import co.edu.udem.dp.interfaces.Cliente;
import co.edu.udem.dp.interfaces.Confort;
import co.edu.udem.dp.interfaces.Reservable;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Jefe jefe = new Jefe("Jefe", "1234");
        jefe.addCocina();
        Cocina cocina = jefe.getCocina(0);
        Mesa mesa = new Mesa(5);
        Motivo motivo = new Motivo("Cumpleaños");
        motivo.addServicio("Serenata", 5.3, 1);
        Cliente cliente = new ClienteNatural("Juanito", "666");
        cocina.hacerReserva(mesa, motivo, cliente);


    }
}
