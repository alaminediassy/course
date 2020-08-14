package com.uvs.course;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    //Methode qui gère

    public void onEnregistrer(View view){

        EditText editText = (EditText) findViewById(R. id. tvName);

        String name = editText.getText().toString();

        System.out.println("Le nom saisi est " + name);
        Intent intent = new Intent(this, DisplayNameActivity.class);
        intent.putExtra(EXTRA_NAME, name); //on stocke le nom récupéré dans une constante EXTRA_NAME clé (EXTRA_NAME) => valeur (name)
        startActivity(intent);

    }
}