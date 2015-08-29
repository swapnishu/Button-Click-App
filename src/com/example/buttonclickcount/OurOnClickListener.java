package com.example.buttonclickcount;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

public class OurOnClickListener implements OnClickListener {
	
	MainActivity caller;
	private int count;
	public OurOnClickListener(MainActivity mainActivity) {
		// TODO Auto-generated constructor stub
		this.caller = mainActivity;
		this.count = 0;
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		count = count + 1;
		String outputString = "The button itself has been clicked " + count + " time";
		if(count != 1)
			outputString += "s";
		caller.theTextView.setText(outputString);
	}

}
