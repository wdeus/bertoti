package org.example;

public class CalculadoraDeImposto {

    public double calcularImpostoPadrao(double valor){
        return valor * 0.5;
    }

    public double calcularImpostoDiferenciado(double valor){
        return valor * 0.7;
    }
}
