package com.example.ex_1_thecalculator;


import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.widget.TextView;
import java.util.Stack;
import static java.lang.Math.pow;

public class MainActivity extends AppCompatActivity {


    Stack<Double>  Opnd = new Stack<Double>();
    Stack<Character> Optr = new Stack<Character>();
    TextView show1,show2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if(this.getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //final TextView tv=(TextView) findViewById(R.id.t1);
            show1 = (TextView) findViewById(R.id.text1);
            show2 = (TextView) findViewById(R.id.text2);


            Button butEqual = findViewById(R.id.buttonEqual);
            butEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show1.setText(show2.getText().toString());

                    show1.append("=");
                }
            });

            Button butClear = findViewById(R.id.buttonClear);
            butClear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show1.setText("");
                    show2.setText("");
                }
            });


            Button butDelete = findViewById(R.id.buttonDelete);
            butDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String s1=show2.getText().toString();
                    s1 = s1.substring(0, s1.length() - 1);
                    show2.setText(s1);
                }
            });

            Button butMinus = findViewById(R.id.buttonMinus);
            butMinus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append("-");
                }
            });

            Button butPlus = findViewById(R.id.buttonPlus);
            butPlus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append("+");
                }
            });
            Button butMul = findViewById(R.id.buttonMul);
            butMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append("*");
                }
            });

            Button butDiv = findViewById(R.id.buttonDiv);
            butDiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append("/");
                }
            });

            Button butPoint = findViewById(R.id.buttonPoint);
            butPoint.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append(".");
                }
            });
            Button butLeft = findViewById(R.id.buttonLeft);
            butLeft.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append("(");
                }
            });
            Button butRight = findViewById(R.id.buttonRight);
            butRight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append(")");
                }
            });
            Button butZero = findViewById(R.id.buttonZero);
            butZero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append("0");
                }
            });

            Button butOne = findViewById(R.id.buttonOne);
            butOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append("1");
                }
            });

            Button butTwo = findViewById(R.id.buttonTwo);
            butTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append("2");
                }
            });

            Button butThree = findViewById(R.id.buttonThree);
            butThree.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append("3");
                }
            });

            Button butFour = findViewById(R.id.buttonFour);
            butFour.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append("4");
                }
            });

            Button butFive = findViewById(R.id.buttonFive);
            butFive.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append("5");
                }
            });


            Button butSix = findViewById(R.id.buttonSix);
            butSix.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append("6");
                }
            });

            Button butSeven = findViewById(R.id.buttonSeven);
            butSeven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append("7");
                }
            });

            Button butEight = findViewById(R.id.buttonEight);
            butEight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append("8");
                }
            });

            Button butNine = findViewById(R.id.buttonNine);
            butNine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append("9");
                }
            });



        }
        else if(this.getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button but2 = findViewById(R.id.button2);
            but2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "222222", Toast.LENGTH_SHORT).show();
                }
            });




        }
    }
}
