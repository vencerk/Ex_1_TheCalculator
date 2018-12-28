package com.example.ex_1_thecalculator;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    //堆栈的设置
    Stack<Double> Opnd = new Stack<Double>();//数栈
    Stack<Character> Optr = new Stack<Character>();//符号栈
    TextView show1, show2;
    String s = "";//总的计算表达式

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //横竖屏判断
        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {//竖屏
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //final TextView tv=(TextView) findViewById(R.id.t1);
            show1 = findViewById(R.id.text1);
            show2 = findViewById(R.id.text2);
            Button butEqual = findViewById(R.id.buttonEqual);//等于号
            butEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    s = show2.getText().toString();//获取总运算表达式
                    if ("".equals(s)) {//空则提示错误
                        Toast.makeText(MainActivity.this, "Input Error!", Toast.LENGTH_SHORT).show();
                    } else {//否则开始运算，其实应该再检查运算表达式是否合法
                        //show1.setText(s);
                        s += "=";
                        show1.setText(s);
                        double r = calculate(s);//开始计算
                        String ru = "" + r;//将double转换为字符串
                        show2.setText(ru);//显示结果
                    }
                }
            });

            Button butClear = findViewById(R.id.buttonClear);//清空
            butClear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show1.setText("");
                    show2.setText("");
                }
            });

            Button butDelete = findViewById(R.id.buttonDelete);//删除
            butDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String s1 = show2.getText().toString();
                    s1 = s1.substring(0, s1.length() - 1);
                    show2.setText(s1);
                }
            });

            Button butMinus = findViewById(R.id.buttonMinus);//减法
            butMinus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append("-");
                }
            });

            Button butPlus = findViewById(R.id.buttonPlus);//加法
            butPlus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append("+");
                }
            });
            Button butMul = findViewById(R.id.buttonMul);//乘法
            butMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append("*");
                }
            });

            Button butDiv = findViewById(R.id.buttonDiv);//除法
            butDiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append("/");
                }
            });

            Button butPoint = findViewById(R.id.buttonPoint);//小数点
            butPoint.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append(".");
                }
            });
            Button butLeft = findViewById(R.id.buttonLeft);//左括号
            butLeft.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append("(");
                }
            });
            Button butRight = findViewById(R.id.buttonRight);//右括号
            butRight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show2.append(")");
                }
            });
            //数字0-9
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


        } else if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {//横屏
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //final TextView tv=(TextView) findViewById(R.id.t1);
            show1 = findViewById(R.id.text1);
            show2 = findViewById(R.id.text2);

            //类似的我就不注释了，注释竖屏没有的
            Button butEqual = findViewById(R.id.buttonEqual);
            butEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    s = show2.getText().toString();
                    s += "=";
                    show1.setText(s);
                    double r = calculate(s);
                    String ru = "" + r;
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
                    String s1 = show2.getText().toString();
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

            Button butx2 = findViewById(R.id.buttonx2);//平方
            butx2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    s = show2.getText().toString();
                    show1.setText(s + "^2=");

                    double r = Double.parseDouble(s);
                    r *= r;

                    String ru = "" + r;
                    show2.setText(ru);

                }
            });

            Button butln = findViewById(R.id.buttonln);//ln函数
            butln.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    s = show2.getText().toString();
                    show1.setText("ln " + s + "=");

                    double r = Double.parseDouble(s);
                    r = Math.log(r);

                    String ru = "" + r;
                    show2.setText(ru);

                }
            });

            Button butsin = findViewById(R.id.buttonsin);//sin函数
            butsin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    s = show2.getText().toString();
                    show1.setText("sin " + s + "=");

                    double r = Double.parseDouble(s);
                    r = Math.sin(r);

                    String ru = "" + r;
                    show2.setText(ru);

                }
            });
            Button butcos = findViewById(R.id.buttoncos);//cos函数
            butcos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    s = show2.getText().toString();
                    show1.setText("cos " + s + "=");

                    double r = Double.parseDouble(s);
                    r = Math.cos(r);

                    String ru = "" + r;
                    show2.setText(ru);

                }
            });
            Button buttan = findViewById(R.id.buttontan);//tan函数
            buttan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    s = show2.getText().toString();
                    show1.setText("tan " + s + "=");

                    double r = Double.parseDouble(s);
                    r = Math.tan(r);

                    String ru = "" + r;
                    show2.setText(ru);

                }
            });

            Button butPai = findViewById(R.id.buttonPai);//π
            butPai.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    s = show2.getText().toString();
                    show2.setText(s + "3.14159");
                }
            });

            Button butE = findViewById(R.id.buttonE);//es
            butE.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    s = show2.getText().toString();
                    show2.setText(s + "2.718");
                }
            });
            Button butHex = findViewById(R.id.buttonHex);//十六进制
            butHex.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    s = show2.getText().toString();
                    show1.setText("HEX(" + s + ")=");
                    int r = Integer.valueOf(s).intValue();
                    show2.setText(Integer.toHexString(r));

                }
            });
            Button butOct = findViewById(R.id.buttonOct);//八进制
            butOct.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    s = show2.getText().toString();
                    show1.setText("OCT(" + s + ")=");
                    int r = Integer.valueOf(s).intValue();
                    show2.setText(Integer.toOctalString(r));
                }
            });
            Button butBin = findViewById(R.id.buttonBin);//二进制
            butBin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    s = show2.getText().toString();
                    show1.setText("BIN(" + s + ")=");
                    int r = Integer.valueOf(s).intValue();
                    show2.setText(Integer.toBinaryString(r));
                }
            });
        }
    }

    //计算函数
    public double calculate(String formula) {

        char CurrentOperator;
        int ct = 0;
        double x = 0, y = 0,number = 0;
        String dp = "";
        Optr.push('#');
        char c = formula.charAt(ct++);//从运算表达式读入一个字符
        while (c != '=') {//如果不是等于号
            //如果当前字符不是操作运算符，即是数字
            if (c != '+' && c != '-' && c != '*' && c != '/' && c != '(' && c != ')' && c != '=') {
                while (c == '.' || (c >= '0' && c <= '9')) {//如果是数字或者小数点，那么一直读取，并存取到dp里面
                    dp += c;
                    c = formula.charAt(ct++);
                }
                number = Double.parseDouble(dp);//将dp转化为double类型
                dp = "";
                Opnd.push(number);//将该数入栈
            } else {
                //如果是操作运算符，那么判断优先级后进行操作，
                //当前运算符优先级级小于上一个运算符优先级，将当前运算符入栈
                //当前运算符优先级级等于上一个运算符优先级，即（）那么直接删除）
                //当前运算符优先级级大于上一个运算符优先级，取得数栈的前两个数，并与当前运算符进行运算，后将结果入数栈
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
                        Opnd.push(Operate(x, y, CurrentOperator));
                        break;
                }
            }
        }
        //如果是=，那么会直接退出，所以还需要进行一次运算，才能得出最后结果
        CurrentOperator = Optr.pop();
        y = Opnd.pop();
        x = Opnd.pop();
        Opnd.push(Operate(x, y, CurrentOperator));
        double result = Opnd.peek();
        Opnd.clear();
        Optr.clear();
        return result;
    }
    //判断优先级
    private int Judge(char a, char b) {
        int c = 0;
        switch (a) {
            case '+':
                if (b == '*' || b == '/' || b == '(')
                    c = -1;
                else
                    c = 1;
                break;
            case '-':
                if (b == '*' || b == '/' || b == '(')
                    c = -1;
                else
                    c = 1;
                break;
            case '*':
                if (b == '(')
                    c = -1;
                else
                    c = 1;
                break;
            case '/':
                if (b == '(')
                    c = -1;
                else
                    c = 1;
                break;
            case '(':
                if (b == ')')
                    c = 0;
                else
                    c = -1;
                break;
            case ')':
                c = 1;
                break;
            case '#':
                if (b == '#')
                    c = 0;
                else
                    c = -1;
                break;
        }
        return c;
    }
    //根据运算符进行运算
    private double Operate(double x, double y, char c) {
        double z = 0;
        switch (c) {
            case '+':
                z = x + y;
                break;
            case '-':
                z = x - y;
                break;
            case '*':
                z = x * y;
                break;
            case '/':
                z = x / y;
                break;
        }
        return z;
    }
}