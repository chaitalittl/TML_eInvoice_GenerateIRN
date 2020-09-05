package com.tml.IRN;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType( XmlAccessType.FIELD )
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
