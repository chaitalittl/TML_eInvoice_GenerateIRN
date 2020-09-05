package com.tml.IRN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType( XmlAccessType.FIELD )
public class AttribDtlsObj {
	
	protected String Nm;
	protected String Val;
	
	public String getNm() {
		return Nm;
	}
	public void setNm(String nm) {
		Nm = nm;
	}
	public String getVal() {
		return Val;
	}
	public void setVal(String val) {
		Val = val;
	}
}
