package com.senagitmis.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       number1 =findViewById(R.id.number1);
       number2 = findViewById(R.id.number2);
       result= findViewById(R.id.result);
    }
    public void sum(View view){
        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            result.setText("Enter number!");
        }
        else{
        int numberT1=Integer.parseInt(number1.getText().toString());
        int numberT2 = Integer.parseInt(number2.getText().toString());
        int resultT= numberT1 + numberT2;
        result.setText("Result: "+resultT);}
    }
    public void deduct(View view){
        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            result.setText("Enter number!");
        }else{
        int numberT1=Integer.parseInt(number1.getText().toString());
        int numberT2=Integer.parseInt(number2.getText().toString());
        int resultT= numberT1 - numberT2;
        result.setText("Result: "+resultT);
        }
    }
    public void multi(View view){
        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            result.setText("Enter number!");
        }
        else {
            int numberT1 = Integer.parseInt(number1.getText().toString());
            int numberT2 = Integer.parseInt(number2.getText().toString());
            int resultT = numberT1 * numberT2;
            result.setText("Result: " + resultT);
        }

    }
    public void devision(View view){
        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            result.setText("Enter number!");
        }
        else {
        int numberT1=Integer.parseInt(number1.getText().toString());
        int numberT2=Integer.parseInt(number2.getText().toString());
        int resultT= numberT1 / numberT2;
        result.setText("Result: "+resultT);

    }}
}