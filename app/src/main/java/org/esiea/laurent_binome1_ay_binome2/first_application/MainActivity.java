package org.esiea.laurent_binome1_ay_binome2.first_application;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.text.format.DateUtils;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_hw= (TextView)findViewById(R.id.tv_hello_world);
        Button btn_hw= (Button)findViewById(R.id.btn_hello_world);
        tv_hw.setText(R.string.yahoo);
        String now= DateUtils.formatDateTime(getApplicationContext(),(new Date()).getTime(), java.text.DateFormat.FULL);
        TextView date_hw=(TextView)findViewById(R.id.new_date);
        date_hw.setText(now);






        btn_hw.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView changeMe = (TextView)findViewById(R.id.btn_hello_world);
                changeMe.setText("Yes");

            }
        }
        );

        btn_hw.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v) {
                        TextView longPush = (TextView)findViewById(R.id.btn_hello_world);
                        longPush.setText("Pushing");
                        Toast.makeText(getApplicationContext(),"Champions League!!",Toast.LENGTH_LONG).show();
                        return true;
                    }
                }
        );
// pour timePickerDialog https://neurobin.org/docs/android/android-date-picker-example/


    }
}
