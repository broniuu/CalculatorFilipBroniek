package com.example.calculator_lm2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List <Double> numbers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState((outState));
        outState.putString("KEY","STRING VALUE");
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        String variable = savedInstanceState.getString("KEY","DEFAULT STRING VALUE");
    }

    public void calculate(View view) {
        int currentButtonId = view.getId();
        TextView resultTextViev = findViewById(R.id.textView);
        String bufferText = String.valueOf(resultTextViev.getText());
        switch (currentButtonId) {
            case R.id.button0:
                bufferText = setBufferNumberText("0",bufferText);
                break;
            case R.id.button1:
                bufferText = setBufferNumberText("1",bufferText);
                break;
            case R.id.button2:
                bufferText = setBufferNumberText("2",bufferText);
                break;
            case R.id.button3:
                bufferText = setBufferNumberText("3",bufferText);
                break;
            case R.id.button4:
                bufferText = setBufferNumberText("4",bufferText);
                break;
            case R.id.button5:
                bufferText = setBufferNumberText("5",bufferText);
                break;
            case R.id.button6:
                bufferText = setBufferNumberText("6",bufferText);
                break;
            case R.id.button7:
                bufferText = setBufferNumberText("7",bufferText);
                break;
            case R.id.button8:
                bufferText = setBufferNumberText("8",bufferText);
                break;
            case R.id.button9:
                bufferText = setBufferNumberText("9",bufferText);
                break;
            case R.id.buttonAC:
                bufferText = "0";
                break;
            case R.id.buttonPlusMinus:
                if(bufferText.equals("0")){
                    bufferText = "(-";
                }else {
                    bufferText = "(-" + bufferText;
                }
                break;
            case R.id.buttonProccent:
                    bufferText = setBufferSignText("%",bufferText);
                break;
            case  R.id.buttonSlash:
                bufferText = setBufferSignText("/",bufferText);
                break;
            case  R.id.buttonMulti:
                bufferText = setBufferSignText("x",bufferText);
                break;
            case  R.id.buttonMinus:
                bufferText = setBufferSignText("-",bufferText);
                break;
            case  R.id.buttonPlus:
                bufferText = setBufferSignText("+",bufferText);
                break;
            case R.id.buttonLog10:
                bufferText = setBufferOperationText("Log(",bufferText);
                break;
            case R.id.buttonFactorial:
                bufferText = setBufferSignText("!", bufferText);
                break;
            case R.id.buttonSqrt:
                bufferText = setBufferOperationText("√(", bufferText);
                break;
            case R.id.buttonPow3:
                bufferText = setBufferSignText("^3", bufferText);
                break;
            case R.id.buttonPow2:
                bufferText = setBufferSignText("^2", bufferText);
                break;
            case  R.id.buttonEquals:
                break;

        }
        resultTextViev.setText(bufferText);
    }

    public String setBufferNumberText(String text, String bufferText){
        if(bufferText.equals("0")) {
            bufferText = text;
        }
        else {
            bufferText += text;
        }
        return bufferText;
    }
    public String setBufferSignText(String text, String bufferText) {
        if(bufferText.equals("0") == false){
            bufferText += text;
        }
        return bufferText;
    }

    public String setBufferOperationText(String text, String bufferText) {
        if (bufferText.equals("0")) {
            bufferText = text;
        } else {
            bufferText += text;
        }
        return bufferText;
    }
}