package com.qbra.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text = findViewById(R.id.number1Text);
        number2Text = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.resultText);

    }

    public void addition(View view)
    {
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches(""))
        {
            resultText.setText("Enter Number!");
        }
        else
        {
            int n1 = Integer.parseInt(number1Text.getText().toString());
            int n2 = Integer.parseInt(number2Text.getText().toString());
            int resultNum = n1 + n2;

            resultText.setText("Result: " + resultNum);
        }
    }

    public void subtraction(View view)
    {
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches(""))
        {
            resultText.setText("Enter Number!");
        }
        else
        {
            int n1 = Integer.parseInt(number1Text.getText().toString());
            int n2 = Integer.parseInt(number2Text.getText().toString());
            int resultNum = n1 - n2;

            resultText.setText("Result: " + resultNum);
        }
    }

    public void multiplication(View view)
    {
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches(""))
        {
            resultText.setText("Enter Number!");
        }
        else
        {
            int n1 = Integer.parseInt(number1Text.getText().toString());
            int n2 = Integer.parseInt(number2Text.getText().toString());
            int resultNum = n1 * n2;

            resultText.setText("Result: " + resultNum);
        }
    }

    public void division(View view)
    {
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches(""))
        {
            resultText.setText("Enter Number!");
        }
        else if (number2Text.getText().toString().matches("0"))
        {
            resultText.setText("Undefined");
        }
        else
        {
            int n1 = Integer.parseInt(number1Text.getText().toString());
            int n2 = Integer.parseInt(number2Text.getText().toString());
            int resultNum = n1 / n2;

            resultText.setText("Result: " + resultNum);
        }
    }
}