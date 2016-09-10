package ru.sohohome.firstapp;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends Activity {

    private TextView label1;
    private Button buttonTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        label1 = (TextView)findViewById(R.id.labelMain);
        buttonTwo = (Button)findViewById(R.id.btTwo);

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label1.setText(R.string.msg_two);
            }
        });
    }

    public void btOneClick(View v){
        /*
        В layout об-ляем метод android:onClick="btOneClick"
        */
        label1.setText(R.string.msg_one);
    }

    public void btAboutClick(View v){
        Intent i = new Intent(this, AboutActivity.class);
        startActivity(i);
    }
}
