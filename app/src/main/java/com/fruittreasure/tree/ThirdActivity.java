package com.fruittreasure.tree;

import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_third);

        YoYo.with(Techniques.Tada)
                .duration(700)
                .repeat(1)
                .playOn(findViewById(R.id.thirdTextView));

    }

    public void onClick(View v) {
        Button button = findViewById(v.getId());

        switch (button.getTag().toString()) {

            case "cherry3":

            case "raspberries3":

            case "grape3":

            case "diamond3": {
                startActivity(new Intent(this,ActivityEnd .class));
                break;
            }
            default:
                break;
        }
    }
}