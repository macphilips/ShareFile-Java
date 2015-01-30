
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
import com.sharefile.api.enumerations.SFSafeEnumFlags;
import com.sharefile.api.models.*;

public class SFZone extends SFPrincipal {

	@SerializedName("Secret")
	private String Secret;
	@SerializedName("ZoneType")
	private SFSafeEnum<SFZoneType> ZoneType;
	@SerializedName("Account")
	private SFAccount Account;
	@SerializedName("HeartBeatTolerance")
	private Integer HeartBeatTolerance;
	@SerializedName("PingBackInterval")
	private Integer PingBackInterval;
	@SerializedName("Version")
	private String Version;
	@SerializedName("ZoneServices")
	private SFSafeEnumFlags<SFZoneService> ZoneServices;
	@SerializedName("IsHIPAAZone")
	private Boolean IsHIPAAZone;
	@SerializedName("StorageCenters")
	private ArrayList<SFStorageCenter> StorageCenters;
	@SerializedName("Metadata")
	private ArrayList<SFMetadata> Metadata;

	public String getSecret() {
		return this.Secret;
	}

	public void setSecret(String secret) {
		this.Secret = secret;
	}
	public SFSafeEnum<SFZoneType> getZoneType() {
		return this.ZoneType;
	}

	public void setZoneType(SFSafeEnum<SFZoneType> zonetype) {
		this.ZoneType = zonetype;
	}
	public SFAccount getAccount() {
		return this.Account;
	}

	public void setAccount(SFAccount account) {
		this.Account = account;
	}
	public Integer getHeartBeatTolerance() {
		return this.HeartBeatTolerance;
	}

	public void setHeartBeatTolerance(Integer heartbeattolerance) {
		this.HeartBeatTolerance = heartbeattolerance;
	}
	public Integer getPingBackInterval() {
		return this.PingBackInterval;
	}

	public void setPingBackInterval(Integer pingbackinterval) {
		this.PingBackInterval = pingbackinterval;
	}
	public String getVersion() {
		return this.Version;
	}

	public void setVersion(String version) {
		this.Version = version;
	}
	public SFSafeEnumFlags<SFZoneService> getZoneServices() {
		return this.ZoneServices;
	}

	public void setZoneServices(SFSafeEnumFlags<SFZoneService> zoneservices) {
		this.ZoneServices = zoneservices;
	}
	public Boolean getIsHIPAAZone() {
		return this.IsHIPAAZone;
	}

	public void setIsHIPAAZone(Boolean ishipaazone) {
		this.IsHIPAAZone = ishipaazone;
	}
	public ArrayList<SFStorageCenter> getStorageCenters() {
		return this.StorageCenters;
	}

	public void setStorageCenters(ArrayList<SFStorageCenter> storagecenters) {
		this.StorageCenters = storagecenters;
	}
	public ArrayList<SFMetadata> getMetadata() {
		return this.Metadata;
	}

	public void setMetadata(ArrayList<SFMetadata> metadata) {
		this.Metadata = metadata;
	}

}