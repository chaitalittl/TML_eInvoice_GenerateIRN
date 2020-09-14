package com.tml.IRN;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@XmlAccessorType( XmlAccessType.FIELD )
@JsonNaming(UpperCamelCaseStrategy.class)
@JsonInclude(Include.NON_NULL)
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
	protected String AccountingDocDt;
	protected String SoNo;
	protected String SoDt;
	protected String AdvanceRefNo;
	protected String AdvanceRefDt;
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
	public String getAccountingDocDt() {
		return AccountingDocDt;
	}
	public void setAccountingDocDt(String accountingDocDt) {
		AccountingDocDt = accountingDocDt;
	}
	public String getSoNo() {
		return SoNo;
	}
	public void setSoNo(String soNo) {
		SoNo = soNo;
	}
	public String getSoDt() {
		return SoDt;
	}
	public void setSoDt(String soDt) {
		SoDt = soDt;
	}
	public String getAdvanceRefNo() {
		return AdvanceRefNo;
	}
	public void setAdvanceRefNo(String advanceRefNo) {
		AdvanceRefNo = advanceRefNo;
	}
	public String getAdvanceRefDt() {
		return AdvanceRefDt;
	}
	public void setAdvanceRefDt(String advanceRefDt) {
		AdvanceRefDt = advanceRefDt;
	}
	public int getAdvanceAmt() {
		return AdvanceAmt;
	}
	public void setAdvanceAmt(int advanceAmt) {
		AdvanceAmt = advanceAmt;
	}

}
