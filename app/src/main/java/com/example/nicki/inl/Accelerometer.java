package com.example.nicki.inl;

import android.content.DialogInterface;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Accelerometer extends AppCompatActivity implements SensorEventListener {
    TextView x;
    TextView y;
    TextView z;
    TextView dir;
    TextView dir2;
    private SensorManager mSensorManager;
    Sensor mAccelerometer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer);
        x = (TextView) findViewById(R.id.textView4);
        y = (TextView) findViewById(R.id.textView5);
        z = (TextView) findViewById(R.id.textView6);
        dir = (TextView) findViewById(R.id.textView7);
        dir2 = (TextView) findViewById(R.id.textView8);
        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_UI);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
            x.setText(Float.toString(event.values[0]));
            y.setText(Float.toString(event.values[1]));
            z.setText(Float.toString(event.values[2]));

            if(event.values[0]>0){
                dir.setText("Vänster");
            }
            else{
                dir.setText("Höger");
            }
            if(event.values[1]<0){
                dir2.setText("Framåt");

            }
            else{dir2.setText("Bakåt");}

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }

    }
