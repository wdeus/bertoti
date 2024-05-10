package org.example;

import java.util.ArrayList;
import java.util.List;

public class Combo {

    private String nome;
    private List<PratoIndividual> pratos = new ArrayList();

    public Combo(String nome){
        this.nome = nome;
    }

    public void adicionarFeijoada(PratoIndividual feijoada){
        pratos.add(feijoada);
    }

    public void adicionarChurrasco(PratoIndividual churrasco){
        pratos.add(churrasco);
    }

    public void exibirInformacao(){
        System.out.println("Combo: " + nome);
        for(PratoIndividual pratoIndividual : pratos){
            pratoIndividual.exibirInformacao();
        }
    }

}
