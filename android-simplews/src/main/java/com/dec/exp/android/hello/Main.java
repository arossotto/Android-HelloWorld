package com.dec.exp.android.hello;

import javax.xml.ws.Endpoint;

public class Main {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8082/Hello", new HelloServiceImpl());
	}

}
