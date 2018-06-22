package com.f20171574.kia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class langsco extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_langsco);
        int i = getIntent().getExtras().getInt("Answers");
        TextView tv = (TextView)findViewById(R.id.textView21);
        tv.setText(Integer.toString(i));
    }
    public void answers(View view)
    {
        Intent i=new Intent(this,langans.class);
        startActivity(i);
    }
}
