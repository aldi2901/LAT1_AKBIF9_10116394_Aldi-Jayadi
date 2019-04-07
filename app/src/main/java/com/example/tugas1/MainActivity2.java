package com.example.tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv_nama1 = (TextView) findViewById(R.id.tv2);
        TextView tv_nama2 = (TextView) findViewById(R.id.tv4);
        if(getIntent().getExtras() != null) {
            tv_nama1.setText(getIntent().getStringExtra("text"));
            tv_nama2.setText(getIntent().getStringExtra("text"));
        }
    }
}
