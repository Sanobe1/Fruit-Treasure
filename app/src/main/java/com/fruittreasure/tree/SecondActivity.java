package com.fruittreasure.tree;

import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_second);
    }

    public void onClick(View v) {
        Button button = findViewById(v.getId());

        switch (button.getTag().toString()) {

            case "cherry2":

            case "grape2":


            case "bells2": {
                startActivity(new Intent(this, ThirdActivity.class));
                break;
            }


        }
        }
    }




