package org.example;

public class EnvioPadraoStrategy implements EnvioStrategy{
    @Override
    public double calcularCustoDeEnvio(Pedido pedido) {
        return 2.0;
    }
}
