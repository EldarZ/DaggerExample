package com.eldarz.daggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.eldarz.additionallib.SomeClass;
import com.eldarz.additionallib.SomeClassImpl;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView)findViewById(R.id.some_text);
        SomeClass someClass = new SomeClassImpl();
        mTextView.setText(someClass.getMessage());
    }
}
