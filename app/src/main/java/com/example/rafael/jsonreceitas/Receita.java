package com.example.rafael.jsonreceitas;

import java.util.List;

/**
 * Created by Rafael on 18/03/2017.
 */

public class Receita {

    private String tituloreceita;
    private String tempopreparo;
    private int qtdpressos;
    private List<Ingredientes> ingredientes;


    public Receita() {
    }

    public Receita(String tituloreceita, String tempopreparo, int qtdpressos, List<Ingredientes> ingredientes) {
        this.tituloreceita = tituloreceita;
        this.tempopreparo = tempopreparo;
        this.qtdpressos = qtdpressos;
        this.ingredientes = ingredientes;
    }

    public String getTituloreceita() {
        return tituloreceita;
    }

    public void setTituloreceita(String tituloreceita) {
        this.tituloreceita = tituloreceita;
    }

    public String getTempopreparo() {
        return tempopreparo;
    }

    public void setTempopreparo(String tempopreparo) {
        this.tempopreparo = tempopreparo;
    }

    public int getQtdpressos() {
        return qtdpressos;
    }

    public void setQtdpressos(int qtdpressos) {
        this.qtdpressos = qtdpressos;
    }

    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String toString() {
        return "Receita{" +
                "tituloreceita='" + tituloreceita + '\'' +
                ", tempopreparo='" + tempopreparo + '\'' +
                ", qtdpressos=" + qtdpressos +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
