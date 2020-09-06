package com.tml.IRN;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@XmlAccessorType( XmlAccessType.FIELD )
@JsonNaming(UpperCamelCaseStrategy.class)
public class BchDtlsObj {
	
	protected String Nm;
	protected Date ExpDt;
	protected Date WrDt;
	
	public String getNm() {
		return Nm;
	}
	public void setNm(String nm) {
		Nm = nm;
	}
	public Date getExpDt() {
		return ExpDt;
	}
	public void setExpDt(Date expDt) {
		ExpDt = expDt;
	}
	public Date getWrDt() {
		return WrDt;
	}
	public void setWrDt(Date wrDt) {
		WrDt = wrDt;
	}
}
