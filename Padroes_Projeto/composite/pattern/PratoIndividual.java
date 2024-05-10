package org.example;

public class PratoIndividual implements ItemCardapio{

    private String nome;
    private double preco;
    public PratoIndividual(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    @Override
    public void exibirInformacao() {
        System.out.println(nome + ", Preço: R$" + preco);
    }
}
