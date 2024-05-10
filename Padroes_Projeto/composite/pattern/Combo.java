package org.example;

import java.util.ArrayList;
import java.util.List;

public class Combo implements ItemCardapio{
    private String nome;
    private List<ItemCardapio> itens = new ArrayList<>();

    public Combo(String nome){
        this.nome = nome;
    }

    public void adicionarItem(ItemCardapio itemCardapio){
        itens.add(itemCardapio);
    }


    @Override
    public void exibirInformacao() {
        System.out.println("Combo: " + nome);
        for(ItemCardapio item : itens){
            item.exibirInformacao();
        }
    }
}
