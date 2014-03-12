
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

import java.util.ArrayList;

public class SFZone extends SFPrincipal {

	private String Secret;
	private SFZoneType ZoneType;
	private SFAccount Account;
	private Integer HeartBeatTolerance;
	private Integer PingBackInterval;
	private String Version;
	private SFZoneService ZoneServices;
	private ArrayList<SFStorageCenter> StorageCenters;
	private ArrayList<SFMetadata> Metadata;

	public String getSecret() {
		return Secret;
	}

	public void setSecret(String secret) {
		Secret = secret;
	}
	public SFZoneType getZoneType() {
		return ZoneType;
	}

	public void setZoneType(SFZoneType zonetype) {
		ZoneType = zonetype;
	}
	public SFAccount getAccount() {
		return Account;
	}

	public void setAccount(SFAccount account) {
		Account = account;
	}
	public Integer getHeartBeatTolerance() {
		return HeartBeatTolerance;
	}

	public void setHeartBeatTolerance(Integer heartbeattolerance) {
		HeartBeatTolerance = heartbeattolerance;
	}
	public Integer getPingBackInterval() {
		return PingBackInterval;
	}

	public void setPingBackInterval(Integer pingbackinterval) {
		PingBackInterval = pingbackinterval;
	}
	public String getVersion() {
		return Version;
	}

	public void setVersion(String version) {
		Version = version;
	}
	public SFZoneService getZoneServices() {
		return ZoneServices;
	}

	public void setZoneServices(SFZoneService zoneservices) {
		ZoneServices = zoneservices;
	}
	public ArrayList<SFStorageCenter> getStorageCenters() {
		return StorageCenters;
	}

	public void setStorageCenters(ArrayList<SFStorageCenter> storagecenters) {
		StorageCenters = storagecenters;
	}
	public ArrayList<SFMetadata> getMetadata() {
		return Metadata;
	}

	public void setMetadata(ArrayList<SFMetadata> metadata) {
		Metadata = metadata;
	}
}