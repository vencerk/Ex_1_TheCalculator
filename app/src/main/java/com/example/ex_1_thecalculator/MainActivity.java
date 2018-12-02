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
    String s="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if(this.getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //final TextView tv=(TextView) findViewById(R.id.t1);
            show1 =  findViewById(R.id.text1);
            show2 =  findViewById(R.id.text2);


            Button butEqual = findViewById(R.id.buttonEqual);
            butEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    s=show2.getText().toString();
                    if("".equals(s)){
                        Toast.makeText(MainActivity.this,"Input Error!",Toast.LENGTH_SHORT).show();
                    }
                    else{
                    //show1.setText(s);
                    s+="=";
                    show1.setText(s);
                    double r=calculate(s);
                    //double r=9.9;
                    //r+=1000;
                    String ru = "" + r ;
                    show2.setText(ru);
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
            //final TextView tv=(TextView) findViewById(R.id.t1);
            show1 =  findViewById(R.id.text1);
            show2 =  findViewById(R.id.text2);


            Button butEqual = findViewById(R.id.buttonEqual);
            butEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    s=show2.getText().toString();
                    //show1.setText(s);
                    s+="=";
                    show1.setText(s);
                    double r=calculate(s);
                    //double r=9.9;
                    //r+=1000;
                    String ru = "" + r ;
                    show2.setText(ru);
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

            Button butx2 = findViewById(R.id.buttonx2);
            butx2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    s=show2.getText().toString();
                    show1.setText(s+"^2=");

                    double r=Double.parseDouble(s);
                    r *= r;

                    String ru = "" + r ;
                    show2.setText(ru);

                }
            });

            Button butln = findViewById(R.id.buttonln);
            butln.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    s=show2.getText().toString();
                    show1.setText("ln "+ s+ "=");

                    double r=Double.parseDouble(s);
                    r = Math.log(r);

                    String ru = "" + r ;
                    show2.setText(ru);

                }
            });

            Button butsin = findViewById(R.id.buttonsin);
            butsin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    s=show2.getText().toString();
                    show1.setText("sin "+ s+ "=");

                    double r=Double.parseDouble(s);
                    r = Math.sin(r);

                    String ru = "" + r ;
                    show2.setText(ru);

                }
            });
            Button butcos = findViewById(R.id.buttoncos);
            butcos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    s=show2.getText().toString();
                    show1.setText("cos "+ s+ "=");

                    double r=Double.parseDouble(s);
                    r = Math.cos(r);

                    String ru = "" + r ;
                    show2.setText(ru);

                }
            });
            Button buttan = findViewById(R.id.buttontan);
            buttan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    s=show2.getText().toString();
                    show1.setText("tan "+ s+ "=");

                    double r=Double.parseDouble(s);
                    r = Math.tan(r);

                    String ru = "" + r ;
                    show2.setText(ru);

                }
            });

            Button butPai = findViewById(R.id.buttonPai);
            butPai.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    s=show2.getText().toString();
                    show2.setText(s + "3.14159");
                }
            });

            Button butE = findViewById(R.id.buttonE);
            butE.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    s=show2.getText().toString();
                    show2.setText(s + "2.718");
                }
            });
            Button butHex = findViewById(R.id.buttonHex);
            butHex.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    s=show2.getText().toString();
                    show1.setText("HEX("+ s+ ")=");

                    int r=Integer.valueOf(s).intValue();;

                    show2.setText(Integer.toHexString(r));

                }
            });
            Button butOct = findViewById(R.id.buttonOct);
            butOct.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    s=show2.getText().toString();
                    show1.setText("OCT("+ s+ ")=");

                    int r=Integer.valueOf(s).intValue();;

                    show2.setText(Integer.toOctalString(r));

                }
            });
            Button butBin = findViewById(R.id.buttonBin);
            butBin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    s=show2.getText().toString();
                    show1.setText("BIN("+ s+ ")=");

                    int r=Integer.valueOf(s).intValue();;

                    show2.setText(Integer.toBinaryString(r));

                }
            });


        }
    }

    public double calculate(String formula){

        char CurrentOperator;
        int ct=0;
        double x = 0, y= 0 , decimal = 0, number = 0;
        String dp ="";
        Optr.push('#');
        char c=formula.charAt(ct++);
        while (c != '=') {
            /*
            switch (c) {
                case 'P':
                    ct++;
                    c=formula.charAt(ct++);
                    //Opnd.push(Math.PI);
                    Opnd.push(3.14159);
                    break;
                case 'e':
                    c=formula.charAt(ct++);
                    //Opnd.push(Math.E);
                    Opnd.push(2.718);
                    break;
            }
            */
            if (c != '+' && c != '-' && c != '*' && c != '/' && c != '(' && c != ')' && c != '=') {
                while (c == '.' || (c >= '0' && c <= '9')) {
                    dp += c;
                    c=formula.charAt(ct++);
                }
                number = Double.parseDouble(dp);
                dp="";
                Opnd.push(number);
            }

            else {
                switch (Judge(Optr.peek(), c)) {
                    case -1:
                        Optr.push(c);
                        c = formula.charAt(ct++);
                        break;
                    case 0:
                        Optr.pop();
                        c = formula.charAt(ct++);
                        break;
                    case 1:
                        CurrentOperator = Optr.pop();
                        y = Opnd.pop();
                        x = Opnd.pop();

                        Opnd.push( Operate(x, y, CurrentOperator) );
                        break;
                }
            }

        }
        CurrentOperator = Optr.pop();
        y = Opnd.pop();
        x = Opnd.pop();

        Opnd.push( Operate(x, y, CurrentOperator) );
        double result=Opnd.peek();
        Opnd.clear();
        Optr.clear();

        return result;
    }

    int Judge(char a,char b){
        int c = 0;
        switch(a){
            case '+':
                if(b=='*'||b=='/'||b=='(')
                    c=-1;
                else
                    c=1;
                break;
            case '-':
                if(b=='*'||b=='/'||b=='(')
                    c=-1;
                else
                    c=1;
                break;
            case '*':
                if(b=='(')
                    c=-1;
                else
                    c=1;
                break;
            case '/':
                if(b=='(')
                    c=-1;
                else
                    c=1;
                break;
            case '(':
                if(b==')')
                    c=0;
                else
                    c=-1;
                break;
            case ')':
                c=1;
                break;
            case '#':
                if(b=='#')
                    c=0;
                else
                    c=-1;
                break;
        }
        return c;
    }

    double Operate(double x,double y,char c){
        double z = 0;
        switch(c){
            case '+':
                z=x+y;
                break;
            case '-':
                z=x-y;
                break;
            case '*':
                z=x*y;
                break;
            case '/':
                z=x/y;
                break;
        }
        return z;
    }

}


