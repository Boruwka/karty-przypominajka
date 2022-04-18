package com.example.kartyprzypominajka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditCardData extends AppCompatActivity {

    @Override
    void onCreate(Bundle savedInstanceState) {
        // card bierzemy tymi extrasami
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_card_data);


        /* View viewBugReport = LayoutInflater.from(ctx).inflate(R.layout.preference_report_bug,null);
    EditText edttxtBugDesc = (EditText) viewBugReport.findViewById(R.id.bug_description_edittext); */

        /* EditText edit_text_description = (EditText)findViewById(R.layout.activity_edit_card_data.card_description);
        Button save_button = (Button)findViewById(R.layout.activity_edit_card_data.save_button); */

        EditText edit_text_description = (EditText)findViewById(R.id.card_description);
        Button save_button = (Button)findViewById(R.id.save_button);

        save_button.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        saveCard(card, edit_text_description.getText().toString());
                    }
                });
    }

    void saveCard(Card card, String description)
    {

    }
}