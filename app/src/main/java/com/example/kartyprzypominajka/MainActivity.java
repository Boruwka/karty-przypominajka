package com.example.kartyprzypominajka;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // notifications view

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button switch_to_cards_view_button = (Button)findViewById(R.id.switch_to_card_view_button);
        switch_to_card_view_button.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        switchToCardView();
                    }
                });
    }

    public void switchToCardView()
    {
        Intent myIntent = new Intent(MainActivity.this, CardsView.class);
        // myIntent.putExtra("key", value); //Optional parameters
        MainActivity.this.startActivity(myIntent);
    }

    public void registerPayment()
    {
        Intent myIntent = new Intent(MainActivity.this, EditPayment.class);
        // myIntent.putExtra("key", value); //Optional parameters
        MainActivity.this.startActivity(myIntent);
    }
}

