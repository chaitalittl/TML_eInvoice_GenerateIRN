package com.tml.IRN;

import java.math.BigDecimal;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@XmlAccessorType( XmlAccessType.FIELD )
@JsonNaming(UpperCamelCaseStrategy.class)
@JsonInclude(Include.NON_NULL)
public class ExpDtlsObj {
	
	protected String RefClm;
	protected String ShipBNo;
	protected String ShipBDt;
	protected String Port;
	protected String ForCur;
	protected String CntCode;
	
	@DecimalMin("0.0")
	@DecimalMax("9999999999.999")
	protected BigDecimal ExpDuty;
	
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
	public BigDecimal getExpDuty() {
		return ExpDuty;
	}
	public void setExpDuty(BigDecimal expDuty) {
		ExpDuty = expDuty;
	}
	
	
}
