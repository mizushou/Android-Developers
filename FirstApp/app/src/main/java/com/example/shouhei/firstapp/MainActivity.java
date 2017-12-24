package com.example.shouhei.firstapp;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView firstText = (TextView)findViewById(R.id.firstText);

        int n = 10;
        long factorial = calculateFactorial(n);
        firstText.setText(String.valueOf(factorial));
        firstText.setTextSize(80f);
        this.setTitle(n + "の階乗");
        int color = ContextCompat.getColor(getApplicationContext(), R.color.colorAccent);
        firstText.setTextColor(color);

        Cat tama = new Cat("タマ", 3, "オス", "三毛猫");
        Cat kuro = new Cat("クロ", 1, "オス", "黒猫");

        tama.say(tama.name + "は" + tama.gender + "だにゃ");
        kuro.say(kuro.name + "は" + kuro.gender + "だにゃ");

        tama.sleep();
        kuro.say("寝てるし...");
        kuro.sleep();
    }

    private long calculateFactorial(int n) {
        long product = 1L;
        for (int i = 1; i <=n ; i++) {
            product = product * i;
        }
        return product;
    }

}
