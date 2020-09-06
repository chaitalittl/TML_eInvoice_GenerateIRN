package com.tml.IRN;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@XmlAccessorType( XmlAccessType.FIELD )
@JsonNaming(UpperCamelCaseStrategy.class)
public class DocPerdDtlsObj {
	
	protected Date InvStDt;
	protected Date InvEndDt;
	
	public Date getInvStDt() {
		return InvStDt;
	}
	public void setInvStDt(Date invStDt) {
		InvStDt = invStDt;
	}
	public Date getInvEndDt() {
		return InvEndDt;
	}
	public void setInvEndDt(Date invEndDt) {
		InvEndDt = invEndDt;
	}
}
