package org.example;

public class PratoIndividual {

    private String nome;
    private double valor;

    public PratoIndividual(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public void exibirInformacao() {
        System.out.println(nome + ", Preço: R$" + valor);
    }
}
