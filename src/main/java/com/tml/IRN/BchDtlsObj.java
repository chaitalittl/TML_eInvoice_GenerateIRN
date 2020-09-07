package com.tml.IRN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@XmlAccessorType( XmlAccessType.FIELD )
@JsonNaming(UpperCamelCaseStrategy.class)
public class BchDtlsObj {
	
	protected String Nm;
	protected String ExpDt;
	protected String WrDt;
	
	public String getNm() {
		return Nm;
	}
	public void setNm(String nm) {
		Nm = nm;
	}
	public String getExpDt() {
		return ExpDt;
	}
	public void setExpDt(String expDt) {
		ExpDt = expDt;
	}
	public String getWrDt() {
		return WrDt;
	}
	public void setWrDt(String wrDt) {
		WrDt = wrDt;
	}
}
