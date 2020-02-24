package com.tml.IRN;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonFormat;

public class nic_response_plaintextObj {
	
	@XmlElement(name="SignedQRCode")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<SignedQRCodeObj> SignedQRCode ;
	
	@XmlElement(name="SignedInvoice")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<SignedInvoiceObj> SignedInvoice ;

}
