package com.example.kartyprzypominajka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CardsView extends AppCompatActivity
{

    public Card[] cards;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_cards);
        Button add_card_button = (Button)findViewById(R.id.add_card_button);
        add_card_button.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        addCard();
                    }
                });
        /* mEdit   = (EditText)findViewById(R.id.edittext);
        mButton = (Button)findViewById(R.id.button);

        mButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Log.v("EditText", mEdit.getText().toString());
                    }
                }); */

        /* setContentView(R.layout.layoutName);
TextView textView = (TextView) findViewById(R.id.textViewName);
textView.setText("text you want to display"); */
    }
    public void addCard()
    {
        Card card = new Card();
        idz_do(edit_card_data(card));
        app_data.cards.push(card);
    }

    public void removeCard(Card card)
    {

    }

    public void editCard()
    {

    }
}