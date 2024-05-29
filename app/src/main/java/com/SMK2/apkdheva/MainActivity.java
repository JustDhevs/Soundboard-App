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
        ImageView Button1 = findViewById(R.id.Button1);
        Button1.setTag(R.raw.salam);
        Button1.setOnClickListener(playSound);

        ImageView Button2 = findViewById(R.id.Button2);
        Button2.setTag(R.raw.sus);
        Button2.setOnClickListener(playSound);

        ImageView Button3 = findViewById(R.id.Button3);
        Button3.setTag(R.raw.yeaboy);
        Button3.setOnClickListener(playSound);

        // First Linear Layout Image Views
        ImageView RButton = findViewById(R.id.Button4);
        RButton.setTag(R.raw.hellothere);
        RButton.setOnClickListener(playSound);

        ImageView RButton1 = findViewById(R.id.Button5);
        RButton1.setTag(R.raw.horn);
        RButton1.setOnClickListener(playSound);

        ImageView RButton2 = findViewById(R.id.Button6);
        RButton2.setTag(R.raw.booyah);
        RButton2.setOnClickListener(playSound);

        ImageView RButton3 = findViewById(R.id.Button7);
        RButton3.setTag(R.raw.paimon);
        RButton3.setOnClickListener(playSound);

        ImageView RButton4 = findViewById(R.id.Button8);
        RButton4.setTag(R.raw.spiderman);
        RButton4.setOnClickListener(playSound);

        ImageView RButton5 = findViewById(R.id.Button9);
        RButton5.setTag(R.raw.bruh);
        RButton5.setOnClickListener(playSound);

        ImageView Button69 = findViewById(R.id.Button10);
        Button69.setTag(R.raw.americaya);
        Button69.setOnClickListener(playSound);

        // Second Linear Layout Buttons
        ImageView Button4 = findViewById(R.id.Button11);
        Button4.setTag(R.raw.galaxy);
        Button4.setOnClickListener(playSound);

        ImageView Button5 = findViewById(R.id.Button12);
        Button5.setTag(R.raw.aduhh);
        Button5.setOnClickListener(playSound);

        ImageView Button6 = findViewById(R.id.Button13);
        Button6.setTag(R.raw.epep);
        Button6.setOnClickListener(playSound);

        ImageView Button7 = findViewById(R.id.Button14);
        Button7.setTag(R.raw.ustdmrh);
        Button7.setOnClickListener(playSound);

        ImageView Button8 = findViewById(R.id.Button15);
        Button8.setTag(R.raw.wait);
        Button8.setOnClickListener(playSound);

        ImageView Button9 = findViewById(R.id.Button16);
        Button9.setTag(R.raw.ack);
        Button9.setOnClickListener(playSound);

        ImageView Button10 = findViewById(R.id.Button17);
        Button10.setTag(R.raw.shock);
        Button10.setOnClickListener(playSound);

        ImageView Button11 = findViewById(R.id.Button18);
        Button11.setTag(R.raw.yntkts);
        Button11.setOnClickListener(playSound);


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
