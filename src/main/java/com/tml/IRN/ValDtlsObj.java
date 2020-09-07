package com.tml.IRN;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@XmlAccessorType( XmlAccessType.FIELD )
@JsonNaming(UpperCamelCaseStrategy.class)
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
	
	public BigDecimal getAssVal() {
		return AssVal;
	}
	public void setAssVal(BigDecimal assVal) {
		AssVal = assVal;
	}
	public BigDecimal getCgstVal() {
		return CgstVal;
	}
	public void setCgstVal(BigDecimal cgstVal) {
		CgstVal = cgstVal;
	}
	public BigDecimal getSgstVal() {
		return SgstVal;
	}
	public void setSgstVal(BigDecimal sgstVal) {
		SgstVal = sgstVal;
	}
	public BigDecimal getIgstVal() {
		return IgstVal;
	}
	public void setIgstVal(BigDecimal igstVal) {
		IgstVal = igstVal;
	}
	public BigDecimal getCesVal() {
		return CesVal;
	}
	public void setCesVal(BigDecimal cesVal) {
		CesVal = cesVal;
	}
	public BigDecimal getStCesVal() {
		return StCesVal;
	}
	public void setStCesVal(BigDecimal stCesVal) {
		StCesVal = stCesVal;
	}
	public BigDecimal getCesNonAdVal() {
		return CesNonAdVal;
	}
	public void setCesNonAdVal(BigDecimal cesNonAdVal) {
		CesNonAdVal = cesNonAdVal;
	}
	public BigDecimal getDiscount() {
		return Discount;
	}
	public void setDiscount(BigDecimal discount) {
		Discount = discount;
	}
	public BigDecimal getOthChrg() {
		return OthChrg;
	}
	public void setOthChrg(BigDecimal othChrg) {
		OthChrg = othChrg;
	}
	public BigDecimal getRndOffAmt() {
		return RndOffAmt;
	}
	public void setRndOffAmt(BigDecimal rndOffAmt) {
		RndOffAmt = rndOffAmt;
	}
	public BigDecimal getTotInvValFc() {
		return TotInvValFc;
	}
	public void setTotInvValFc(BigDecimal totInvValFc) {
		TotInvValFc = totInvValFc;
	}
	public BigDecimal getTotInvVal() {
		return TotInvVal;
	}
	public void setTotInvVal(BigDecimal totInvVal) {
		TotInvVal = totInvVal;
	}
	
	}
