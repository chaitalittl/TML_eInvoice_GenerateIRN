package com.tml.IRN;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@XmlAccessorType( XmlAccessType.FIELD )
@JsonNaming(UpperCamelCaseStrategy.class)
@JsonInclude(Include.NON_NULL)
public class BuyerDtlsObj {
	
	@Size(min=3,max=15)
	@XmlElement(required = true)
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
	@Size(min=3,max=100)
	@XmlElement(required = true)
	protected String Loc;
	@Min(100000)
	@Max(999999)
	protected int Pin;
	@XmlElement(required = true)
	protected String Stcd;
	@XmlElement(required = true)
	protected String Pos;
	@Size(min=6,max=12)
	protected String Ph;
	@Size(min=6,max=100)
	protected String Em;
	@Size(min=0,max=250)
	protected String CustomerCode;
	
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
	public String getPos() {
		return Pos;
	}
	public void setPos(String pos) {
		Pos = pos;
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
	public String getCustomerCode() {
		return CustomerCode;
	}
	public void setCustomerCode(String customerCode) {
		CustomerCode = customerCode;
	}

	
}
