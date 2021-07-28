package com.fruittreasure.tree;

import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu);

        YoYo.with(Techniques.FadeIn)
                .duration(700)
                .repeat(1)
                .playOn(findViewById(R.id.textview1));

    }

    public void onClick(View v) {
        Button button = findViewById(v.getId());

        switch (button.getTag().toString()) {

            case "start" : {
                startActivity(new Intent(this, FirstActivity.class));

                finish();
                break;
            }

            case "policy": {
                startActivity(new Intent(this, ActivityPolicy.class));

                finish();
                break;
            }


            case "rules": {
                startActivity(new Intent(this, ActivityRules.class));

                finish();
                break;
            }

            case "exit": {
                finish();
                break;
            }

            default:
                break;
        }
    }
}

