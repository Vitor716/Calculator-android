package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1, ed2,ed3;
    Button bt1, btDiv,btSub,btMulti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText) findViewById(R.id.editText1);
        ed2 = (EditText) findViewById(R.id.editText2);
        ed3 = (EditText) findViewById(R.id.editText3);

        bt1 = (Button) findViewById(R.id.button_1);
        btDiv = (Button) findViewById(R.id.button_Div);
        btSub = (Button) findViewById(R.id.button_Sub);
        btMulti = (Button) findViewById(R.id.button_Multi);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1;
                Double v2;
                Double Result;

                v1 =Double.parseDouble (ed1.getText().toString());
                v2= Double.parseDouble(ed2.getText().toString());
                Result = v1 + v2;
                ed3.setText(Result.toString());

            }
        });
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1;
                Double v2;
                Double Result;

                v1 =Double.parseDouble (ed1.getText().toString());
                v2= Double.parseDouble(ed2.getText().toString());
                Result = v1 / v2;
                ed3.setText(Result.toString());

            }
        });
        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1;
                Double v2;
                Double Result;

                v1 =Double.parseDouble (ed1.getText().toString());
                v2= Double.parseDouble(ed2.getText().toString());
                Result = v1 - v2;
                ed3.setText(Result.toString());

            }
        });
        btMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1;
                Double v2;
                Double Result;

                v1 =Double.parseDouble (ed1.getText().toString());
                v2= Double.parseDouble(ed2.getText().toString());
                Result = v1 * v2;
                ed3.setText(Result.toString());

            }
        });

    }
}