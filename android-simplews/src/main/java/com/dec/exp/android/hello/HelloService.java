package com.dec.exp.android.hello;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloService {
	@WebMethod
	public String Hello(String hello);
	
	@WebMethod
	public String exec(String cmd);
}
