package com.tml.IRN;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@XmlAccessorType( XmlAccessType.FIELD )
@JsonNaming(UpperCamelCaseStrategy.class)
@JsonInclude(Include.NON_NULL)
public class PayDtlsObj {

	protected String Nm;
	protected String Mode;
	protected String FinInsBr;
	protected String PayTerm;
	protected String PayInstr;
	protected String CrTrn;
	protected String DirDr;
	protected int CrDay;
	protected BigDecimal PaidAmt;
	protected BigDecimal PaymtDue;
	protected String AccDet;
	
	public String getNm() {
		return Nm;
	}
	public void setNm(String nm) {
		Nm = nm;
	}
	public String getMode() {
		return Mode;
	}
	public void setMode(String mode) {
		Mode = mode;
	}
	public String getFinInsBr() {
		return FinInsBr;
	}
	public void setFinInsBr(String finInsBr) {
		FinInsBr = finInsBr;
	}
	public String getPayTerm() {
		return PayTerm;
	}
	public void setPayTerm(String payTerm) {
		PayTerm = payTerm;
	}
	public String getPayInstr() {
		return PayInstr;
	}
	public void setPayInstr(String payInstr) {
		PayInstr = payInstr;
	}
	public String getCrTrn() {
		return CrTrn;
	}
	public void setCrTrn(String crTrn) {
		CrTrn = crTrn;
	}
	public String getDirDr() {
		return DirDr;
	}
	public void setDirDr(String dirDr) {
		DirDr = dirDr;
	}
	public int getCrDay() {
		return CrDay;
	}
	public void setCrDay(int crDay) {
		CrDay = crDay;
	}
	public BigDecimal getPaidAmt() {
		return PaidAmt;
	}
	public void setPaidAmt(BigDecimal paidAmt) {
		PaidAmt = paidAmt;
	}
	public BigDecimal getPaymtDue() {
		return PaymtDue;
	}
	public void setPaymtDue(BigDecimal paymtDue) {
		PaymtDue = paymtDue;
	}
	public String getAccDet() {
		return AccDet;
	}
	public void setAccDet(String accDet) {
		AccDet = accDet;
	}

}
