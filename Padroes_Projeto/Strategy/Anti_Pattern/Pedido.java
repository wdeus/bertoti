package org.example;

public class Pedido extends CalculadoraDeImposto{

    private double valor;

    public double calcularImposto(){
        return calcularImpostoPadrao(valor);
    }
}
