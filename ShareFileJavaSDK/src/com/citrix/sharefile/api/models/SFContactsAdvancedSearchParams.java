
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2017 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.citrix.sharefile.api.models;

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.citrix.sharefile.api.*;
import com.citrix.sharefile.api.enumerations.*;
import com.citrix.sharefile.api.models.*;

public class SFContactsAdvancedSearchParams extends SFODataObject {

	@SerializedName("SearchText")
	private String SearchText;
	@SerializedName("FieldSelector")
	private SFSearchTextFieldSelector FieldSelector;
	@SerializedName("ListSelectionParams")
	private SFContactsListSelectionParams ListSelectionParams;

		/**
		* Search text
		*/
	public String getSearchText() {
		return this.SearchText;
	}

		/**
		* Search text
		*/
	public void setSearchText(String searchtext) {
		this.SearchText = searchtext;
	}
		/**
		* Fields to search
		*/
	public SFSearchTextFieldSelector getFieldSelector() {
		return this.FieldSelector;
	}

		/**
		* Fields to search
		*/
	public void setFieldSelector(SFSearchTextFieldSelector fieldselector) {
		this.FieldSelector = fieldselector;
	}
		/**
		* Types of contact lists to filter on
		*/
	public SFContactsListSelectionParams getListSelectionParams() {
		return this.ListSelectionParams;
	}

		/**
		* Types of contact lists to filter on
		*/
	public void setListSelectionParams(SFContactsListSelectionParams listselectionparams) {
		this.ListSelectionParams = listselectionparams;
	}

}