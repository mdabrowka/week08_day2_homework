package com.codeclan.example.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WordcountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordcount);
        WordCounter wordCounter = new WordCounter();
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        textView.setText(Integer.toString(numberOfWords) + " words entered");
        int numberOfWords = extras.getString("answer");
        TextView answerTextView = findViewById(R.id.answer);
        textView.setText(Integer.toString(numberOfWords) + " words entered");
        answerTextView.setText(numberOfWords);





    }
}
