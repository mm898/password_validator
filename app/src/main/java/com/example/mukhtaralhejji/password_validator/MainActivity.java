package com.example.mukhtaralhejji.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.validation.Validator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Btn1 = (Button) findViewById(R.id.submit);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input = (EditText) findViewById(R.id.input);
                TextView result = (TextView) findViewById(R.id.result);

                //result.setText("yes");
                //validator.validate(input.getText()) ==
                if(validator.validate(input.getText().toString()) == true)
                    result.setText("Valid Password");
                else
                    result.setText("Not Valid Password");
            }
        });
    }
}
