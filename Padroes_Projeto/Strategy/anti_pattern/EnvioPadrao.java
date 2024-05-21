package org.example;

public class EnvioPadrao extends Pedido{

    @Override
    public double calcularEnvio() {
        return 2d;
    }
}
