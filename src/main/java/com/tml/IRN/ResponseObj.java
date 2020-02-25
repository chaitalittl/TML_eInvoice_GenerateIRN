package com.tml.IRN;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonFormat;
@XmlType(name = "ResponseObj") 

@XmlRootElement(name = "ResponseObj")
public class ResponseObj {
	
	
	@XmlElement(name="pwcresponse")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<pwcRespDataObj> pwcresponse ;
	
	@XmlElement(name="irp_response")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<irpRespDataObj> irp_response ;

}
