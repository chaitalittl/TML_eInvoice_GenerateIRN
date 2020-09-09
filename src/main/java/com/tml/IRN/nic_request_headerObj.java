package com.tml.IRN;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonFormat;

@XmlType(name = "nic_request_headerObj") 

@XmlRootElement(name = "nic_request_headerObj")

public class nic_request_headerObj {
	


	@XmlElement(name="X-Asp-Auth-Token")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected ArrayList<Object> XAspAuthToken ;
	
	

	@XmlElement(name="AuthToken")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected ArrayList<AuthTokenObj> AuthToken ;
	
	@XmlElement(name="Gstin")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected ArrayList<GstinObj> Gstin ;
	
	@XmlElement(name="X-Asp-Auth-Signature")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected ArrayList<XAspAuthSignatureObj> XAspAuthSignature ;
	
	@XmlElement(name="user_name")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected ArrayList<user_nameObj> user_name ;
	
	@XmlElement(name="Content-Type")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected ArrayList<Content_TypeObj> Content_Type ;
	
	

}
