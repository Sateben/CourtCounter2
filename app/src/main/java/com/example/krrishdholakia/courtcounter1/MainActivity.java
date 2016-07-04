package com.example.krrishdholakia.courtcounter1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    int counter = 0;
    int counter2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the + button is clicked.
     */

    public void incrementOneOne(View view) {
        int quantity = 1;

        displayOne(quantity);
    }

    public void incrementTwoOne(View view) {
        int quantity = 2;

        displayOne(quantity);
    }

    public void incrementThreeOne(View view) {
        int quantity = 3;

        displayOne(quantity);
    }

    public void incrementOneTwo(View view) {
        int quantity = 1;

        displayTwo(quantity);
    }

    public void incrementTwoTwo(View view) {
        int quantity = 2;

        displayTwo(quantity);
    }

    public void incrementThreeTwo(View view) {
        int quantity = 3;

        displayTwo(quantity);
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayOne(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.team1_text_view);
        int number2 = number + counter;
        if (quantityTextView != null)
        { quantityTextView.setText("" + number2);}

        counter = counter + number;

    }

    private void displayTwo(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.team2_text_view);
        int number2 = number + counter2;
        if (quantityTextView != null)
        {quantityTextView.setText("" + number2);}

        counter2 = counter2 + number;

    }
    
    public void resetAll(View view)
    {
        TextView quantityTextView1 = (TextView) findViewById(
                R.id.team1_text_view);
        TextView quantityTextView2 = (TextView) findViewById(
                R.id.team2_text_view);
        if (quantityTextView1 != null && quantityTextView2 != null)
        {quantityTextView1.setText("0");
        quantityTextView2.setText("0");
        counter = 0;
        counter2 = 0;
        }
    }
}


