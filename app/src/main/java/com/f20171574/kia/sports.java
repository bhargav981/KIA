package com.f20171574.kia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class sports extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
    }

    int i=0;

    public void fun1(RadioButton v)
    {
        if(v.isChecked())
            i=1;
    }

    public void fun2(RadioButton v)
    {
        if(v.isChecked())
            i=i+1;
    }

    public void fun3(RadioButton v)
    {
        if(v.isChecked())
            i=i+1;
    }

    public void fun4(RadioButton v)
    {
        if(v.isChecked())
            i=i+1;
    }

    public void fun5(RadioButton v)
    {
        if(v.isChecked())
            i=i+1;
    }

    int j=0;

    public void submit(View view)
    {
        fun1((RadioButton)findViewById(R.id.ans1));
        fun2((RadioButton)findViewById(R.id.ans2));
        fun3((RadioButton)findViewById(R.id.ans3));
        fun4((RadioButton)findViewById(R.id.ans4));
        fun5((RadioButton)findViewById(R.id.ans5));


        Intent i1=new Intent(this,sposco.class);
        i1.putExtra("Answers",i);
        startActivity(i1);
    }
}
