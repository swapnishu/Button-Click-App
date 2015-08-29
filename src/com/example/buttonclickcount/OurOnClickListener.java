package com.example.buttonclickcount;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

public class OurOnClickListener implements OnClickListener {
	
	MainActivity caller;
	public OurOnClickListener(MainActivity mainActivity) {
		// TODO Auto-generated constructor stub
		this.caller = mainActivity;
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		caller.theTextView.setText("The button got clicked");
	}

}
