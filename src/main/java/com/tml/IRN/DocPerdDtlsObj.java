package com.tml.IRN;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@XmlAccessorType( XmlAccessType.FIELD )
@JsonNaming(UpperCamelCaseStrategy.class)
public class DocPerdDtlsObj {
	
	protected String InvStDt;
	protected String InvEndDt;
	
	public String getInvStDt() {
		return InvStDt;
	}
	public void setInvStDt(String invStDt) {
		InvStDt = invStDt;
	}
	public String getInvEndDt() {
		return InvEndDt;
	}
	public void setInvEndDt(String invEndDt) {
		InvEndDt = invEndDt;
	}
}
