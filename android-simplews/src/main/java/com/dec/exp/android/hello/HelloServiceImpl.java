package com.dec.exp.android.hello;

import javax.jws.WebService;

@WebService(endpointInterface = "com.dec.exp.android.hello.HelloService")
public class HelloServiceImpl implements HelloService{

	@Override
	public String Hello(String hello) {
		return hello+" hello!";
	}

}
