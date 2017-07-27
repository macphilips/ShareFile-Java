
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

public class SFAddress extends SFODataObject {

	@SerializedName("StreetAddress1")
	private String StreetAddress1;
	@SerializedName("StreetAddress2")
	private String StreetAddress2;
	@SerializedName("City")
	private String City;
	@SerializedName("StateOrProvince")
	private String StateOrProvince;
	@SerializedName("PostalCode")
	private String PostalCode;
	@SerializedName("Country")
	private String Country;
	@SerializedName("TaxAreaId")
	private String TaxAreaId;

	public String getStreetAddress1() {
		return this.StreetAddress1;
	}

	public void setStreetAddress1(String streetaddress1) {
		this.StreetAddress1 = streetaddress1;
	}
	public String getStreetAddress2() {
		return this.StreetAddress2;
	}

	public void setStreetAddress2(String streetaddress2) {
		this.StreetAddress2 = streetaddress2;
	}
	public String getCity() {
		return this.City;
	}

	public void setCity(String city) {
		this.City = city;
	}
	public String getStateOrProvince() {
		return this.StateOrProvince;
	}

	public void setStateOrProvince(String stateorprovince) {
		this.StateOrProvince = stateorprovince;
	}
	public String getPostalCode() {
		return this.PostalCode;
	}

	public void setPostalCode(String postalcode) {
		this.PostalCode = postalcode;
	}
	public String getCountry() {
		return this.Country;
	}

	public void setCountry(String country) {
		this.Country = country;
	}
	public String getTaxAreaId() {
		return this.TaxAreaId;
	}

	public void setTaxAreaId(String taxareaid) {
		this.TaxAreaId = taxareaid;
	}

}