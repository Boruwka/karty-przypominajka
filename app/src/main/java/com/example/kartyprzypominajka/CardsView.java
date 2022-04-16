package com.example.kartyprzypominajka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
    }
    public void addCard()
    {
        Card card = new Card();
        idz_do(edit_card_data(card));
    }

    public void removeCard(Card card)
    {

    }

    public void editCard()
    {

    }
}