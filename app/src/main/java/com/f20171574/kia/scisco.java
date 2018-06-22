package com.f20171574.kia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class scisco extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scisco);
        int i = getIntent().getExtras().getInt("Answers");
        TextView tv = (TextView)findViewById(R.id.textView19);
        tv.setText(Integer.toString(i));
    }

    public void answers(View view)
    {
        Intent i=new Intent(this,scians.class);
        startActivity(i);
    }

}
