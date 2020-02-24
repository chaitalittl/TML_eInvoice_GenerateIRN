package com.tml.IRN;

import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.bind.annotation.XmlType;

import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.ArrayList;
import java.util.List;

import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlType(name = "IRNOutput")

@XmlRootElement(name = "IRNOutput")

public class IRNOutput {
	
	
	
		@XmlElement(name="response")
		@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
		protected List<ResponseObj> response ;

		

}
