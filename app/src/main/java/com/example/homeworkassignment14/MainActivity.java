package com.example.homeworkassignment14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Intial Variables
    Integer Counter = 0;
    Integer RollNum = 0;
    String NumberList = "";
    Integer NumberCalc = 0;
    Integer NumberResult = 0;
    String NumberConvert;
    Integer Numbervalue = 0;
    Integer RandomNumber;
    Integer Percentile = 100;
    Random r = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Number Pad Buttons
    public void onButtonClicked7(View V)
    {
        //When a button gets clicked on the number pad, that number gets added to a variable.
        //It also displays it in the text box as well.
        TextView NumberTextView = this.findViewById(R.id.NumberTextView);
        NumberList = NumberList + "7";
        Numbervalue = 7;
        NumberTextView.setText(NumberList);
    }
    public void onButtonClicked8(View V)
    {
        TextView NumberTextView = this.findViewById(R.id.NumberTextView);
        NumberList = NumberList + "8";
        NumberTextView.setText(NumberList);
    }
    public void onButtonClicked9(View V)
    {
        TextView NumberTextView = this.findViewById(R.id.NumberTextView);
        NumberList = NumberList + "9";
        NumberTextView.setText(NumberList);
    }
    public void onButtonClicked4(View V)
    {
        TextView NumberTextView = this.findViewById(R.id.NumberTextView);
        NumberList = NumberList + "4";
        NumberTextView.setText(NumberList);
    }
    public void onButtonClicked5(View V)
    {
        TextView NumberTextView = this.findViewById(R.id.NumberTextView);
        NumberList = NumberList + "5";
        NumberTextView.setText(NumberList);
    }
    public void onButtonClicked6(View V)
    {
        TextView NumberTextView = this.findViewById(R.id.NumberTextView);
        NumberList = NumberList + "6";
        NumberTextView.setText(NumberList);
    }
    public void onButtonClicked1(View V)
    {
        TextView NumberTextView = this.findViewById(R.id.NumberTextView);
        NumberList = NumberList + "1";
        NumberTextView.setText(NumberList);
    }
    public void onButtonClicked2(View V)
    {
        TextView NumberTextView = this.findViewById(R.id.NumberTextView);
        NumberList = NumberList + "2";
        NumberTextView.setText(NumberList);
    }
    public void onButtonClicked3(View V)
    {
        TextView NumberTextView = this.findViewById(R.id.NumberTextView);
        NumberList = NumberList + "3";
        NumberTextView.setText(NumberList);
    }
    public void onButtonClicked0(View V)
    {
        TextView NumberTextView = this.findViewById(R.id.NumberTextView);
        NumberList = NumberList + "0";
        NumberTextView.setText(NumberList);
    }
    public void onButtonClickedClear(View V)
    {
        //THe clear button sets the numberlist and rolenum variables to a blank string or zero.
        //It also displays empty text on the screen as well.
        TextView NumberTextView = this.findViewById(R.id.NumberTextView);
        NumberTextView.setText("");
        NumberList = "";
        RollNum = 0;
    }

    //Roll Number Buttons
    public void onButtonClickedR4(View V)
    {
        //whenever a role number button is clicked, a number gets added to role num and D4 gets added to the number list.
        //I don't know where the error is.
        TextView NumberTextView = this.findViewById(R.id.NumberTextView);
        RollNum = 4;
        NumberList = NumberList + "D4";
        NumberTextView.setText(NumberList);
    }

    public void onButtonClickedR6(View V)
    {
        TextView NumberTextView = this.findViewById(R.id.NumberTextView);
        RollNum = 6;
        NumberList = NumberList + "D6";
        NumberTextView.setText(NumberList);
    }

    public void onButtonClickedR8(View V)
    {
        TextView NumberTextView = this.findViewById(R.id.NumberTextView);
        RollNum = 8;
        NumberList = NumberList + "D8";
        NumberTextView.setText(NumberList);
    }

    public void onButtonClickedR10(View V)
    {
        TextView NumberTextView = this.findViewById(R.id.NumberTextView);
        RollNum = 10;
        NumberList = NumberList + "D10";
        NumberTextView.setText(NumberList);
    }

    public void onButtonClickedR12(View V)
    {
        TextView NumberTextView = this.findViewById(R.id.NumberTextView);
        RollNum = 12;
        NumberList = NumberList + "D12";
        NumberTextView.setText(NumberList);
    }

    public void onButtonClickedR20(View V)
    {
        TextView NumberTextView = this.findViewById(R.id.NumberTextView);
        RollNum = 20;
        NumberList = NumberList + "D20";
        NumberTextView.setText(NumberList);
    }

    //Roll, Percentile, and Dark Mode Buttons Buttons
    public void onButtonClickedRoll(View V)
    {
        //Starts a counter and adds the number to the string and two a varible.
        Counter = 0;
        while(Numbervalue <= Counter)
        {
            RandomNumber = r.nextInt(RollNum);
            NumberCalc = NumberCalc + RandomNumber;
            NumberConvert = Integer.toString(RandomNumber);
            NumberList = NumberList + " + " + NumberConvert;
            Counter++;
        }
        //displays the calculation and the result.
        TextView TopTextView = this.findViewById(R.id.TopTextView);
        TextView ResultTextView = this.findViewById(R.id.ResultTextView);
        TopTextView.setText(NumberList);
        ResultTextView.setText(NumberCalc);
    }
    public void onButtonClickedPercentile(View V)
    {
        //Generates a random number and displays that number. 
        RandomNumber = r.nextInt(Percentile);
        TextView TopTextView = this.findViewById(R.id.TopTextView);
        TextView ResultTextView = this.findViewById(R.id.ResultTextView);
        TopTextView.setText(0);
        ResultTextView.setText(RandomNumber);

    }
}