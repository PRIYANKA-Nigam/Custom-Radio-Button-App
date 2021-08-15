package com.example.customradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import worker8.com.github.radiogroupplus.RadioGroupPlus;

public class MainActivity extends AppCompatActivity {
RadioGroupPlus radioGroupPlus; Button b1,b2; @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroupPlus=findViewById(R.id.radio);
        b1=findViewById(R.id.but); b2=findViewById(R.id.but2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioGroupPlus.clearCheck();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() { @Override
            public void onClick(View v) { int id=radioGroupPlus.getCheckedRadioButtonId();
                switch (id){
                    case R.id.r1:
                        String s="One";  displayToast(s);break;
                    case R.id.r2:
                        String s1="Two"; displayToast(s1);break;
                    case R.id.r3:
                        String s2="Three"; displayToast(s2);break;
                    case R.id.r4:
                        String s3="Four";  displayToast(s3);break;
                    case R.id.r5:
                        String s4="Five";  displayToast(s4);break;
                    case R.id.r6:
                        String s5="Six";   displayToast(s5);break; } }});
radioGroupPlus.setOnCheckedChangeListener(new RadioGroupPlus.OnCheckedChangeListener() { @Override
    public void onCheckedChanged(RadioGroupPlus group, int checkedId) {
        displayToast("Selected ID" + checkedId); }}); }
    private void displayToast(String s){
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show(); }}