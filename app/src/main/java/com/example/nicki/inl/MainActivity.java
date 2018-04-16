package com.example.nicki.inl;

import android.content.Intent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startCompass(View view) {
        Intent intent = new Intent(this, Compass.class);
        startActivity(intent);
    }
    public void startAcc(View view){
        Intent intent = new Intent(this,Accelerometer.class);
        startActivity(intent);
    }
}
