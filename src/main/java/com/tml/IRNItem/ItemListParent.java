package com.tml.IRNItem;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tml.IRN.elementObj;

@XmlRootElement
@XmlType( name = "ItemListParent",propOrder = {"ItemList"}) 

public class ItemListParent {
	
	
	@XmlElement(name="ItemList")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	private List<ItemList> ItemList;

	/*public List<ItemList> getItemList() {
		return ItemList;
	}

	public void setItemList(List<ItemList> itemList) {
		ItemList = itemList;
	}*/

	
	


    
}
