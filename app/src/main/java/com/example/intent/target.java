package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class target extends AppCompatActivity {

    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        Bundle extras = getIntent().getExtras();
        final String inputS1 = extras.getString("key");
        final String inputS2 = extras.getString("key2");
        System.out.println(inputS1);
        System.out.println(inputS2);

        t1 = (TextView) findViewById(R.id
                .editText2);
        t2 = (TextView) findViewById(R.id.editText3);
        t1.setText(inputS1);
        t2.setText(inputS2);

    }
}