package org.example;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        Observer narradorAnimado = new NarradorAnimado();
        Observer narradorDesanimado = new NarradorDesanimado();

        jogo.registerObserver(narradorAnimado);
        jogo.registerObserver(narradorDesanimado);

        jogo.golMarcado("gol");
    }
}