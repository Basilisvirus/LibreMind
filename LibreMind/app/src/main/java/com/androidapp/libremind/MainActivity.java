package com.androidapp.libremind;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //TIMER
    private static final long START_TIME_IN_MILIS = 2000;
    private Button mButtonStartPause;

    private CountDownTimer mCountDownTimer;
    private boolean mTimerRunning =false;

    private long mTimeLeftInMillis = START_TIME_IN_MILIS;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonStartPause = findViewById(R.id.start);
        startTimer();
        mButtonStartPause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


            }
        });



    }//protected void onCreate(Bundle

    public void startTimer(){
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000){
            @Override
            public void onTick(long millisUntilFinished){
                mTimeLeftInMillis = millisUntilFinished;

            }

            @Override
            public void onFinish(){
                openListActivity();

            }
        }.start(); //immediately start the timer

        mTimerRunning = true;
        mButtonStartPause.setText("started1");
    }


    public void openListActivity(){
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);

    }

}//public class MainActivity extends AppCompatActivity
