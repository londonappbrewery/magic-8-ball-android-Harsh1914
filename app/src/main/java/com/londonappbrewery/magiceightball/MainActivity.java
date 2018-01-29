package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button;
        button = (Button) findViewById(R.id.button);

        final ImageView imageView = (ImageView) findViewById(R.id.imageView);

          final int[] ballArray = {
                 R.drawable.ball1,
                 R.drawable.ball2,
                 R.drawable.ball3,
                 R.drawable.ball4,
                 R.drawable.ball5,
         };

                 button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Log.d("magicball", "The button was pressed");

                 Random randomnumberGenerator = new Random();
                 int number = randomnumberGenerator.nextInt(5);

                  imageView.setImageResource(ballArray[number]);




             }
         });






    }}

