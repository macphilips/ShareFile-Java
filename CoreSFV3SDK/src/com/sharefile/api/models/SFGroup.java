
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2014 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.sharefile.api.models;

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;
import com.sharefile.api.models.*;

public class SFGroup extends SFPrincipal {

	@SerializedName("Owner")
	private SFUser Owner;
	@SerializedName("Account")
	private SFAccount Account;
	@SerializedName("IsShared")
	private Boolean IsShared;
	@SerializedName("Contacts")
	private ArrayList<SFContact> Contacts;

	public SFUser getOwner() {
		return Owner;
	}

	public void setOwner(SFUser owner) {
		Owner = owner;
	}
	public SFAccount getAccount() {
		return Account;
	}

	public void setAccount(SFAccount account) {
		Account = account;
	}
	public Boolean getIsShared() {
		return IsShared;
	}

	public void setIsShared(Boolean isshared) {
		IsShared = isshared;
	}
	public ArrayList<SFContact> getContacts() {
		return Contacts;
	}

	public void setContacts(ArrayList<SFContact> contacts) {
		Contacts = contacts;
	}

}