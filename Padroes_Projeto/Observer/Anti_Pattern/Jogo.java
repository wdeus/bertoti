package org.example;

public class Jogo {
    private NarradorAnimado narradorAnimado;
    private NarradorDesanimado narradorDesanimado;

    public void setNarradorAnimado(NarradorAnimado narradorAnimado){
        this.narradorAnimado = narradorAnimado;
    }

    public void setNarradorDesanimado(NarradorDesanimado narradorDesanimado){
        this.narradorDesanimado = narradorDesanimado;
    }

    public void golMarcado(){
        if(narradorAnimado != null){
            narradorAnimado.reacao();
        }
        if(narradorDesanimado != null){
            narradorDesanimado.reacao();
        }
    }
}
