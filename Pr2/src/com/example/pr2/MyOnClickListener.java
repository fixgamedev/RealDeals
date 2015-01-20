package com.example.pr2;

import android.view.View;
import android.view.View.OnClickListener;

public class MyOnClickListener implements OnClickListener {

	MainActivity caller;
	
	public MyOnClickListener(MainActivity activity){
	
		this.caller = activity;
		
	}
	
	@Override
	public void onClick(View v) {
		caller.textView.setText("You clicked the button");
		// TODO Auto-generated method stub

	}

}
