package com.example.rafael.jsonreceitas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.List;

public class MainActivity extends Activity {

    private TextView txReceitas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txReceitas = (TextView) findViewById(R.id.TxReceitas);
    }

    public void loadJSON(View v){

        String listReceitas = Util.jsonToListReceitas(Util.rawtoJason(getResources().openRawResource(R.raw.receitas))).toString();
        txReceitas.setText(listReceitas);
    }


}
