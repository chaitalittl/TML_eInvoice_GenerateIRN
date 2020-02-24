package com.tml.IRN;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "TranDtlsObj") 

@XmlRootElement(name = "TranDtlsObj")

public class TranDtlsObj {
	
	
	public String getCatg() {
		return Catg;
	}
	public void setCatg(String catg) {
		Catg = catg;
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
	public String getEcmTrnSel() {
		return EcmTrnSel;
	}
	public void setEcmTrnSel(String ecmTrnSel) {
		EcmTrnSel = ecmTrnSel;
	}
	public String getEcmTrn() {
		return EcmTrn;
	}
	public void setEcmTrn(String ecmTrn) {
		EcmTrn = ecmTrn;
	}
	public String getEcmGstin() {
		return EcmGstin;
	}
	public void setEcmGstin(String ecmGstin) {
		EcmGstin = ecmGstin;
	}
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
	public String getPos() {
		return Pos;
	}
	public void setPos(String pos) {
		Pos = pos;
	}
	public String getClaimingRefund() {
		return ClaimingRefund;
	}
	public void setClaimingRefund(String claimingRefund) {
		ClaimingRefund = claimingRefund;
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
	protected String Catg;
	protected String RegRev;
	protected String Typ;
	protected String EcmTrnSel;
	protected String EcmTrn;
	protected String EcmGstin;
	protected String OutwardInward;
	protected String SubType;
	protected String SubTypeDescription;
	protected String Pos;
	protected String ClaimingRefund;
	protected String DiffPercentage;
	protected String Taxability;
	protected String InterIntra;

}
