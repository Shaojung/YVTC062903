package com.example.yvtc.yvtc062903;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout = (LinearLayout) findViewById(R.id.layout1);
        Button btn3 = new Button(MainActivity.this);
        btn3.setText("Button3");
        layout.addView(btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is button3", Toast.LENGTH_LONG).show();
                Button btn = (Button) findViewById(R.id.button);
                btn.setVisibility(View.GONE);
            }
        });

        ToggleButton tb = (ToggleButton) findViewById(R.id.toggleButton);
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "現在開關狀態是:" + isChecked, Toast.LENGTH_LONG).show();
            }
        });
    }

    public void click1(View v)
    {
        Toast.makeText(MainActivity.this, "test click1", Toast.LENGTH_LONG).show();
    }
    public void click2(View v)
    {
        Log.d("CLI", "This is click2");
        Button btn = (Button) findViewById(R.id.button);
        if (btn.getVisibility() == View.VISIBLE)
            btn.setVisibility(View.INVISIBLE);
        else
            btn.setVisibility(View.VISIBLE);
    }
}
