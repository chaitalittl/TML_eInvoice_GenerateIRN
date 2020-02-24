package com.tml.IRN;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonFormat;

public class validation_remarksObj {
	
	@XmlElement(name="master_lookup")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected ArrayList<master_lookupObj> master_lookup ;
	
	@XmlElement(name="irn_schema")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected ArrayList<irn_schemaObj> irn_schema ;
	
	@XmlElement(name="ewb_schema")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected ArrayList<ewb_schemaObj> ewb_schema ;
	
	@XmlElement(name="common_schema")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected ArrayList<common_schemaObj> common_schema ;

}
