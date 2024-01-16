package com.example.exc0607;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton imbu ;
    ImageView image ;
    Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imbu = findViewById(R.id.imbu);
        image = findViewById(R.id.image);
    }

    public void ace(View view) {
        int rand = rnd.nextInt(3)+1;
        if (rand == 1) {
            image.setImageResource(R.drawable.smurf1);
            imbu.setImageResource(R.drawable.one);
        }
        if (rand == 2) {
            image.setImageResource(R.drawable.smurf2);
            imbu.setImageResource(R.drawable.two);
        }
        if (rand == 3) {
            image.setImageResource(R.drawable.spookyscary);
            imbu.setImageResource(R.drawable.three);

        }



    }
}
