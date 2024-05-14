package org.example;

public class HomeTheaterFacade {

    Amplificador amplificador;
    DvdPlayer dvdPlayer;
    Projetor projetor;

    HomeTheaterFacade(Amplificador amplificador, DvdPlayer dvdPlayer, Projetor projetor){
        this.amplificador = amplificador;
        this.dvdPlayer = dvdPlayer;
        this.projetor = projetor;
    }

    void assistirFilme(String filme){
        System.out.println("Preparando para assistir ao filme");
        amplificador.on();
        amplificador.setDvdMode();
        dvdPlayer.on();
        dvdPlayer.play(filme);
        projetor.on();
        projetor.setInputDvd();
        System.out.println("Filme começando");
    }
}
