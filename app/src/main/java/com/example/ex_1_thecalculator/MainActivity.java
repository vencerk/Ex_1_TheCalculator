package com.example.ex_1_thecalculator;


import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if(this.getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //final TextView tv=(TextView) findViewById(R.id.t1);


            Button butDel = findViewById(R.id.buttonDelete);
            butDel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, R.string.success, Toast.LENGTH_SHORT).show();
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
