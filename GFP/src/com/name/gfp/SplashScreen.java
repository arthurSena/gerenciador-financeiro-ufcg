package com.name.gfp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity implements Runnable {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);


		Handler h = new Handler();
		h.postDelayed(this, 3000);
	}

	public void run() {
		startActivity(new Intent(this, GFPActivity.class));
		finish();
	}
}