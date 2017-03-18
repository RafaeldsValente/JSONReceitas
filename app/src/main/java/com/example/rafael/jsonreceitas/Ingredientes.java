package com.example.rafael.jsonreceitas;

/**
 * Created by Rafael on 18/03/2017.
 */

public class Ingredientes {


    private String ingrediente;

    public Ingredientes(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        return "Ingrediente: " + this.getIngrediente();
    }

}
