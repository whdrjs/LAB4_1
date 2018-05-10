package com.example.lab4_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyDrawEx draw= new MyDrawEx(this);  //call MyDrawEx
        setContentView(draw);

    }
}
