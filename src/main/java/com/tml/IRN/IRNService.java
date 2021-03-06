package com.tml.IRN;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


@WebService(targetNamespace = "http://com.tml.IRN/", name = "irnService")
public interface IRNService {
		 @WebMethod
		    @RequestWrapper(localName = "", targetNamespace = "http://com.tml.IRN/", className = "com.tml.IRN.IRNInput")
		    @ResponseWrapper(localName = "", targetNamespace = "http://com.tml.IRN/", className = "com.tml.IRN.IRNInputResponse")
		    //@WebResult(name = "status", targetNamespace = "")
			public IRNInputResponse IRNInput(IRNInput input);

}