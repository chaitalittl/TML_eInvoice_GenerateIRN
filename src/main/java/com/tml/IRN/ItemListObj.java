package com.tml.IRN;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ItemListObj {
	
	@XmlElement(name="element")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<elementObj> element ;
	


	

}
