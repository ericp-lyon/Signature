package fr.m2i.signature;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private  TagEdit teSignature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teSignature = findViewById(R.id.teSignature);
        teSignature.setTagColor(Color.BLACK); //force la couleur du crayon
        teSignature.setTagWidth(20); // force la taille du crayon

    }
    public void btClear(View v){

        teSignature.clear();

            }




}
