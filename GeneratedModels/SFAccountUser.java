
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

public class SFAccountUser extends SFUser {

	private Boolean mIsAdministrator;
	private Boolean mCanCreateFolders;
	private Boolean mCanUseFileBox;
	private Boolean mCanManageUsers;
	private Boolean mIsVirtualClient;
	private Integer mDiskSpace;
	private Integer mBandwidth;
	private Integer mStorageQuotaLimitGB;
	private Integer mStorageQuotaPercent;

	public Boolean getIsAdministrator() {
		return mIsAdministrator;
	}

	public void setIsAdministrator(Boolean isadministrator) {
		mIsAdministrator = isadministrator;
	}
	public Boolean getCanCreateFolders() {
		return mCanCreateFolders;
	}

	public void setCanCreateFolders(Boolean cancreatefolders) {
		mCanCreateFolders = cancreatefolders;
	}
	public Boolean getCanUseFileBox() {
		return mCanUseFileBox;
	}

	public void setCanUseFileBox(Boolean canusefilebox) {
		mCanUseFileBox = canusefilebox;
	}
	public Boolean getCanManageUsers() {
		return mCanManageUsers;
	}

	public void setCanManageUsers(Boolean canmanageusers) {
		mCanManageUsers = canmanageusers;
	}
	public Boolean getIsVirtualClient() {
		return mIsVirtualClient;
	}

	public void setIsVirtualClient(Boolean isvirtualclient) {
		mIsVirtualClient = isvirtualclient;
	}
	public Integer getDiskSpace() {
		return mDiskSpace;
	}

	public void setDiskSpace(Integer diskspace) {
		mDiskSpace = diskspace;
	}
	public Integer getBandwidth() {
		return mBandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		mBandwidth = bandwidth;
	}
	public Integer getStorageQuotaLimitGB() {
		return mStorageQuotaLimitGB;
	}

	public void setStorageQuotaLimitGB(Integer storagequotalimitgb) {
		mStorageQuotaLimitGB = storagequotalimitgb;
	}
	public Integer getStorageQuotaPercent() {
		return mStorageQuotaPercent;
	}

	public void setStorageQuotaPercent(Integer storagequotapercent) {
		mStorageQuotaPercent = storagequotapercent;
	}
}