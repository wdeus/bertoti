package org.example;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(new EnvioExpressoStrategy());
        System.out.println("Custo de envio expresso: " + pedido.calcularEnvio());

        pedido.setEnvioStrategy(new EnvioInternacionalStrategy());
        System.out.println("Custo de envio internacional: " + pedido.calcularEnvio());

        pedido.setEnvioStrategy(new EnvioPadraoStrategy());
        System.out.println("Custo de envio padrao: " + pedido.calcularEnvio());

    }
}