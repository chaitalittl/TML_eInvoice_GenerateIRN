package com.tml.IRN;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonFormat;

@XmlType(name = "SignedQRCodeObj") 

@XmlRootElement(name = "SignedQRCodeObj")

public class SignedQRCodeObj {
	
	@XmlElement(name="data")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<SignedQRCodedataRespObj> data ;

}
