package com.tml.IRN;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;

@XmlType(name = "TranDtlsObj") 
@XmlRootElement(name = "TranDtlsObj")
@XmlAccessorType( XmlAccessType.FIELD )
@JsonNaming(UpperCamelCaseStrategy.class)
public class TranDtlsObj {
	
	protected String OutwardInward;
	protected String SubType;
	protected String SubTypeDescription;
	
	@XmlElement(required = true)
	@Size(min=0,max=20)
	protected String SupTyp;
	protected String RegRev;
	protected String Typ;
	
	@Size(min=15,max=15)
	protected String EcmGstin;
	protected String IgstOnIntra;
	protected String DiffPercentage;
	protected String Taxability;
	protected String InterIntra;
	protected String CancelFlag="N";
	protected String CnlRsn;
	
	@Size(min=0,max=250)
	protected String CnlRem;
	
	
	public String getOutwardInward() {
		return OutwardInward;
	}
	public void setOutwardInward(String outwardInward) {
		OutwardInward = outwardInward;
	}
	public String getSubType() {
		return SubType;
	}
	public void setSubType(String subType) {
		SubType = subType;
	}
	public String getSubTypeDescription() {
		return SubTypeDescription;
	}
	public void setSubTypeDescription(String subTypeDescription) {
		SubTypeDescription = subTypeDescription;
	}
	public String getSupTyp() {
		return SupTyp;
	}
	public void setSupTyp(String supTyp) {
		SupTyp = supTyp;
	}
	public String getRegRev() {
		return RegRev;
	}
	public void setRegRev(String regRev) {
		RegRev = regRev;
	}
	public String getTyp() {
		return Typ;
	}
	public void setTyp(String typ) {
		Typ = typ;
	}
	public String getEcmGstin() {
		return EcmGstin;
	}
	public void setEcmGstin(String ecmGstin) {
		EcmGstin = ecmGstin;
	}
	public String getIgstOnIntra() {
		return IgstOnIntra;
	}
	public void setIgstOnIntra(String igstOnIntra) {
		IgstOnIntra = igstOnIntra;
	}
	public String getDiffPercentage() {
		return DiffPercentage;
	}
	public void setDiffPercentage(String diffPercentage) {
		DiffPercentage = diffPercentage;
	}
	public String getTaxability() {
		return Taxability;
	}
	public void setTaxability(String taxability) {
		Taxability = taxability;
	}
	public String getInterIntra() {
		return InterIntra;
	}
	public void setInterIntra(String interIntra) {
		InterIntra = interIntra;
	}
	public String getCnlRsn() {
		return CnlRsn;
	}
	public void setCnlRsn(String cnlRsn) {
		CnlRsn = cnlRsn;
	}
	public String getCnlRem() {
		return CnlRem;
	}
	public void setCnlRem(String cnlRem) {
		CnlRem = cnlRem;
	}
	public String getCancelFlag() {
		return "N";
	}
	public void setCancelFlag(String cancelFlag) {
		CancelFlag = "N";
	}
	
	
}
