package com.cbsanjaya.vocab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void basic(View view) {
        Intent intent = new Intent(this, BasicActivity.class);
        startActivity(intent);
    }

    public void preBasic(View view) {
        Toast.makeText(this, "Nothing", Toast.LENGTH_LONG).show();
    }
}
