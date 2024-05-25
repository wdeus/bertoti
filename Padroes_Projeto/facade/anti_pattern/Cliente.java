package org.example;


public class Cliente {
    public static void main(String[] args) {
        Amplificador amplificador = new Amplificador();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Projetor projetor = new Projetor();

        amplificador.on();
        amplificador.setDvdMode();
        dvdPlayer.on();
        dvdPlayer.play("Tropa de Elite");
        projetor.on();
        projetor.setInputDvd();
    }
}