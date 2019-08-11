package com.androidapp.libremind;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //TIMER
    private static final long START_TIME_IN_MILIS = 3000;

    private CountDownTimer mCountDownTimer;
    private boolean mTimerRunning =false;

    private long mTimeLeftInMillis = START_TIME_IN_MILIS;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startTimer();

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

    }


    public void openListActivity(){
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);

    }

}//public class MainActivity extends AppCompatActivity
