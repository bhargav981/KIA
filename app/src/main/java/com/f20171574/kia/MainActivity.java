package com.f20171574.kia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view)
    {
        EditText t1=(EditText) findViewById(R.id.editText3);
        EditText t2=(EditText) findViewById(R.id.editText2);
        Log.d("email",t1.getText().toString());
        Log.d("password",t2.getText().toString());
        if (t1.getText().toString().equals("bhargav20969@gmail.com")&&t2.getText().toString().equals("20969"))
        {
            Toast.makeText(getApplicationContext(),"succesfully logged in",Toast.LENGTH_SHORT).show();
            {
                Intent i = new Intent(this,Main3Activity.class);
                startActivity(i);
            }
        }
        else if (t1.getText().toString().equals("")&&t2.getText().toString().equals(""))
        {
            Toast.makeText(getApplicationContext(),"please enter something",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Email Id or Password is Incorrect ",Toast.LENGTH_SHORT).show();
        }

    }


}
