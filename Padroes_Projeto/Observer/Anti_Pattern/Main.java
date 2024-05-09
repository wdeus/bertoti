package org.example;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.setNarradorAnimado(new NarradorAnimado());
        jogo.setNarradorDesanimado(new NarradorDesanimado());

        jogo.golMarcado();
    }
}