package com.example.mayra.multiapps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.mayra.multiapps.MainActivity.MESSAGE_KEY;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String messSent = intent.getStringExtra(MESSAGE_KEY);

        TextView messageReceived = (TextView) findViewById(R.id.msn);
        messageReceived.setText(messSent);
    }

    public void Return(View view){
        Toast.makeText(this, "Going back", Toast.LENGTH_LONG);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
