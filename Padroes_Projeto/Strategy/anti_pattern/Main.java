package org.example;

public class Main {
    public static void main(String[] args) {
        Pedido envioInternacional = new EnvioInternacional();
        System.out.println("Custo envio internacional: " + envioInternacional.calcularEnvio());
    }
}