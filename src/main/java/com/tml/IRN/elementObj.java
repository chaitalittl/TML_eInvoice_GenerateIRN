package com.tml.IRN;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType( XmlAccessType.FIELD )
public class elementObj {
	
	protected String SlNo;
	protected String OrdLineRef;
	protected String PrdSlNo;
	protected String ItemCode;
	protected String PrdNm;
	protected String PrdDesc;
	protected String HsnCd;
	protected String IsServc;
	protected String BarCde;
	protected String Qty;
	protected String FreeQty;
	protected String Unit;
	protected String UnitPrice;
	protected String TotAmt;
	protected String Discount;
	protected String OthChrg;
	protected String Vat;
	protected String CentralDxcise;
	protected String StateExcise;
	protected String ValueBeforeBcd;
	protected String Bcd;
	protected String PreTaxVal;
	protected String AssAmt;
	protected String GstRt;
	protected String CgstRt;
	protected String SgstRt;
	protected String IgstRt;
	protected String CesRt;
	protected String CesNonAdVal;
	protected String StateCesRt;
	protected String IgstAmt;
	protected String CgstAmt;
	protected String SgstAmt;
	protected String CessAmt;
	protected String CesNonAdvlAmt;
	protected String StateCesAmt;
	protected String StateCesNonAdvlAmt;
	protected String TotItemVal;
	protected String OrgCntry;
	
	@XmlElement(name="BchDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<BchDtlsObj> BchDtls ;
	
	@XmlElement(name="AttribDtls")
	//@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	@JsonProperty("AttribDtls")
	@JsonFormat(shape=JsonFormat.Shape.ARRAY)
	protected List<AttribDtlsObj> AttribDtls;
	
	@XmlElement(name="WhtItem")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<WhtItemObj> WhtItem ;
	
	protected String EligibilityItc;
	protected String ItcIgst;
	protected String ItcCgst;
	protected String ItcSgst;
	protected String ItcCess;
	protected String NatureOfExpense;
	protected String GlCodeRevenueExpense;
	protected String GlCodeIgst;
	protected String GlCodeCgst;
	protected String GlCodeSgst;
	protected String GlCodeCess;
	protected String GlCodeIgstItc;
	protected String GlCodeCgstItc;
	protected String GlCodeSgstItc;
	protected String GlCodeCessItc;
	protected String Mis1;
	protected String Mis2;
	protected String Mis3;
	protected String Mis4;
	protected String Mis5;
	protected String Mis6;
	protected String Mis7;
	protected String Mis8;
	protected String Mis9;
	protected String Mis10;
	protected String Mis11;
	protected String Mis12;
	protected String Mis13;
	protected String Mis14;
	protected String Mis15;
	protected String Mis16;
	protected String Mis17;
	protected String Mis18;
	protected String Mis19;
	protected String Mis20;
	protected String Mis21;
	protected String Mis22;
	protected String Mis23;
	protected String Mis24;
	protected String Mis25;
	protected String Mis26;
	protected String Mis27;
	protected String Mis28;
	protected String Mis29;
	protected String Mis30;
	protected String Fu1;
	protected String Fu2;
	protected String Fu3;
	protected String Fu4;
	protected String Fu5;
	protected String Fu6;
	protected String Fu7;
	protected String Fu8;
	protected String Fu9;
	protected String Fu10;
	public String getSlNo() {
		return SlNo;
	}
	public void setSlNo(String slNo) {
		SlNo = slNo;
	}
	public String getOrdLineRef() {
		return OrdLineRef;
	}
	public void setOrdLineRef(String ordLineRef) {
		OrdLineRef = ordLineRef;
	}
	public String getPrdSlNo() {
		return PrdSlNo;
	}
	public void setPrdSlNo(String prdSlNo) {
		PrdSlNo = prdSlNo;
	}
	public String getItemCode() {
		return ItemCode;
	}
	public void setItemCode(String itemCode) {
		ItemCode = itemCode;
	}
	public String getPrdNm() {
		return PrdNm;
	}
	public void setPrdNm(String prdNm) {
		PrdNm = prdNm;
	}
	public String getPrdDesc() {
		return PrdDesc;
	}
	public void setPrdDesc(String prdDesc) {
		PrdDesc = prdDesc;
	}
	public String getHsnCd() {
		return HsnCd;
	}
	public void setHsnCd(String hsnCd) {
		HsnCd = hsnCd;
	}
	public String getIsServc() {
		return IsServc;
	}
	public void setIsServc(String isServc) {
		IsServc = isServc;
	}
	public String getBarCde() {
		return BarCde;
	}
	public void setBarCde(String barCde) {
		BarCde = barCde;
	}
	public String getQty() {
		return Qty;
	}
	public void setQty(String qty) {
		Qty = qty;
	}
	public String getFreeQty() {
		return FreeQty;
	}
	public void setFreeQty(String freeQty) {
		FreeQty = freeQty;
	}
	public String getUnit() {
		return Unit;
	}
	public void setUnit(String unit) {
		Unit = unit;
	}
	public String getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		UnitPrice = unitPrice;
	}
	public String getTotAmt() {
		return TotAmt;
	}
	public void setTotAmt(String totAmt) {
		TotAmt = totAmt;
	}
	public String getDiscount() {
		return Discount;
	}
	public void setDiscount(String discount) {
		Discount = discount;
	}
	public String getOthChrg() {
		return OthChrg;
	}
	public void setOthChrg(String othChrg) {
		OthChrg = othChrg;
	}
	public String getVat() {
		return Vat;
	}
	public void setVat(String vat) {
		Vat = vat;
	}
	public String getCentralDxcise() {
		return CentralDxcise;
	}
	public void setCentralDxcise(String centralDxcise) {
		CentralDxcise = centralDxcise;
	}
	public String getStateExcise() {
		return StateExcise;
	}
	public void setStateExcise(String stateExcise) {
		StateExcise = stateExcise;
	}
	public String getValueBeforeBcd() {
		return ValueBeforeBcd;
	}
	public void setValueBeforeBcd(String valueBeforeBcd) {
		ValueBeforeBcd = valueBeforeBcd;
	}
	public String getBcd() {
		return Bcd;
	}
	public void setBcd(String bcd) {
		Bcd = bcd;
	}
	public String getPreTaxVal() {
		return PreTaxVal;
	}
	public void setPreTaxVal(String preTaxVal) {
		PreTaxVal = preTaxVal;
	}
	public String getAssAmt() {
		return AssAmt;
	}
	public void setAssAmt(String assAmt) {
		AssAmt = assAmt;
	}
	public String getGstRt() {
		return GstRt;
	}
	public void setGstRt(String gstRt) {
		GstRt = gstRt;
	}
	public String getCgstRt() {
		return CgstRt;
	}
	public void setCgstRt(String cgstRt) {
		CgstRt = cgstRt;
	}
	public String getSgstRt() {
		return SgstRt;
	}
	public void setSgstRt(String sgstRt) {
		SgstRt = sgstRt;
	}
	public String getIgstRt() {
		return IgstRt;
	}
	public void setIgstRt(String igstRt) {
		IgstRt = igstRt;
	}
	public String getCesRt() {
		return CesRt;
	}
	public void setCesRt(String cesRt) {
		CesRt = cesRt;
	}
	public String getCesNonAdVal() {
		return CesNonAdVal;
	}
	public void setCesNonAdVal(String cesNonAdVal) {
		CesNonAdVal = cesNonAdVal;
	}
	public String getStateCesRt() {
		return StateCesRt;
	}
	public void setStateCesRt(String stateCesRt) {
		StateCesRt = stateCesRt;
	}
	public String getIgstAmt() {
		return IgstAmt;
	}
	public void setIgstAmt(String igstAmt) {
		IgstAmt = igstAmt;
	}
	public String getCgstAmt() {
		return CgstAmt;
	}
	public void setCgstAmt(String cgstAmt) {
		CgstAmt = cgstAmt;
	}
	public String getSgstAmt() {
		return SgstAmt;
	}
	public void setSgstAmt(String sgstAmt) {
		SgstAmt = sgstAmt;
	}
	public String getCessAmt() {
		return CessAmt;
	}
	public void setCessAmt(String cessAmt) {
		CessAmt = cessAmt;
	}
	public String getCesNonAdvlAmt() {
		return CesNonAdvlAmt;
	}
	public void setCesNonAdvlAmt(String cesNonAdvlAmt) {
		CesNonAdvlAmt = cesNonAdvlAmt;
	}
	public String getStateCesAmt() {
		return StateCesAmt;
	}
	public void setStateCesAmt(String stateCesAmt) {
		StateCesAmt = stateCesAmt;
	}
	public String getStateCesNonAdvlAmt() {
		return StateCesNonAdvlAmt;
	}
	public void setStateCesNonAdvlAmt(String stateCesNonAdvlAmt) {
		StateCesNonAdvlAmt = stateCesNonAdvlAmt;
	}
	public String getTotItemVal() {
		return TotItemVal;
	}
	public void setTotItemVal(String totItemVal) {
		TotItemVal = totItemVal;
	}
	public String getOrgCntry() {
		return OrgCntry;
	}
	public void setOrgCntry(String orgCntry) {
		OrgCntry = orgCntry;
	}
	public List<BchDtlsObj> getBchDtls() {
		return BchDtls;
	}
	public void setBchDtls(List<BchDtlsObj> bchDtls) {
		BchDtls = bchDtls;
	}
	public List<AttribDtlsObj> getAttribDtls() {
		return AttribDtls;
	}
	public void setAttribDtls(List<AttribDtlsObj> attribDtls) {
		AttribDtls = attribDtls;
	}
	public List<WhtItemObj> getWhtItem() {
		return WhtItem;
	}
	public void setWhtItem(List<WhtItemObj> whtItem) {
		WhtItem = whtItem;
	}
	public String getEligibilityItc() {
		return EligibilityItc;
	}
	public void setEligibilityItc(String eligibilityItc) {
		EligibilityItc = eligibilityItc;
	}
	public String getItcIgst() {
		return ItcIgst;
	}
	public void setItcIgst(String itcIgst) {
		ItcIgst = itcIgst;
	}
	public String getItcCgst() {
		return ItcCgst;
	}
	public void setItcCgst(String itcCgst) {
		ItcCgst = itcCgst;
	}
	public String getItcSgst() {
		return ItcSgst;
	}
	public void setItcSgst(String itcSgst) {
		ItcSgst = itcSgst;
	}
	public String getItcCess() {
		return ItcCess;
	}
	public void setItcCess(String itcCess) {
		ItcCess = itcCess;
	}
	public String getNatureOfExpense() {
		return NatureOfExpense;
	}
	public void setNatureOfExpense(String natureOfExpense) {
		NatureOfExpense = natureOfExpense;
	}
	public String getGlCodeRevenueExpense() {
		return GlCodeRevenueExpense;
	}
	public void setGlCodeRevenueExpense(String glCodeRevenueExpense) {
		GlCodeRevenueExpense = glCodeRevenueExpense;
	}
	public String getGlCodeIgst() {
		return GlCodeIgst;
	}
	public void setGlCodeIgst(String glCodeIgst) {
		GlCodeIgst = glCodeIgst;
	}
	public String getGlCodeCgst() {
		return GlCodeCgst;
	}
	public void setGlCodeCgst(String glCodeCgst) {
		GlCodeCgst = glCodeCgst;
	}
	public String getGlCodeSgst() {
		return GlCodeSgst;
	}
	public void setGlCodeSgst(String glCodeSgst) {
		GlCodeSgst = glCodeSgst;
	}
	public String getGlCodeCess() {
		return GlCodeCess;
	}
	public void setGlCodeCess(String glCodeCess) {
		GlCodeCess = glCodeCess;
	}
	public String getGlCodeIgstItc() {
		return GlCodeIgstItc;
	}
	public void setGlCodeIgstItc(String glCodeIgstItc) {
		GlCodeIgstItc = glCodeIgstItc;
	}
	public String getGlCodeCgstItc() {
		return GlCodeCgstItc;
	}
	public void setGlCodeCgstItc(String glCodeCgstItc) {
		GlCodeCgstItc = glCodeCgstItc;
	}
	public String getGlCodeSgstItc() {
		return GlCodeSgstItc;
	}
	public void setGlCodeSgstItc(String glCodeSgstItc) {
		GlCodeSgstItc = glCodeSgstItc;
	}
	public String getGlCodeCessItc() {
		return GlCodeCessItc;
	}
	public void setGlCodeCessItc(String glCodeCessItc) {
		GlCodeCessItc = glCodeCessItc;
	}
	public String getMis1() {
		return Mis1;
	}
	public void setMis1(String mis1) {
		Mis1 = mis1;
	}
	public String getMis2() {
		return Mis2;
	}
	public void setMis2(String mis2) {
		Mis2 = mis2;
	}
	public String getMis3() {
		return Mis3;
	}
	public void setMis3(String mis3) {
		Mis3 = mis3;
	}
	public String getMis4() {
		return Mis4;
	}
	public void setMis4(String mis4) {
		Mis4 = mis4;
	}
	public String getMis5() {
		return Mis5;
	}
	public void setMis5(String mis5) {
		Mis5 = mis5;
	}
	public String getMis6() {
		return Mis6;
	}
	public void setMis6(String mis6) {
		Mis6 = mis6;
	}
	public String getMis7() {
		return Mis7;
	}
	public void setMis7(String mis7) {
		Mis7 = mis7;
	}
	public String getMis8() {
		return Mis8;
	}
	public void setMis8(String mis8) {
		Mis8 = mis8;
	}
	public String getMis9() {
		return Mis9;
	}
	public void setMis9(String mis9) {
		Mis9 = mis9;
	}
	public String getMis10() {
		return Mis10;
	}
	public void setMis10(String mis10) {
		Mis10 = mis10;
	}
	public String getMis11() {
		return Mis11;
	}
	public void setMis11(String mis11) {
		Mis11 = mis11;
	}
	public String getMis12() {
		return Mis12;
	}
	public void setMis12(String mis12) {
		Mis12 = mis12;
	}
	public String getMis13() {
		return Mis13;
	}
	public void setMis13(String mis13) {
		Mis13 = mis13;
	}
	public String getMis14() {
		return Mis14;
	}
	public void setMis14(String mis14) {
		Mis14 = mis14;
	}
	public String getMis15() {
		return Mis15;
	}
	public void setMis15(String mis15) {
		Mis15 = mis15;
	}
	public String getMis16() {
		return Mis16;
	}
	public void setMis16(String mis16) {
		Mis16 = mis16;
	}
	public String getMis17() {
		return Mis17;
	}
	public void setMis17(String mis17) {
		Mis17 = mis17;
	}
	public String getMis18() {
		return Mis18;
	}
	public void setMis18(String mis18) {
		Mis18 = mis18;
	}
	public String getMis19() {
		return Mis19;
	}
	public void setMis19(String mis19) {
		Mis19 = mis19;
	}
	public String getMis20() {
		return Mis20;
	}
	public void setMis20(String mis20) {
		Mis20 = mis20;
	}
	public String getMis21() {
		return Mis21;
	}
	public void setMis21(String mis21) {
		Mis21 = mis21;
	}
	public String getMis22() {
		return Mis22;
	}
	public void setMis22(String mis22) {
		Mis22 = mis22;
	}
	public String getMis23() {
		return Mis23;
	}
	public void setMis23(String mis23) {
		Mis23 = mis23;
	}
	public String getMis24() {
		return Mis24;
	}
	public void setMis24(String mis24) {
		Mis24 = mis24;
	}
	public String getMis25() {
		return Mis25;
	}
	public void setMis25(String mis25) {
		Mis25 = mis25;
	}
	public String getMis26() {
		return Mis26;
	}
	public void setMis26(String mis26) {
		Mis26 = mis26;
	}
	public String getMis27() {
		return Mis27;
	}
	public void setMis27(String mis27) {
		Mis27 = mis27;
	}
	public String getMis28() {
		return Mis28;
	}
	public void setMis28(String mis28) {
		Mis28 = mis28;
	}
	public String getMis29() {
		return Mis29;
	}
	public void setMis29(String mis29) {
		Mis29 = mis29;
	}
	public String getMis30() {
		return Mis30;
	}
	public void setMis30(String mis30) {
		Mis30 = mis30;
	}
	public String getFu1() {
		return Fu1;
	}
	public void setFu1(String fu1) {
		Fu1 = fu1;
	}
	public String getFu2() {
		return Fu2;
	}
	public void setFu2(String fu2) {
		Fu2 = fu2;
	}
	public String getFu3() {
		return Fu3;
	}
	public void setFu3(String fu3) {
		Fu3 = fu3;
	}
	public String getFu4() {
		return Fu4;
	}
	public void setFu4(String fu4) {
		Fu4 = fu4;
	}
	public String getFu5() {
		return Fu5;
	}
	public void setFu5(String fu5) {
		Fu5 = fu5;
	}
	public String getFu6() {
		return Fu6;
	}
	public void setFu6(String fu6) {
		Fu6 = fu6;
	}
	public String getFu7() {
		return Fu7;
	}
	public void setFu7(String fu7) {
		Fu7 = fu7;
	}
	public String getFu8() {
		return Fu8;
	}
	public void setFu8(String fu8) {
		Fu8 = fu8;
	}
	public String getFu9() {
		return Fu9;
	}
	public void setFu9(String fu9) {
		Fu9 = fu9;
	}
	public String getFu10() {
		return Fu10;
	}
	public void setFu10(String fu10) {
		Fu10 = fu10;
	}
	
		}
