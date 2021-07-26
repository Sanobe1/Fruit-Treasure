package com.fruittreasure.tree;

import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class ActivityEnd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_end);
    }

    public void onClick(View v) {
        Button button = findViewById(v.getId());

        switch (button.getTag().toString()) {

            case "menuEnd": {
                startActivity(new Intent(this, MenuActivity.class));
                break;
            }
        }
    }

}