package org.example;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Amplificador(),
                new DvdPlayer(), new Projetor());
        homeTheaterFacade.assistirFilme("Tropa de Elite");
    }
}