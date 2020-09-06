package com.tml.IRN;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@XmlAccessorType( XmlAccessType.FIELD )
@JsonNaming(UpperCamelCaseStrategy.class)
public class ShipDtlsObj {

	@Size(min=3,max=15)
	protected String Gstin;
	@Size(min=3,max=100)
	protected String LglNm;
	@Size(min=3,max=100)
	protected String TrdNm;
	@Size(min=3,max=100)
	protected String Addr1;
	@Size(min=3,max=100)
	protected String Addr2;
	@Size(min=3,max=100)
	protected String Loc;
	@Min(100000)
	@Max(999999)
	protected String Pin;
	protected String Stcd;
	
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
	public String getPin() {
		return Pin;
	}
	public void setPin(String pin) {
		Pin = pin;
	}
	public String getStcd() {
		return Stcd;
	}
	public void setStcd(String stcd) {
		Stcd = stcd;
	}
	
}
