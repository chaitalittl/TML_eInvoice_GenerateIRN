package com.tml.IRN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType( XmlAccessType.FIELD )
public class PrecDocDtls {
	
	protected String InvNo;
	protected String InvDt; 	
	protected String OthRefNo;
	
	public String getInvNo() {
		return InvNo;
	}
	public void setInvNo(String invNo) {
		InvNo = invNo;
	}
	public String getInvDt() {
		return InvDt;
	}
	public void setInvDt(String invDt) {
		InvDt = invDt;
	}
	public String getOthRefNo() {
		return OthRefNo;
	}
	public void setOthRefNo(String othRefNo) {
		OthRefNo = othRefNo;
	}
}
