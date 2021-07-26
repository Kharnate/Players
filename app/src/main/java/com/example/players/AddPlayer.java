package com.example.players;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

public class AddPlayer extends AppCompatActivity implements TextView.OnEditorActionListener {

    //add_player.xml
    private EditText enterPlayerNameEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_player);

        enterPlayerNameEditText = (EditText) findViewById(R.id.editTextTextPersonName);
        enterPlayerNameEditText.setOnEditorActionListener(this);

    }


    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {

        return false;
    }



}