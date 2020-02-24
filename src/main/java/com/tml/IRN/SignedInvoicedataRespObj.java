package com.tml.IRN;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonFormat;

@XmlType(name = "SignedInvoicedataRespObj") 

@XmlRootElement(name = "SignedInvoicedataRespObj")

public class SignedInvoicedataRespObj {
	
	public String getAckNo() {
		return AckNo;
	}

	public void setAckNo(String ackNo) {
		AckNo = ackNo;
	}

	public String getAckDt() {
		return AckDt;
	}

	public void setAckDt(String ackDt) {
		AckDt = ackDt;
	}

	public String getTaxSch() {
		return TaxSch;
	}

	public void setTaxSch(String taxSch) {
		TaxSch = taxSch;
	}

	public String getVersion() {
		return Version;
	}

	public void setVersion(String version) {
		Version = version;
	}

	public String getIrn() {
		return Irn;
	}

	public void setIrn(String irn) {
		Irn = irn;
	}

	public String getIss() {
		return iss;
	}

	public void setIss(String iss) {
		this.iss = iss;
	}

	String AckNo;
	String AckDt;
	String TaxSch;
	String Version;
	String Irn;
	String iss;
	
	@XmlElement(name="TranDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<TranDtlsObj> TranDtls ;
	
	@XmlElement(name="DocDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<DocDtlsObj> DocDtls ;
	
	@XmlElement(name="SellerDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<SellerDtlsObj> SellerDtls ;
	
	@XmlElement(name="BuyerDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<BuyerDtlsObj> BuyerDtls ;
	
	@XmlElement(name="DispDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<DispDtlsObj> DispDtls ;
	
	@XmlElement(name="ShipDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<ShipDtlsObj> ShipDtls ;

	
	@XmlElement(name="ItemList")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<ItemListObj> ItemList ;
	
	@XmlElement(name="ValDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<ValDtlsObj> ValDtls ;
	
	@XmlElement(name="ExpDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<ExpDtlsObj> ExpDtls ;
	
	@XmlElement(name="PayDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<PayDtlsObj> PayDtls ;
	
	@XmlElement(name="RefDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<RefDtlsObj> RefDtls ;
	

	
	
	
	
}
