package com.moheeeetgupta.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        editText =findViewById (R.id.editText);
        textView1=findViewById (R.id.textView1);
        textView2=findViewById (R.id.textView2);
        textView3=findViewById (R.id.textView3);
        textView4=findViewById (R.id.textView4);
        textView5=findViewById (R.id.textView5);
        textView6=findViewById (R.id.textView6);
        textView7=findViewById (R.id.textView7);
        textView8=findViewById (R.id.textView8);
        textView9=findViewById (R.id.textView9);
        textView10=findViewById (R.id.textView10);
        button =findViewById (R.id.button);
        button.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String s =editText.getText ().toString ();
                int a=Integer.parseInt (s);
                int b=a*1;
                textView1.setText (a+ " * 1 ="+b);
                b=a*2;
                textView2.setText (a+ " * 2 ="+b);
                b=a*3;
                textView3.setText (a+ " * 3 ="+b);
                b=a*4;
                textView4.setText (a+ " * 4 ="+b);
                b=a*5;
                textView5.setText (a+ " * 5 ="+b);
                b=a*6;
                textView6.setText (a+ " * 6 ="+b);
                b=a*7;
                textView7.setText (a+ " * 7 ="+b);
                b=a*8;
                textView8.setText (a+ " * 8 ="+b);
                b=a*9;
                textView9.setText (a+ " * 9 ="+b);
                b=a*10;
                textView10.setText (a+ " * 10 ="+b);

            }
        });


    }
}
