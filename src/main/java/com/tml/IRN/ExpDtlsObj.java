package com.tml.IRN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType( XmlAccessType.FIELD )
public class ExpDtlsObj {
	
	protected String RefClm;
	protected String ShipBNo;
	protected String ShipBDt;
	protected String Port;
	protected String ForCur;
	protected String CntCode;
	protected String ExpDuty;
	
	public String getRefClm() {
		return RefClm;
	}
	public void setRefClm(String refClm) {
		RefClm = refClm;
	}
	public String getShipBNo() {
		return ShipBNo;
	}
	public void setShipBNo(String shipBNo) {
		ShipBNo = shipBNo;
	}
	public String getShipBDt() {
		return ShipBDt;
	}
	public void setShipBDt(String shipBDt) {
		ShipBDt = shipBDt;
	}
	public String getPort() {
		return Port;
	}
	public void setPort(String port) {
		Port = port;
	}
	public String getForCur() {
		return ForCur;
	}
	public void setForCur(String forCur) {
		ForCur = forCur;
	}
	public String getCntCode() {
		return CntCode;
	}
	public void setCntCode(String cntCode) {
		CntCode = cntCode;
	}
	public String getExpDuty() {
		return ExpDuty;
	}
	public void setExpDuty(String expDuty) {
		ExpDuty = expDuty;
	}
	
	
}
