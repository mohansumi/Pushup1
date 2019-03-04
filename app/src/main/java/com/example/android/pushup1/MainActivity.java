package com.example.android.pushup1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void testUpload(){
        Toast.makeText(this, "This is test", Toast.LENGTH_SHORT).show();

        int i = 0;
        i = i + 1;
        Toast.makeText(this, "Number: ", Toast.LENGTH_SHORT).show();
    }
}
