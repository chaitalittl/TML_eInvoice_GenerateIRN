package com.tml.IRN;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "qrimagedataObj") 

@XmlRootElement(name = "qrimagedataObj")

public class qrimagedataObj {
	
	public String getSellerGstin() {
		return SellerGstin;
	}
	public void setSellerGstin(String sellerGstin) {
		SellerGstin = sellerGstin;
	}
	public String getBuyerGstin() {
		return BuyerGstin;
	}
	public void setBuyerGstin(String buyerGstin) {
		BuyerGstin = buyerGstin;
	}
	public String getDocNo() {
		return DocNo;
	}
	public void setDocNo(String docNo) {
		DocNo = docNo;
	}
	public String getDocTyp() {
		return DocTyp;
	}
	public void setDocTyp(String docTyp) {
		DocTyp = docTyp;
	}
	public String getDocDt() {
		return DocDt;
	}
	public void setDocDt(String docDt) {
		DocDt = docDt;
	}
	public String getTotInvVal() {
		return TotInvVal;
	}
	public void setTotInvVal(String totInvVal) {
		TotInvVal = totInvVal;
	}
	public String getItemCnt() {
		return ItemCnt;
	}
	public void setItemCnt(String itemCnt) {
		ItemCnt = itemCnt;
	}
	public String getMainHsnCode() {
		return MainHsnCode;
	}
	public void setMainHsnCode(String mainHsnCode) {
		MainHsnCode = mainHsnCode;
	}
	public String getIrn() {
		return Irn;
	}
	public void setIrn(String irn) {
		Irn = irn;
	}
	String SellerGstin;
	String BuyerGstin;
	String DocNo;
	String DocTyp;
	String DocDt;
	String TotInvVal;
	String ItemCnt;
	String MainHsnCode;
	String Irn;
	

}
