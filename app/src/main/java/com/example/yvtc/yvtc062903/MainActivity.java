package com.example.yvtc.yvtc062903;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v)
    {
        Toast.makeText(MainActivity.this, "test click1", Toast.LENGTH_LONG).show();
    }
    public void click2(View v)
    {
        Log.d("CLI", "This is click2");
    }
}
