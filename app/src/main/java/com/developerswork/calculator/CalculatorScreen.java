package com.developerswork.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorScreen extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_screen);
        text = (TextView) findViewById(R.id.numericI);
        inputText = "";
    }

    public boolean isOperator(String text){
        try{
            Integer.parseInt(text);
        }catch (Exception e){
            return true;
        }
        return false;
    }

    public void ParseString(){
        // code the parser here
    }

    public void deleteLastInput(View view){
        inputText = inputText.substring(0,inputText.length()-1);

        text.setText(inputText);
    }

    String inputText;

    public void clearInput(View view){
        inputText = "";

        text.setText(inputText);
    }

    public void numericInput(View view){
        Button number = (Button) view;

        String addText = number.getText().toString();
        if(isOperator(addText) && isOperator(inputText.substring(inputText.length()-1)))
            return;
        inputText += addText;

        text.setText(inputText);
    }
}
