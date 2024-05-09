package org.example;

import java.util.ArrayList;
import java.util.List;

public class Jogo implements Subject{

    private final List<Observer> observers = new ArrayList<>();
    private String acao;

    public void golMarcado(String acao){
        this.acao = acao;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(acao));
    }
}
