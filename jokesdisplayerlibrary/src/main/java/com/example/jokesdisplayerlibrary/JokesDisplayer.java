package com.example.jokesdisplayerlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesDisplayer extends AppCompatActivity {

    public static final String INTENT_STRING = "random_joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes_displayer);

        String randomJoke = getIntent().getStringExtra(INTENT_STRING);
        TextView randomJokeTextView = (TextView) findViewById(R.id.jokes_displayer_textView);
        randomJokeTextView.setText(randomJoke);
    }
}
