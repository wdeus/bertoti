package org.example;

public class EnvioExpressoStrategy implements EnvioStrategy{
    @Override
    public double calcularCustoDeEnvio(Pedido pedido) {
        return 4.0;
    }
}
