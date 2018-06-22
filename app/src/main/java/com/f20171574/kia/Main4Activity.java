package com.f20171574.kia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        int i = getIntent().getExtras().getInt("answers");
        TextView tv = (TextView)findViewById(R.id.textView16);
        tv.setText(Integer.toString(i));
    }
   public void answers(View view)
   {
        Intent i=new Intent(this,mathans.class);
        startActivity(i);
   }


}

