package com.dec.exp.android.hello.ws;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

public class HelloWsHandler {

	public String call(String string) {
		SoapObject request = new SoapObject("http://hello.android.exp.dec.com/", "Hello");
		request.addProperty("arg0", string);
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(request);
		HttpTransportSE androidHttpTransport = new HttpTransportSE("http://localhost:8082/Hello");
		// androidHttpTransport.debug = true;
		try {
			androidHttpTransport.call("http://localhost:8082/Hello", envelope);
			// System.out.println(androidHttpTransport.requestDump);

			SoapPrimitive response = (SoapPrimitive) envelope.getResponse();

			return response.toString();
		} catch (Exception e) {
			return e.getMessage();
		}
	}
}
