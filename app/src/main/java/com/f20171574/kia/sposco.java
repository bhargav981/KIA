package com.f20171574.kia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class sposco extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sposco);
        int i = getIntent().getExtras().getInt("Answers");
        TextView tv = (TextView)findViewById(R.id.textView13);
        tv.setText(Integer.toString(i));
    }

    public void answers(View view)
    {
        Intent i=new Intent(this,spoans.class);
        startActivity(i);
    }
}
