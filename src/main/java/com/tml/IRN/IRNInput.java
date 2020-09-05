package com.tml.IRN;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonFormat;

@XmlAccessorType( XmlAccessType.FIELD )
public class IRNInput {
	
	protected String User_GSTIN;
	protected String IRN;
	protected String SourceSystem;
	protected String is_irn;
	protected String is_ewb;
	protected String email;
	
	public String getUser_GSTIN() {
		return User_GSTIN;
	}

	public void setUser_GSTIN(String user_GSTIN) {
		User_GSTIN = user_GSTIN;
	}
	
	public String getIRN() {
			return IRN;
	}

	public void setIRN(String iRN) {
			IRN = iRN;
	}
	
	public String getIs_irn() {
		return is_irn;
	}

	public void setIs_irn(String is_irn) {
		this.is_irn = is_irn;
	}
	
	public String getIs_ewb() {
		return is_ewb;
	}

	public void setIs_ewb(String is_ewb) {
		this.is_ewb = is_ewb;
	}
	
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
	
	@XmlElement(name="PayDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<PayDtlsObj> PayDtls ;
	
	@XmlElement(name="RefDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<RefDtlsObj> RefDtls ;
	
	@XmlElement(name="AddlDocDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<AddlDocDtlsObj> AddlDocDtls ;
		
	@XmlElement(name="ExpDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<ExpDtlsObj> ExpDtls ;
	
	@XmlElement(name="EwbDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<EwbDtlsObj> EwbDtls ;
	
	@XmlElement(name="WhtHdrsDtls")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<WhtHdrsDtlsObj> WhtHdrsDtls ;
	
	@XmlElement(name="MisColumns")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<MisColumnsObj> MisColumns ;
	
	@XmlElement(name="FuColumns")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<FuColumnsObj> FuColumns ;

	public String getSourceSystem() {
		return SourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		SourceSystem = sourceSystem;
	}
	
}
