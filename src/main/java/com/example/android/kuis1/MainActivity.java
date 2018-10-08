package com.example.android.kuis1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.textView).setOnClickListener(this);
    }

    @Override
    public void sendMessage1(View v) {
        Intent intent = new Intent(this,berita1.class );
        startActivity(intent);
        }

    public void sendMessage2(View v) {
        Intent intent = new Intent(this,berita2.class );
        startActivity(intent);
    }
}
