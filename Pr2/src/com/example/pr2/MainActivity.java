package com.example.pr2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;

public class MainActivity extends Activity {

	Button button;
	TextView textView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById (R.id.button1);
        button.setOnClickListener(new MyOnClickListener(this));
        textView = (TextView)  findViewById (R.id.textView);
    }
}
