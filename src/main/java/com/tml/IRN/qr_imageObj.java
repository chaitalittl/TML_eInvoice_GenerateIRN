package com.tml.IRN;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonFormat;

@XmlType(name = "qr_imageObj") 

@XmlRootElement(name = "qr_imageObj")

public class qr_imageObj {
	
	@XmlElement(name="data")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<qrimagedataObj> data ;

	String iss;

	public String getIss() {
		return iss;
	}

	public void setIss(String iss) {
		this.iss = iss;
	}
}
