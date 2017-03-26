package com.example.rafael.jsonreceitas;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rafael on 18/03/2017.
 */

public class Util {

    public static String rawtoJason(InputStream inputStream){

        InputStream localstream = inputStream;
        String jsonString = "";
        Writer leitor = new StringWriter();

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(localstream, "UTF-8"));
            String line = reader.readLine();
            while (line != null) {
                leitor.write(line);
                line = reader.readLine();
            }
            jsonString = leitor.toString();
            leitor.close();
            reader.close();
            localstream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonString;
    }

    public static ListReceitas jsonToListReceitas (String jsonString){

        ListReceitas listreceitas = new ListReceitas();
        Receita receita = null;
        ArrayList<Ingredientes> listIngre;

       try {

            JSONObject objetoJson = new JSONObject(jsonString);
            ArrayList<Receita> listaReceitas = new ArrayList<Receita>();

           JSONArray arrayReceitasJson = objetoJson.getJSONArray("ListReceitas");

           for(int i = 0; i < arrayReceitasJson.length(); i++){
               receita = new Receita();
               listIngre = new ArrayList<Ingredientes>();
               receita.setTituloreceita(arrayReceitasJson.getJSONObject(i).getString("Titulo"));
               receita.setTempopreparo(arrayReceitasJson.getJSONObject(i).getString("TempoPreparo"));
               receita.setQtdpessoas(arrayReceitasJson.getJSONObject(i).getInt("Serve"));

               JSONArray listaIngredientes = arrayReceitasJson.getJSONObject(i).getJSONArray("Ingredientes");

               for(int in = 0; in < listaIngredientes.length(); in++) {
                   Ingredientes ingredientes = new Ingredientes();
                   ingredientes.setIngrediente(listaIngredientes.getJSONObject(in).getString("TituloIngrediente"));

                    listIngre.add(ingredientes);
               }
               receita.setIngredientes(listIngre);
               listaReceitas.add(receita);

           }

           listreceitas.setListaReceitas(listaReceitas);

        } catch (JSONException e) {
           e.printStackTrace();
       }
        return listreceitas;

    }

    public static ArrayList<Receita> convertToReceita(String arquivoJson){

        ArrayList<Receita> receitas = null;

        try {
            receitas = new ArrayList<Receita>();
            List<Ingredientes>listIngredientes = new ArrayList<>();
            JSONObject objetoJson = new JSONObject(arquivoJson);


            JSONArray receitasJSON = objetoJson.getJSONArray("Receitas");

            for (int i = 0; i < receitasJSON.length(); i++){

                JSONObject objetoReceitasJson = receitasJSON.getJSONObject(i);
                String tituloReceita = objetoJson.getString("Titulo");
                String tempoPreparo = objetoJson.getString("TempoPreparo");
                Integer qtdPessoas = objetoJson.getInt("Serve");
                JSONArray ingredientes = objetoJson.getJSONArray("Ingredientes");

                for(int x = 0; x < ingredientes.length(); x++){
                    String ingrediente = objetoReceitasJson.getString("TituloIngrediente");
                    listIngredientes.add(new Ingredientes(ingrediente));
                }

                receitas.add(new Receita(tituloReceita,tempoPreparo,qtdPessoas,listIngredientes));
            }

        }catch (JSONException e){
            e.printStackTrace();
            return null;
        }

        return receitas;

    }

}
