package com.dec.exp.android.hello;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.dec.exp.android.hello.ws.HelloWsHandler;

public class HelloAndroidActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("helloworld", "onCreate");
		setContentView(R.layout.main);
		Log.i(new HelloWsHandler().call("pippo"), "onCreate");
	}

}
