package com.example.android.musicalstructureappmy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_main);
          /*
         Find the View that shows the numbers category as same as xml
         objectDataType  variableName = new
        */
        ImageView autostrad = (ImageView) findViewById(R.id.autos);

        // Set a click listener on that View
        autostrad.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent autostrad = new Intent(MainActivityMain.this, AutostratActivity.class);

                // Start the new activity
                startActivity(autostrad);
            }
        });
          /*
         Find the View that shows the numbers category as same as xml
         objectDataType  variableName = new
        */
        ImageView azizMarka = (ImageView) findViewById(R.id.aziz);

        // Set a click listener on that View
        azizMarka.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent azizMarkaIntent = new Intent(MainActivityMain.this, AzizMarkaActivity.class);

                // Start the new activity
                startActivity(azizMarkaIntent);
            }
        });
          /*
         Find the View that shows the numbers category as same as xml
         objectDataType  variableName = new
        */
        ImageView cairokyBand = (ImageView) findViewById(R.id.cairoky);

        // Set a click listener on that View
        cairokyBand.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent cairokyBandIntent = new Intent(MainActivityMain.this, CairokyBandActivity.class);

                // Start the new activity
                startActivity(cairokyBandIntent);
            }
        });
          /*
         Find the View that shows the numbers category as same as xml
         objectDataType  variableName = new
        */
        ImageView elmorabaa = (ImageView) findViewById(R.id.elmorabaa);

        // Set a click listener on that View
        elmorabaa.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent elmorabaaIntent = new Intent(MainActivityMain.this, ElmorabaaActivity.class);

                // Start the new activity
                startActivity(elmorabaaIntent);
            }
        });
          /*
         Find the View that shows the numbers category as same as xml
         objectDataType  variableName = new
        */
        ImageView hamzaNamera = (ImageView) findViewById(R.id.hamza);

        // Set a click listener on that View
        hamzaNamera.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent hamzaIntent = new Intent(MainActivityMain.this, HamzaActivity.class);

                // Start the new activity
                startActivity(hamzaIntent);
            }
        });
         /*
         Find the View that shows the numbers category as same as xml
         objectDataType  variableName = new
        */
        ImageView masarEgbary = (ImageView) findViewById(R.id.masar);

        // Set a click listener on that View
        masarEgbary.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent masarEgbaryIntent = new Intent(MainActivityMain.this, MasarActivity.class);

                // Start the new activity
                startActivity(masarEgbaryIntent);
            }
        });
    }
}