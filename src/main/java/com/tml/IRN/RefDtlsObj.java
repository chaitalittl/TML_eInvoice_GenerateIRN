package com.tml.IRN;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonFormat;

@XmlAccessorType( XmlAccessType.FIELD )
public class RefDtlsObj {

	protected String InvRm;
	
	@XmlElement(name="DocPerdDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<DocPerdDtlsObj> DocPerdDtls ;
	
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
	protected String AdvanceAmt;
	
	
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
	public String getAdvanceAmt() {
		return AdvanceAmt;
	}
	public void setAdvanceAmt(String advanceAmt) {
		AdvanceAmt = advanceAmt;
	}

}
