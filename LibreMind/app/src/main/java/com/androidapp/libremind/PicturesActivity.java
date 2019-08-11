package com.androidapp.libremind;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PicturesActivity extends AppCompatActivity {

    private Button ButtonPictures;
    private Text TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pictures);

        ButtonPictures = findViewById(R.id.letsgo);
        final TextView textViewToChange  = (TextView) findViewById(R.id.info);

        ButtonPictures.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                ButtonPictures.setText("Loading...");

                textViewToChange.setVisibility(View.GONE);
            }
        });
    }//protected void onCreate(Bundle


}//public class PicturesActivity extends AppCompatActivity
