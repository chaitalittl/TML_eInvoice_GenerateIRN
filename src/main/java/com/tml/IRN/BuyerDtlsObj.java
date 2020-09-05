package com.tml.IRN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType( XmlAccessType.FIELD )
public class BuyerDtlsObj {
	
	protected String Gstin;
	protected String LglNm;
	protected String TrdNm;
	protected String Addr1;
	protected String Addr2;
	protected String Loc;
	protected String Pin;
	protected String Stcd;
	protected String Poc;
	protected String Ph;
	protected String Em;
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
	public String getPoc() {
		return Poc;
	}
	public void setPoc(String poc) {
		Poc = poc;
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
