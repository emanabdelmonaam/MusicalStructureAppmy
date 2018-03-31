package com.example.android.musicalstructureappmy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         /*
         Find the View that shows the numbers category as same as xml
         objectDataType  variableName = new
        */
        Button next_main = (Button) findViewById(R.id.next_main);

        // Set a click listener on that View
        next_main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent next_mainIntent = new Intent(MainActivity.this, MainActivityMain.class);

                // Start the new activity
                startActivity(next_mainIntent);
            }
        });
    }
}