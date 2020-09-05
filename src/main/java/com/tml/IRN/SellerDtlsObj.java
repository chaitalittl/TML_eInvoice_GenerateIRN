package com.tml.IRN;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType( XmlAccessType.FIELD )
public class SellerDtlsObj {
	
	@XmlElement(required = true)
	@Size(min=15,max=15)
	protected String Gstin;
	@Size(min=3,max=100)
	@XmlElement(required = true)
	protected String LglNm;
	@Size(min=3,max=100)
	protected String TrdNm;
	@Size(min=3,max=100)
	@XmlElement(required = true)
	protected String Addr1;
	@Size(min=3,max=100)
	protected String Addr2;
	@Size(min=3,max=50)
	@XmlElement(required = true)
	protected String Loc;
	
	@Min(100000)
	@Max(999999)
	@XmlElement(required = true)
	protected int Pin;
	@XmlElement(required = true)
	protected String Stcd;
	@Size(min=6,max=12)
	protected String Ph;
	
	@Size(min=6,max=100)
	protected String Em;
	
	@Size(min=0,max=250)
	protected String SupplierCode;
	
	public String getGstin() {
		return Gstin;
	}
	public void setGstin(String gstin) {
		Gstin = gstin;
	}
	public String getLglNm() {
		return LglNm;
	}
	public void setLglNm(String lglNm) {
		LglNm = lglNm;
	}
	public String getTrdNm() {
		return TrdNm;
	}
	public void setTrdNm(String trdNm) {
		TrdNm = trdNm;
	}
	public String getAddr1() {
		return Addr1;
	}
	public void setAddr1(String addr1) {
		Addr1 = addr1;
	}
	public String getAddr2() {
		return Addr2;
	}
	public void setAddr2(String addr2) {
		Addr2 = addr2;
	}
	public String getLoc() {
		return Loc;
	}
	public void setLoc(String loc) {
		Loc = loc;
	}
	public int getPin() {
		return Pin;
	}
	public void setPin(int pin) {
		Pin = pin;
	}
	public String getStcd() {
		return Stcd;
	}
	public void setStcd(String stcd) {
		Stcd = stcd;
	}
	public String getPh() {
		return Ph;
	}
	public void setPh(String ph) {
		Ph = ph;
	}
	
	public String getEm() {
		return Em;
	}
	public void setEm(String em) {
		Em = em;
	}
	public String getSupplierCode() {
		return SupplierCode;
	}
	public void setSupplierCode(String supplierCode) {
		SupplierCode = supplierCode;
	}
}
