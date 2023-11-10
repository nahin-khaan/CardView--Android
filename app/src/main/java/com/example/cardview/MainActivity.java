package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView cardStage, cardFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardStage = findViewById(R.id.stageId);
        cardFood = findViewById(R.id.foodId);

        cardStage.setOnClickListener(this);
        cardFood.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.stageId) {
            Intent intent = new Intent(MainActivity.this,Stage.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.foodId) {
            Intent intent = new Intent(MainActivity.this,food.class);
            startActivity(intent);

        }
    }
}