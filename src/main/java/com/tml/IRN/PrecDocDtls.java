package com.tml.IRN;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType( XmlAccessType.FIELD )
public class PrecDocDtls {
	
	protected String InvNo;
	protected Date InvDt; 	
	protected String OthRefNo;
	
	public String getInvNo() {
		return InvNo;
	}
	public void setInvNo(String invNo) {
		InvNo = invNo;
	}
	public Date getInvDt() {
		return InvDt;
	}
	public void setInvDt(Date invDt) {
		InvDt = invDt;
	}
	public String getOthRefNo() {
		return OthRefNo;
	}
	public void setOthRefNo(String othRefNo) {
		OthRefNo = othRefNo;
	}
}