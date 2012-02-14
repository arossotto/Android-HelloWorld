package com.dec.exp.android.hello;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.dec.exp.android.hello.ws.HelloWsHandler;

public class TestHelloAndroidActivity {

	@Test
	public void chiamaHello() {
		assertEquals("pippo hello!", new HelloWsHandler("localhost").callHello("pippo"));
	}

	@Test
	public void chiamaExec() {
		assertTrue(new HelloWsHandler("localhost").callExec("ls").length()>0);
	}
}
