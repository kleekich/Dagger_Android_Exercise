package com.example.dagger_exercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;



import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        @Inject
        NetworkApi networkApi;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            AndroidInjection.inject(this);
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            boolean injected = networkApi == null ? false : true;
            TextView userAvailable = (TextView) findViewById(R.id.target);
            userAvailable.setText("Dependency injection worked: " + String.valueOf(injected));
    }
}
