package com.earlcommunications.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText First_number = (EditText) findViewById(R.id.FIrstNumEditText);
                EditText Second_number = (EditText) findViewById(R.id.SecondnumbereditText);

                TextView result_view=(TextView) findViewById(R.id.resultTextview);

                int first = Integer.parseInt(First_number.getText().toString());
                int second = Integer.parseInt(Second_number.getText().toString());

                int result_text = first + second ;

                result_view.setText(result_text + "");
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText First_number = (EditText) findViewById(R.id.FIrstNumEditText);
                EditText Second_number = (EditText) findViewById(R.id.SecondnumbereditText);

                TextView result_view=(TextView) findViewById(R.id.resultTextview);

                int first = Integer.parseInt(First_number.getText().toString());
                int second = Integer.parseInt(Second_number.getText().toString());

                int result_text = first - second ;

                result_view.setText(result_text + "");
            }
        });
    }
}
