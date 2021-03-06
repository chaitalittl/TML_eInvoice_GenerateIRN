package com.tml.IRN;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@XmlAccessorType( XmlAccessType.FIELD )
@JsonNaming(UpperCamelCaseStrategy.class)
@JsonInclude(Include.NON_NULL)
public class DocDtlsObj {
	
	@XmlElement(required = true)
	protected String Typ;
	
	@XmlElement(required = true)
	@Size(min=0,max=16)
	protected String No;
	
	@XmlElement(required = true)
	protected String Dt;
	
	@Size(min=0,max=250)
	protected String ReasonForCnDn;
	
	public String getTyp() {
		return Typ;
	}
	public void setTyp(String typ) {
		Typ = typ;
	}
	public String getNo() {
		return No;
	}
	public void setNo(String no) {
		No = no;
	}
	public String getDt() {
		return Dt;
	}
	public void setDt(String dt) {
		Dt = dt;
	}
	public String getReasonForCnDn() {
		return ReasonForCnDn;
	}
	public void setReasonForCnDn(String reasonForCnDn) {
		ReasonForCnDn = reasonForCnDn;
	}



}
