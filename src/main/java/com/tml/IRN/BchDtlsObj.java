package com.tml.IRN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType( XmlAccessType.FIELD )
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
