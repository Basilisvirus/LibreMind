package com.androidapp.libremind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ListActivity extends AppCompatActivity {

    private Button ButtonShapes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        ButtonShapes = findViewById(R.id.shapes);

        ButtonShapes.setOnClickListener(new View.OnClickListener(){
            @Override
              public void onClick(View v)
            {
                ButtonShapes.setText("Loading...");
                openPicturesActivity();

             }
         });


    }//protected void onCreate(Bundle

    public void openPicturesActivity(){
        Intent intent = new Intent(this, PicturesActivity.class);
        startActivity(intent);

    }

}//public class ListActivity extends AppCompatActivity
