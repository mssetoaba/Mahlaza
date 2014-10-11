package com.davidgassner.plainolnotes;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.syd);
			
		
	}
	public void Cal(View v)
	{
		Intent in = new Intent(Main.this, MainActivity.class);
		startActivity(in);
	}
}
