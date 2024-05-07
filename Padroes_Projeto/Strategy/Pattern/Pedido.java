package org.example;

public class Pedido {

    private EnvioStrategy envioStrategy;

    public Pedido(EnvioStrategy envioStrategy){
        this.envioStrategy = envioStrategy;
    }

    public void setEnvioStrategy(EnvioStrategy envioStrategy){
        this.envioStrategy = envioStrategy;
    }

    public double calcularEnvio(){
        return envioStrategy.calcularCustoDeEnvio(this);
    }
}
