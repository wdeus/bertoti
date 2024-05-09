package org.example;

public class NarradorDesanimado  implements Observer{
    @Override
    public void update(String acao) {
        if("gol".equals(acao)){
            System.out.println("Gol!");
        }
    }
}
