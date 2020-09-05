package com.tml.IRN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType( XmlAccessType.FIELD )
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
