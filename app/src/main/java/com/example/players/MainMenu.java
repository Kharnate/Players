package com.example.players;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    //main_menu.xml
    private Button startGameButton;
    private Button viewScoreboardButton;
    private Button selectPlayer1Button;
    private Button selectPlayer2Button;
    private Button addPlayerButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        
        //startGameButton.setOnClickListener(this);
        //viewScoreboardButton.setOnClickListener(this);

        configureNextButton();

    }

    public void configureNextButton() {

        startGameButton = (Button) findViewById(R.id.startGameButton);
        viewScoreboardButton = (Button) findViewById(R.id.viewScoreboardButton);
        selectPlayer1Button = (Button) findViewById(R.id.selectPlayer1Button);
        selectPlayer2Button = (Button) findViewById(R.id.selectPlayer2Button);
        addPlayerButton = (Button) findViewById(R.id.addPlayerButton);

        startGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                startActivity(new Intent(MainMenu.this, StartGame.class));
            }
        });
        viewScoreboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                startActivity(new Intent(MainMenu.this, ViewScoreBoard.class));
            }
        });
        selectPlayer1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                startActivity(new Intent(MainMenu.this, SelectPlayer1.class));
            }
        });
        selectPlayer2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                startActivity(new Intent(MainMenu.this, SelectPlayer2.class));
            }
        });
        addPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                startActivity(new Intent(MainMenu.this, AddPlayer.class));
            }
        });

    }

}