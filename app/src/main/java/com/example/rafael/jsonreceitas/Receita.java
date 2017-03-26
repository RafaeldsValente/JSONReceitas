package com.example.rafael.jsonreceitas;

import java.util.List;

/**
 * Created by Rafael on 18/03/2017.
 */

public class Receita {

    private String tituloreceita;
    private String tempopreparo;
    private int qtdpessoas;
    private List<Ingredientes> ingredientes;


    public Receita() {
    }

    public Receita(String tituloreceita, String tempopreparo, int qtdpessoas, List<Ingredientes> ingredientes) {
        this.tituloreceita = tituloreceita;
        this.tempopreparo = tempopreparo;
        this.qtdpessoas = qtdpessoas;
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

    public int getQtdpessoas() {
        return qtdpessoas;
    }

    public void setQtdpessoas(int qtdpessoas) {
        this.qtdpessoas = qtdpessoas;
    }

    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String toString() {
        return "Receitas :\n" +
                "Titulo = " + tituloreceita + "\n" +
                "Tempo de Preparo ='" + tempopreparo + "\n" +
                "Pessoas = " + qtdpessoas + "\n" +
                "Ingredientes = " + ingredientes +
                '}';
    }
}
