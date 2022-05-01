package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    //String to display the numbers on the screen
    String No0 = "0";
    String No1 = "1";
    String No2 = "2";
    String No3 = "3";
    String No4 = "4";
    String No5 = "5";
    String No6 = "6";
    String No7 = "7";
    String No8 = "8";
    String No9 = "9";
    String plus = "+";
    String minus = "-";
    String divide ="/";
    String times ="x";
    String point = ".";
    String cancel = "";
    int equal_to;
    int calculation1;
    int calculation2;
    String value1;
    String value2;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Button Initialization
        Button button_No0 = (Button) findViewById(R.id.No0_button);
        Button button_No1 = (Button) findViewById(R.id.No1_button);
        Button button_No2 = (Button)findViewById(R.id.No2_button);
        Button button_No3 = (Button)findViewById(R.id.No3_button);
        Button button_No4 = (Button)findViewById(R.id.No4_button);
        Button button_No5 = (Button)findViewById(R.id.No5_button);
        Button button_No6 = (Button)findViewById(R.id.No6_button);
        Button button_No7 = (Button)findViewById(R.id.No7_button);
        Button button_No8 = (Button)findViewById(R.id.No8_button);
        Button button_No9 = (Button)findViewById(R.id.No9_button);
        Button button_plus = (Button)findViewById(R.id.plus_button);
        Button button_minus = (Button)findViewById(R.id.minus_button);
        Button button_times = (Button)findViewById(R.id.times_button);
        Button button_divide = (Button)findViewById(R.id.divide_button);
        Button button_point = (Button) findViewById(R.id.point_button);
        Button button_cancel = (Button)findViewById(R.id.cancel_button);
        Button button_equal_to = (Button)findViewById(R.id.equal_button);
        TextView displayed_Text = (TextView) findViewById(R.id.Display);


        button_No0.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {displayed_Text.append(No0);

            }
        });

        button_No1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                displayed_Text.append(No1);
            }
        });
        button_No2.setOnClickListener(new OnClickListener(){
        @Override
                public void onClick(View view){
            displayed_Text.append(No2);
        }

        });


        //Setting Onclick Listener to add to the display Text as a string
        button_No3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                displayed_Text.append(No3);
            }
        });

        button_No4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                displayed_Text.append(No4);
            }
        });

        button_No5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                displayed_Text.append(No5);
            }
        });

        button_No6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                displayed_Text.append(No6);
            }
        });


        button_No7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                displayed_Text.append(No7);
            }
        });

        button_No8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                displayed_Text.append(No8);
            }
        });

        button_No9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                displayed_Text.append(No9);
            }
        });
        button_plus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = displayed_Text.getText().toString();
                calculation1 = Integer.valueOf(value1);
                displayed_Text.setText(plus);


            }
        });
        button_minus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) { displayed_Text.append(minus);

            }
        });
        button_times.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) { displayed_Text.append(times);

            }
        });
        button_divide.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {displayed_Text.append(divide);

            }
        });
        button_point.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {displayed_Text.append(point);

            }
        });
        button_cancel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {displayed_Text.setText(cancel);

            }
        });

        button_equal_to.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(displayed_Text.getText().toString().contains("+")){
                    value2 = displayed_Text.getText().toString().replace("+","");
                    calculation2 = Integer.valueOf(value2);
                    equal_to = calculation1 + calculation2;
                    displayed_Text.setText(Integer.toString(equal_to));

                }

            }
        });

    }
}