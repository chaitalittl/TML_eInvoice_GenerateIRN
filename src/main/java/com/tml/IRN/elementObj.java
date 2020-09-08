package com.tml.IRN;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@XmlAccessorType( XmlAccessType.FIELD )
@JsonNaming(UpperCamelCaseStrategy.class)
@JsonInclude(Include.NON_NULL)
public class elementObj {
	
	@Size(min=1,max=6)
	@XmlElement(required = true)
	protected String SlNo;
	@Size(min=1,max=50)
	protected String OrdLineRef;
	@Size(min=1,max=20)
	protected String PrdSlNo;
	@Size(max=250)
	protected String ItemCode;
	@Size(min=3,max=100)
	protected String PrdNm;
	@Size(min=3,max=100)
	protected String PrdDesc;
	@Size(min=4,max=8)
	@XmlElement(required = true)
	protected String HsnCd;
	@XmlElement(required = true)
	protected String IsServc;
	@Size(min=3,max=30)
	protected String BarCde;
	
	@DecimalMin("0.0")
	@DecimalMax("9999999999.999")
	protected BigDecimal Qty;
	
	@DecimalMin("0.0")
	@DecimalMax("9999999999.999")
	protected BigDecimal FreeQty;
	
	protected String Unit;
	
	@DecimalMin("0.0")
	@DecimalMax("9999999999.999")
	@XmlElement(required = true)
	protected BigDecimal UnitPrice;
	@DecimalMin("0.0")
	@DecimalMax("9999999999.999")
	@XmlElement(required = true)
	protected BigDecimal TotAmt;
	@DecimalMin("0.0")
	@DecimalMax("9999999999.999")
	protected BigDecimal Discount;
	@DecimalMin("0.0")
	@DecimalMax("9999999999.999")
	protected BigDecimal OthChrg;
	
	@Size(min=0,max=17)
	protected int Vat;
	@Size(min=0,max=17)
	protected int CentralDxcise;
	
	@Size(min=0,max=17)
	protected int StateExcise;
	@Size(min=0,max=17)
	protected int ValueBeforeBcd;
	@Size(min=0,max=17)
	protected int Bcd;
	@DecimalMin("0.0")
	@DecimalMax("9999999999.999")
	protected BigDecimal PreTaxVal;
	@DecimalMin("0.0")
	@DecimalMax("9999999999.999")
	@XmlElement(required = true)
	protected BigDecimal AssAmt;
	@XmlElement(required = true)
	protected int GstRt;
	protected String CgstRt;
	protected String SgstRt;
	protected String IgstRt;
	@DecimalMin("0.0")
	@DecimalMax("999.999")
	protected BigDecimal CesRt;
	@Size(min=0,max=17)
	protected String CesNonAdVal;
	@DecimalMin("0.0")
	@DecimalMax("999.999")
	protected BigDecimal StateCesRt;
	protected BigDecimal IgstAmt;
	protected BigDecimal CgstAmt;
	protected BigDecimal SgstAmt;
	protected BigDecimal CessAmt;
	protected BigDecimal CesNonAdvlAmt;
	protected BigDecimal StateCesAmt;
	protected BigDecimal StateCesNonAdvlAmt;
	@XmlElement(required = true)
	protected BigDecimal TotItemVal;
	protected String OrgCntry;
	
	@XmlElement(name="BchDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected BchDtlsObj BchDtls ;
	
	@XmlElement(name="AttribDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<AttribDtlsObj> AttribDtls;
	
	@XmlElement(name="WhtItem")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected WhtItemObj WhtItem ;
	
	protected String EligibilityItc;
	protected BigDecimal ItcIgst;
	protected BigDecimal ItcCgst;
	protected BigDecimal ItcSgst;
	protected BigDecimal ItcCess;
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
	public BigDecimal getQty() {
		return Qty;
	}
	public void setQty(BigDecimal qty) {
		Qty = qty;
	}
	public BigDecimal getFreeQty() {
		return FreeQty;
	}
	public void setFreeQty(BigDecimal freeQty) {
		FreeQty = freeQty;
	}
	public String getUnit() {
		return Unit;
	}
	public void setUnit(String unit) {
		Unit = unit;
	}
	public BigDecimal getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		UnitPrice = unitPrice;
	}
	public BigDecimal getTotAmt() {
		return TotAmt;
	}
	public void setTotAmt(BigDecimal totAmt) {
		TotAmt = totAmt;
	}
	public BigDecimal getDiscount() {
		return Discount;
	}
	public void setDiscount(BigDecimal discount) {
		Discount = discount;
	}
	public BigDecimal getOthChrg() {
		return OthChrg;
	}
	public void setOthChrg(BigDecimal othChrg) {
		OthChrg = othChrg;
	}
	public int getVat() {
		return Vat;
	}
	public void setVat(int vat) {
		Vat = vat;
	}
	public int getCentralDxcise() {
		return CentralDxcise;
	}
	public void setCentralDxcise(int centralDxcise) {
		CentralDxcise = centralDxcise;
	}
	public int getStateExcise() {
		return StateExcise;
	}
	public void setStateExcise(int stateExcise) {
		StateExcise = stateExcise;
	}
	public int getValueBeforeBcd() {
		return ValueBeforeBcd;
	}
	public void setValueBeforeBcd(int valueBeforeBcd) {
		ValueBeforeBcd = valueBeforeBcd;
	}
	public int getBcd() {
		return Bcd;
	}
	public void setBcd(int bcd) {
		Bcd = bcd;
	}
	public BigDecimal getPreTaxVal() {
		return PreTaxVal;
	}
	public void setPreTaxVal(BigDecimal preTaxVal) {
		PreTaxVal = preTaxVal;
	}
	public BigDecimal getAssAmt() {
		return AssAmt;
	}
	public void setAssAmt(BigDecimal assAmt) {
		AssAmt = assAmt;
	}
	public int getGstRt() {
		return GstRt;
	}
	public void setGstRt(int gstRt) {
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
	public BigDecimal getCesRt() {
		return CesRt;
	}
	public void setCesRt(BigDecimal cesRt) {
		CesRt = cesRt;
	}
	public String getCesNonAdVal() {
		return CesNonAdVal;
	}
	public void setCesNonAdVal(String cesNonAdVal) {
		CesNonAdVal = cesNonAdVal;
	}
	public BigDecimal getStateCesRt() {
		return StateCesRt;
	}
	public void setStateCesRt(BigDecimal stateCesRt) {
		StateCesRt = stateCesRt;
	}
	public BigDecimal getIgstAmt() {
		return IgstAmt;
	}
	public void setIgstAmt(BigDecimal igstAmt) {
		IgstAmt = igstAmt;
	}
	public BigDecimal getCgstAmt() {
		return CgstAmt;
	}
	public void setCgstAmt(BigDecimal cgstAmt) {
		CgstAmt = cgstAmt;
	}
	public BigDecimal getSgstAmt() {
		return SgstAmt;
	}
	public void setSgstAmt(BigDecimal sgstAmt) {
		SgstAmt = sgstAmt;
	}
	public BigDecimal getCessAmt() {
		return CessAmt;
	}
	public void setCessAmt(BigDecimal cessAmt) {
		CessAmt = cessAmt;
	}
	public BigDecimal getCesNonAdvlAmt() {
		return CesNonAdvlAmt;
	}
	public void setCesNonAdvlAmt(BigDecimal cesNonAdvlAmt) {
		CesNonAdvlAmt = cesNonAdvlAmt;
	}
	public BigDecimal getStateCesAmt() {
		return StateCesAmt;
	}
	public void setStateCesAmt(BigDecimal stateCesAmt) {
		StateCesAmt = stateCesAmt;
	}
	public BigDecimal getStateCesNonAdvlAmt() {
		return StateCesNonAdvlAmt;
	}
	public void setStateCesNonAdvlAmt(BigDecimal stateCesNonAdvlAmt) {
		StateCesNonAdvlAmt = stateCesNonAdvlAmt;
	}
	public BigDecimal getTotItemVal() {
		return TotItemVal;
	}
	public void setTotItemVal(BigDecimal totItemVal) {
		TotItemVal = totItemVal;
	}
	public String getOrgCntry() {
		return OrgCntry;
	}
	public void setOrgCntry(String orgCntry) {
		OrgCntry = orgCntry;
	}
	public String getEligibilityItc() {
		return EligibilityItc;
	}
	public void setEligibilityItc(String eligibilityItc) {
		EligibilityItc = eligibilityItc;
	}
	public BigDecimal getItcIgst() {
		return ItcIgst;
	}
	public void setItcIgst(BigDecimal itcIgst) {
		ItcIgst = itcIgst;
	}
	public BigDecimal getItcCgst() {
		return ItcCgst;
	}
	public void setItcCgst(BigDecimal itcCgst) {
		ItcCgst = itcCgst;
	}
	public BigDecimal getItcSgst() {
		return ItcSgst;
	}
	public void setItcSgst(BigDecimal itcSgst) {
		ItcSgst = itcSgst;
	}
	public BigDecimal getItcCess() {
		return ItcCess;
	}
	public void setItcCess(BigDecimal itcCess) {
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
