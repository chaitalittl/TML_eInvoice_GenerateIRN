package com.tml.IRN;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name="IRNInput")
public class IRNInput {
	
	@XmlElement(name="request")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    protected List<RequestObj> request ;	
}
