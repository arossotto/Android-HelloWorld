package com.dec.exp.android.hello.ws;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

public class HelloWsHandler {

	private final String ip;

	public HelloWsHandler(String ip) {
		this.ip = ip;
	}

	public String callHello(String string) {
		return call("Hello", string);
	}

	public String callExec(String string) {
		return call("exec", string);
	}

	private String call(String method, String parameter) {
		SoapObject request = new SoapObject("http://hello.android.exp.dec.com/", method);
		request.addProperty("arg0", parameter);
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(request);
		HttpTransportSE androidHttpTransport = new HttpTransportSE("http://" + ip + ":8082/Hello");
		// androidHttpTransport.debug = true;
		try {
			androidHttpTransport.call("http://" + ip + ":8082/Hello", envelope);
			// System.out.println(androidHttpTransport.requestDump);

			SoapPrimitive response = (SoapPrimitive) envelope.getResponse();

			return response.toString();
		} catch (Exception e) {
			return e.getMessage();
		}
	}
}
