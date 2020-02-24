package com.tml.IRN;

import java.awt.event.ItemListener;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


@XmlAccessorType( XmlAccessType.FIELD )
/*@XmlType( name = "check",propOrder = {
		"User_GSTIN","TaxSch","TranDtls","DocDtls",
		"ExpDtls","MisColumns","FuColumns","TransportDtls","SellerDtls","BuyerDtls","DispDtls","ShipDtls","ValDtls","RefDtls","PayDtls"

}) */

/*@XmlType(name = "IRNInput", propOrder = {
    "User_GSTIN","TaxSch","is_irn"
})*/
public class IRNInput {
	protected String User_GSTIN;
    public String getTaxSch() {
		return TaxSch;
	}

	public void setTaxSch(String taxSch) {
		TaxSch = taxSch;
	}

	public String getIs_irn() {
		return is_irn;
	}

	public void setIs_irn(String is_irn) {
		this.is_irn = is_irn;
	}

	protected String TaxSch;
	protected String is_irn;
	
	public String getUser_GSTIN() {
		return User_GSTIN;
	}

	public void setUser_GSTIN(String user_GSTIN) {
		User_GSTIN = user_GSTIN;
	}
	
	@XmlElement(name="TranDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<TranDtlsObj> TranDtls ;
	
	@XmlElement(name="DocDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<DocDtlsObj> DocDtls ;
		
	@XmlElement(name="ExpDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<ExpDtlsObj> ExpDtls ;
	
	@XmlElement(name="MisColumns")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<MisColumnsObj> MisColumns ;
	
	@XmlElement(name="FuColumns")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<FuColumnsObj> FuColumns ;
	
	@XmlElement(name="TransportDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<TransportDtlsObj> TransportDtls ;
	
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
	
	@XmlElement(name="ValDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<ValDtlsObj> ValDtls ;
	
	@XmlElement(name="RefDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<RefDtlsObj> RefDtls ;
	
	@XmlElement(name="PayDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<PayDtlsObj> PayDtls ;
	
	@XmlElement(name="ItemList")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<ItemListObj> ItemList ;
	
	

}
