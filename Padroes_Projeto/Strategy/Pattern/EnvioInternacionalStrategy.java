package org.example;

public class EnvioInternacionalStrategy implements EnvioStrategy{
    @Override
    public double calcularCustoDeEnvio(Pedido pedido) {
        return 8.0;
    }
}
