package com.tml.IRN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@XmlAccessorType( XmlAccessType.FIELD )
@JsonNaming(UpperCamelCaseStrategy.class)
public class WhtItemObj {

	protected String PoDescription;
	protected String VoucherId;
	protected String DebitCreditIdentifier;
	protected int GrossExpenseAmt;
	protected int TdsBaseAmt;
	protected String TdsSection;
	protected String TdsRate;
	protected int TdsAmt;
	protected String OffsetGlCode;
	protected String TdsGlCode;
	
	public String getPoDescription() {
		return PoDescription;
	}
	public void setPoDescription(String poDescription) {
		PoDescription = poDescription;
	}
	public String getVoucherId() {
		return VoucherId;
	}
	public void setVoucherId(String voucherId) {
		VoucherId = voucherId;
	}
	public String getDebitCreditIdentifier() {
		return DebitCreditIdentifier;
	}
	public void setDebitCreditIdentifier(String debitCreditIdentifier) {
		DebitCreditIdentifier = debitCreditIdentifier;
	}
	public int getGrossExpenseAmt() {
		return GrossExpenseAmt;
	}
	public void setGrossExpenseAmt(int grossExpenseAmt) {
		GrossExpenseAmt = grossExpenseAmt;
	}
	public int getTdsBaseAmt() {
		return TdsBaseAmt;
	}
	public void setTdsBaseAmt(int tdsBaseAmt) {
		TdsBaseAmt = tdsBaseAmt;
	}
	public String getTdsSection() {
		return TdsSection;
	}
	public void setTdsSection(String tdsSection) {
		TdsSection = tdsSection;
	}
	public String getTdsRate() {
		return TdsRate;
	}
	public void setTdsRate(String tdsRate) {
		TdsRate = tdsRate;
	}
	public int getTdsAmt() {
		return TdsAmt;
	}
	public void setTdsAmt(int tdsAmt) {
		TdsAmt = tdsAmt;
	}
	public String getOffsetGlCode() {
		return OffsetGlCode;
	}
	public void setOffsetGlCode(String offsetGlCode) {
		OffsetGlCode = offsetGlCode;
	}
	public String getTdsGlCode() {
		return TdsGlCode;
	}
	public void setTdsGlCode(String tdsGlCode) {
		TdsGlCode = tdsGlCode;
	}
}
