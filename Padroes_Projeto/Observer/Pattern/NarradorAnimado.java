package org.example;

public class NarradorAnimado implements Observer{
    @Override
    public void update(String acao) {
        if("gol".equals(acao)){
            System.out.println("Goooooooool!");
        }
    }
}
