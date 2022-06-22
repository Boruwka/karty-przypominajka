package com.example.kartyprzypominajka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CardView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);
        TextView textView = (TextView) findViewById(R.id.card_name);
        textView.setText(card.name);
        // jak tu przekaząć card?
        // tak:
        /* Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
Bundle b = new Bundle();
b.putInt("key", 1); //Your id
intent.putExtras(b); //Put your id to your next Intent
startActivity(intent);
finish(); */
        // a tak odebrać:
        /* Bundle b = getIntent().getExtras();
int value = -1; // or other values
if(b != null)
    value = b.getInt("key"); */
    }
}