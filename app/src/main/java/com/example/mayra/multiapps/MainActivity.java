package com.example.mayra.multiapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String MESSAGE_KEY = "MESSAGE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Send(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        // Get the message
        EditText mess = (EditText) findViewById(R.id.message);
        String message = mess.getText().toString();

        // Message into the intent
        intent.putExtra(MESSAGE_KEY, message);
        startActivity(intent);

        Toast.makeText(this, "Message Sent", Toast.LENGTH_LONG).show();

        // Start the intent
        Intent intent0 = new Intent(this, MyIntentService.class);
        startService(intent0);
    }
}
