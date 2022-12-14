package com.ejh.elaactivitycomm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2 extends AppCompatActivity {
    private TextView textView;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textView);
        button2=findViewById(R.id.button2);

        Bundle extras=getIntent().getExtras();
        if (extras!=null){
         String message= extras.getString("msg1");
         textView.setText(message);
        }
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnIntent =getIntent();
                returnIntent.putExtra("returnData", "retour");
                setResult(RESULT_OK,returnIntent);
                finish();

            }
        });

    }
}