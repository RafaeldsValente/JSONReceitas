package com.example.rafael.jsonreceitas;

import java.util.ArrayList;
import java.util.List;

import com.example.rafael.jsonreceitas.Receita;

/**
 * Created by Rafael on 25/03/2017.
 */

public class ListReceitas {

    private ArrayList<Receita> listaReceitas;


    public ListReceitas() {
    }

    public ListReceitas(ArrayList<Receita> listaReceitas) {
        this.listaReceitas = listaReceitas;
    }

    public List<Receita> getListaReceitas() {
        return listaReceitas;
    }

    public void setListaReceitas(ArrayList<Receita> listaReceitas) {
        this.listaReceitas = listaReceitas;
    }

    @Override
    public String toString() {
        return "" + listaReceitas;
    }
}
