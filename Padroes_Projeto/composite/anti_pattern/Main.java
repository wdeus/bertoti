package org.example;

public class Main {
    public static void main(String[] args) {
        PratoIndividual feijoada = new PratoIndividual("Feijoada", 25.0);
        PratoIndividual churrasco = new PratoIndividual("Churrasco", 10.0);
        Combo comboFamilia = new Combo("Combo Familia");
        comboFamilia.adicionarFeijoada(feijoada);
        comboFamilia.adicionarChurrasco(churrasco);
        comboFamilia.exibirInformacao();
    }
}