package co.edu.udem.dp.Imp;


import co.edu.udem.dp.Interfaces.ICliente;

public class ClientNormal implements ICliente {
    @Override
    public boolean isVIP() {
        return false;
    }

    @Override
    public boolean register() {
        return false;
    }
}
