package fr.m2i.signature;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private  TagEdit teSignature;
    private TagEdit teSignature2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teSignature = findViewById(R.id.teSignature);
        teSignature.setTagColor(Color.CYAN); //force la couleur du crayon
        teSignature.setTagWidth(20); // force la taille du crayon

        teSignature2 = findViewById(R.id.teSignature2);
        teSignature2.setTagColor(Color.RED);
        teSignature2.setTagWidth(10);
    }

    public void btClear1(View v){

        teSignature.clear();

            }
    public void btClear2(View v) throws IOException {

        teSignature2.save("test.png");

    }



}
