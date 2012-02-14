package com.dec.exp.android.hello;

import org.junit.Test;

import com.dec.exp.android.hello.ws.HelloWsHandler;

public class TestHelloAndroidActivity {

	@Test
	public void chiama() {
		System.out.println(new HelloWsHandler().call("pippo"));
	}
}
