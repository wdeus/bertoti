package org.example;

public class EnvioExpresso extends Pedido{

    @Override
    public double calcularEnvio() {
        return 4d;
    }
}
