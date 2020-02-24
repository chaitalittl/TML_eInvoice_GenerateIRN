package com.tml.IRN;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonFormat;


@XmlType(name = "irpRespDataObj") 

@XmlRootElement(name = "irpRespDataObj")

public class irpRespDataObj {

	String error;
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	String message;
	
	@XmlElement(name="data")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<dataRespObj> data ;
}
