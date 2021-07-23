package com.soapgu.app.reboot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.findViewById(R.id.button_broadcast).setOnClickListener( v-> RebootFns.rebootByBroadcast(this));
        this.findViewById(R.id.button_shell).setOnClickListener( v-> RebootFns.rebootByShell() );
    }
}