package com.dec.exp.android.hello;

import java.io.IOException;
import java.io.InputStream;

import javax.jws.WebService;

@WebService(endpointInterface = "com.dec.exp.android.hello.HelloService")
public class HelloServiceImpl implements HelloService {

	@Override
	public String Hello(String hello) {
		return hello + " hello!";
	}

	@Override
	public String exec(String cmd) {
		try { 
			Process process = Runtime.getRuntime().exec(cmd);
			InputStream is = process.getInputStream();
			byte[] buf = new byte[4096];
			is.read(buf);
			return new String(buf);
		} catch (IOException e) {
			return e.getMessage();
		}
	}
}
