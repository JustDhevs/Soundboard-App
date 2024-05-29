package com.SMK2.apkdheva;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer currentPlayer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Method to handle button click
        View.OnClickListener playSound = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentPlayer != null) {
                    currentPlayer.stop();
                    currentPlayer.release();
                    currentPlayer = null;
                }
                int soundId = (int) view.getTag();
                currentPlayer = MediaPlayer.create(MainActivity.this, soundId);
                currentPlayer.start();
            }
        };

        // First Linear Layout Buttons
        Button Button1 = findViewById(R.id.Btn1);
        Button1.setTag(R.raw.salam);
        Button1.setOnClickListener(playSound);

        Button Button2 = findViewById(R.id.Btn2);
        Button2.setTag(R.raw.sus);
        Button2.setOnClickListener(playSound);

        Button Button3 = findViewById(R.id.Btn3);
        Button3.setTag(R.raw.yeaboy);
        Button3.setOnClickListener(playSound);

        // First Linear Layout Image Views
        ImageView RButton = findViewById(R.id.Button1);
        RButton.setTag(R.raw.hellothere);
        RButton.setOnClickListener(playSound);

        ImageView RButton1 = findViewById(R.id.Button2);
        RButton1.setTag(R.raw.horn);
        RButton1.setOnClickListener(playSound);

        ImageView RButton2 = findViewById(R.id.Button3);
        RButton2.setTag(R.raw.booyah);
        RButton2.setOnClickListener(playSound);

        ImageView RButton3 = findViewById(R.id.Button4);
        RButton3.setTag(R.raw.paimon);
        RButton3.setOnClickListener(playSound);

        ImageView RButton4 = findViewById(R.id.Button5);
        RButton4.setTag(R.raw.spiderman);
        RButton4.setOnClickListener(playSound);

        ImageView RButton5 = findViewById(R.id.Button6);
        RButton5.setTag(R.raw.bruh);
        RButton5.setOnClickListener(playSound);

        ImageView Button69 = findViewById(R.id.BTN);
        Button69.setTag(R.raw.americaya);
        Button69.setOnClickListener(playSound);

        // Second Linear Layout Buttons
        ImageView Button4 = findViewById(R.id.Btn4);
        Button4.setTag(R.raw.ustdmrh);
        Button4.setOnClickListener(playSound);

        ImageView Button5 = findViewById(R.id.Btn5);
        Button5.setTag(R.raw.wait);
        Button5.setOnClickListener(playSound);

        ImageView Button6 = findViewById(R.id.Btn6);
        Button6.setTag(R.raw.epep);
        Button6.setOnClickListener(playSound);

        ImageView Button7 = findViewById(R.id.Btn7);
        Button7.setTag(R.raw.ustdmrh);
        Button7.setOnClickListener(playSound);

        ImageView Button8 = findViewById(R.id.Btn8);
        Button8.setTag(R.raw.wait);
        Button8.setOnClickListener(playSound);

        ImageView Button9 = findViewById(R.id.Btn9);
        Button9.setTag(R.raw.epep);
        Button9.setOnClickListener(playSound);


    }

    @Override
    protected void onDestroy() {
        if (currentPlayer != null) {
            currentPlayer.release();
            currentPlayer = null;
        }
        super.onDestroy();
    }
}
