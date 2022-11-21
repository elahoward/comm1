package com.ejh.elaactivitycomm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2 extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textView);
        Bundle extras=getIntent().getExtras();
        if (extras!=null){
         String message= extras.getString("msg1");
         textView.setText(message);
        }

    }
}