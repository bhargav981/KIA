package com.f20171574.kia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Main3Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void math(View view)
    {
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
    }
    public void sports(View view)
    {
        Intent i=new Intent(this,sports.class);
        startActivity(i);
    }
    public void science(View view)
    {
        Intent i=new Intent(this,science.class);
        startActivity(i);
    }
    public void lang(View view)
    {
        Intent i=new Intent(this,lang.class);
        startActivity(i);
    }
    public void misc(View view)
    {
        Intent i=new Intent(this,misc.class);
        startActivity(i);
    }
    public void logout(View view)
    {
        finish();
    }

}
