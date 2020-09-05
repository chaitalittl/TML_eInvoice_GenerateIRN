package com.tml.IRN;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType( XmlAccessType.FIELD )
public class ValDtlsObj {

	@XmlElement(required = true)
	protected BigDecimal AssVal;
	protected BigDecimal CgstVal;
	protected BigDecimal SgstVal;
	protected BigDecimal IgstVal;
	protected BigDecimal CesVal;
	protected BigDecimal StCesVal;
	protected BigDecimal CesNonAdVal;
	protected BigDecimal Discount;
	protected BigDecimal OthChrg;
	protected BigDecimal RndOffAmt;
	protected BigDecimal TotInvValFc;
	@XmlElement(required = true)
	protected BigDecimal TotInvVal;
	
	public void setAssVal(BigDecimal assVal) {
		AssVal = assVal;
	}
	public void setCgstVal(BigDecimal cgstVal) {
		CgstVal = cgstVal;
	}
	public void setSgstVal(BigDecimal sgstVal) {
		SgstVal = sgstVal;
	}
	public void setIgstVal(BigDecimal igstVal) {
		IgstVal = igstVal;
	}
	public void setCesVal(BigDecimal cesVal) {
		CesVal = cesVal;
	}
	public void setStCesVal(BigDecimal stCesVal) {
		StCesVal = stCesVal;
	}
	public void setCesNonAdVal(BigDecimal cesNonAdVal) {
		CesNonAdVal = cesNonAdVal;
	}
	public void setDiscount(BigDecimal discount) {
		Discount = discount;
	}
	public void setOthChrg(BigDecimal othChrg) {
		OthChrg = othChrg;
	}
	public void setRndOffAmt(BigDecimal rndOffAmt) {
		RndOffAmt = rndOffAmt;
	}
	public void setTotInvValFc(BigDecimal totInvValFc) {
		TotInvValFc = totInvValFc;
	}
	public void setTotInvVal(BigDecimal totInvVal) {
		TotInvVal = totInvVal;
	}
}
