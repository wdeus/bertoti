package org.example;

public class Main {
    public static void main(String[] args) {
        PratoIndividual feijoada = new PratoIndividual("Feijoada", 25.0);
        PratoIndividual cerveja = new PratoIndividual("Cerveja", 10.0);
        PratoIndividual vinagrete = new PratoIndividual("Vinagrete", 5.0);
        Combo comboFamilia = new Combo("Combo familia");
        comboFamilia.adicionarItem(feijoada);
        comboFamilia.adicionarItem(cerveja);
        comboFamilia.adicionarItem(vinagrete);
        comboFamilia.exibirInformacao();
    }
}