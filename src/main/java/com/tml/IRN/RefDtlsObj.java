package com.tml.IRN;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@XmlAccessorType( XmlAccessType.FIELD )
@JsonNaming(UpperCamelCaseStrategy.class)
public class RefDtlsObj {

	protected String InvRm;
	
	@XmlElement(name="DocPerdDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected DocPerdDtlsObj DocPerdDtls ;
	
	@XmlElement(name="PrecDocDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<PrecDocDtls> PrecDocDtls ;
	
	@XmlElement(name="ContrDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<ContrDtlsObj> ContrDtls ;
	
	protected String AccountingDocNo;
	protected Date AccountingDocDt;
	protected String SoNo;
	protected Date SoDt;
	protected String AdvanceRefNo;
	protected Date AdvanceRefDt;
	protected int AdvanceAmt;
	
	
	public String getInvRm() {
		return InvRm;
	}
	public void setInvRm(String invRm) {
		InvRm = invRm;
	}
	public String getAccountingDocNo() {
		return AccountingDocNo;
	}
	public void setAccountingDocNo(String accountingDocNo) {
		AccountingDocNo = accountingDocNo;
	}
	public Date getAccountingDocDt() {
		return AccountingDocDt;
	}
	public void setAccountingDocDt(Date accountingDocDt) {
		AccountingDocDt = accountingDocDt;
	}
	public String getSoNo() {
		return SoNo;
	}
	public void setSoNo(String soNo) {
		SoNo = soNo;
	}
	public Date getSoDt() {
		return SoDt;
	}
	public void setSoDt(Date soDt) {
		SoDt = soDt;
	}
	public String getAdvanceRefNo() {
		return AdvanceRefNo;
	}
	public void setAdvanceRefNo(String advanceRefNo) {
		AdvanceRefNo = advanceRefNo;
	}
	public Date getAdvanceRefDt() {
		return AdvanceRefDt;
	}
	public void setAdvanceRefDt(Date advanceRefDt) {
		AdvanceRefDt = advanceRefDt;
	}
	public int getAdvanceAmt() {
		return AdvanceAmt;
	}
	public void setAdvanceAmt(int advanceAmt) {
		AdvanceAmt = advanceAmt;
	}

}
