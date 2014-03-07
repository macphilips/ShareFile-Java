
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

public class SFAccount extends SFODataObject {

	private String mCompanyName;
	private SFUser mBillingContact;
	private SFUser mTechnicalContact;
	private SFUser mAccountManager;
	private String mPlanName;
	private String mPlanTrack;
	private String mPlanTrackEnum;
	private String mBillingType;
	private String mBillingCycle;
	private Double mBillingRate;
	private Double mBaseBillingRate;
	private Integer mBaseBandwidth;
	private Integer mBaseDiskSpace;
	private Integer mBaseUsers;
	private Integer mAdditionalBandwidth;
	private Integer mAdditionalDiskSpace;
	private Integer mAdditionalUsers;
	private Double mAdditionalBandwidthRate;
	private Double mAdditionalDiskSpaceRate;
	private Double mAdditionalUserRate;
	private Integer mUserMax;
	private Integer mDiskSpaceMax;
	private Integer mBandwidthMax;
	private Boolean mHasPowerTools;
	private Boolean mHasEncryption;
	private Double mPowerToolsRate;
	private Double mEncryptionRate;
	private String mAddress1;
	private String mAddress2;
	private String mCity;
	private String mState;
	private String mZip;
	private String mCountry;
	private String mPhone;
	private Date mLastBillingDate;
	private Date mNextBillingDate;
	private Boolean mUseAdvancedCustomBranding;
	private String mAdvancedCustomBrandingFolderName;
	private Map<String, String> mBrandingStyles;
	private String mLogoURL;
	private SFItem mRootItem;
	private Date mCreationDate;
	private Boolean mIsFreeTrial;
	private Boolean mIsCancelled;
	private Date mCancellationDate;
	private SFSSOAccountProvider mSSO;
	private SFAccountPreferences mPreferences;
	private SFProductDefaults mProductDefaults;
	private String mSubdomain;
	private SFMobileSecuritySettings mMobileSecuritySettings;
	private SFAccessControlDomains mLoginAccessControlDomains;
	private SFAccessControlDomains mFolderAccessControlDomains;
	private Integer mStorageQuotaPerUser;

	public String getCompanyName() {
		return mCompanyName;
	}

	public void setCompanyName(String companyname) {
		mCompanyName = companyname;
	}
	public SFUser getBillingContact() {
		return mBillingContact;
	}

	public void setBillingContact(SFUser billingcontact) {
		mBillingContact = billingcontact;
	}
	public SFUser getTechnicalContact() {
		return mTechnicalContact;
	}

	public void setTechnicalContact(SFUser technicalcontact) {
		mTechnicalContact = technicalcontact;
	}
	public SFUser getAccountManager() {
		return mAccountManager;
	}

	public void setAccountManager(SFUser accountmanager) {
		mAccountManager = accountmanager;
	}
		/**
		* Basic, Professional, Enterprise
		*/
	public String getPlanName() {
		return mPlanName;
	}

		/**
		* Basic, Professional, Enterprise
		*/
	public void setPlanName(String planname) {
		mPlanName = planname;
	}
	public String getPlanTrack() {
		return mPlanTrack;
	}

	public void setPlanTrack(String plantrack) {
		mPlanTrack = plantrack;
	}
	public String getPlanTrackEnum() {
		return mPlanTrackEnum;
	}

	public void setPlanTrackEnum(String plantrackenum) {
		mPlanTrackEnum = plantrackenum;
	}
		/**
		* Credit Card, Invoice, Comp
		*/
	public String getBillingType() {
		return mBillingType;
	}

		/**
		* Credit Card, Invoice, Comp
		*/
	public void setBillingType(String billingtype) {
		mBillingType = billingtype;
	}
		/**
		* Monthly, Quarterly, Annually
		*/
	public String getBillingCycle() {
		return mBillingCycle;
	}

		/**
		* Monthly, Quarterly, Annually
		*/
	public void setBillingCycle(String billingcycle) {
		mBillingCycle = billingcycle;
	}
	public Double getBillingRate() {
		return mBillingRate;
	}

	public void setBillingRate(Double billingrate) {
		mBillingRate = billingrate;
	}
	public Double getBaseBillingRate() {
		return mBaseBillingRate;
	}

	public void setBaseBillingRate(Double basebillingrate) {
		mBaseBillingRate = basebillingrate;
	}
		/**
		* Bandwidth included in plan in megabytes
		*/
	public Integer getBaseBandwidth() {
		return mBaseBandwidth;
	}

		/**
		* Bandwidth included in plan in megabytes
		*/
	public void setBaseBandwidth(Integer basebandwidth) {
		mBaseBandwidth = basebandwidth;
	}
		/**
		* Disk space included in megabytes
		*/
	public Integer getBaseDiskSpace() {
		return mBaseDiskSpace;
	}

		/**
		* Disk space included in megabytes
		*/
	public void setBaseDiskSpace(Integer basediskspace) {
		mBaseDiskSpace = basediskspace;
	}
		/**
		* Users included in plan
		*/
	public Integer getBaseUsers() {
		return mBaseUsers;
	}

		/**
		* Users included in plan
		*/
	public void setBaseUsers(Integer baseusers) {
		mBaseUsers = baseusers;
	}
		/**
		* Additional bandwidth purchased for account
		*/
	public Integer getAdditionalBandwidth() {
		return mAdditionalBandwidth;
	}

		/**
		* Additional bandwidth purchased for account
		*/
	public void setAdditionalBandwidth(Integer additionalbandwidth) {
		mAdditionalBandwidth = additionalbandwidth;
	}
		/**
		* Additional disk space purchased for account
		*/
	public Integer getAdditionalDiskSpace() {
		return mAdditionalDiskSpace;
	}

		/**
		* Additional disk space purchased for account
		*/
	public void setAdditionalDiskSpace(Integer additionaldiskspace) {
		mAdditionalDiskSpace = additionaldiskspace;
	}
		/**
		* Additional users purchased for account
		*/
	public Integer getAdditionalUsers() {
		return mAdditionalUsers;
	}

		/**
		* Additional users purchased for account
		*/
	public void setAdditionalUsers(Integer additionalusers) {
		mAdditionalUsers = additionalusers;
	}
		/**
		* Additional rate for extra bandwidth. NOTE: This is specified in gigbytes, not megabytes.
		*/
	public Double getAdditionalBandwidthRate() {
		return mAdditionalBandwidthRate;
	}

		/**
		* Additional rate for extra bandwidth. NOTE: This is specified in gigbytes, not megabytes.
		*/
	public void setAdditionalBandwidthRate(Double additionalbandwidthrate) {
		mAdditionalBandwidthRate = additionalbandwidthrate;
	}
		/**
		* Additional rate for extra diskspace. NOTE: This is specified in gigbytes, not megabytes.
		*/
	public Double getAdditionalDiskSpaceRate() {
		return mAdditionalDiskSpaceRate;
	}

		/**
		* Additional rate for extra diskspace. NOTE: This is specified in gigbytes, not megabytes.
		*/
	public void setAdditionalDiskSpaceRate(Double additionaldiskspacerate) {
		mAdditionalDiskSpaceRate = additionaldiskspacerate;
	}
		/**
		* Additional rate for extra users
		*/
	public Double getAdditionalUserRate() {
		return mAdditionalUserRate;
	}

		/**
		* Additional rate for extra users
		*/
	public void setAdditionalUserRate(Double additionaluserrate) {
		mAdditionalUserRate = additionaluserrate;
	}
	public Integer getUserMax() {
		return mUserMax;
	}

	public void setUserMax(Integer usermax) {
		mUserMax = usermax;
	}
		/**
		* Maximum disk space for the account in megabtyes
		*/
	public Integer getDiskSpaceMax() {
		return mDiskSpaceMax;
	}

		/**
		* Maximum disk space for the account in megabtyes
		*/
	public void setDiskSpaceMax(Integer diskspacemax) {
		mDiskSpaceMax = diskspacemax;
	}
		/**
		* Maximum bandwidth for the account in megabtyes
		*/
	public Integer getBandwidthMax() {
		return mBandwidthMax;
	}

		/**
		* Maximum bandwidth for the account in megabtyes
		*/
	public void setBandwidthMax(Integer bandwidthmax) {
		mBandwidthMax = bandwidthmax;
	}
	public Boolean getHasPowerTools() {
		return mHasPowerTools;
	}

	public void setHasPowerTools(Boolean haspowertools) {
		mHasPowerTools = haspowertools;
	}
	public Boolean getHasEncryption() {
		return mHasEncryption;
	}

	public void setHasEncryption(Boolean hasencryption) {
		mHasEncryption = hasencryption;
	}
		/**
		* Additional rate for adding PowerTools.
		*/
	public Double getPowerToolsRate() {
		return mPowerToolsRate;
	}

		/**
		* Additional rate for adding PowerTools.
		*/
	public void setPowerToolsRate(Double powertoolsrate) {
		mPowerToolsRate = powertoolsrate;
	}
		/**
		* Additional rate for stored file encryption
		*/
	public Double getEncryptionRate() {
		return mEncryptionRate;
	}

		/**
		* Additional rate for stored file encryption
		*/
	public void setEncryptionRate(Double encryptionrate) {
		mEncryptionRate = encryptionrate;
	}
	public String getAddress1() {
		return mAddress1;
	}

	public void setAddress1(String address1) {
		mAddress1 = address1;
	}
	public String getAddress2() {
		return mAddress2;
	}

	public void setAddress2(String address2) {
		mAddress2 = address2;
	}
	public String getCity() {
		return mCity;
	}

	public void setCity(String city) {
		mCity = city;
	}
	public String getState() {
		return mState;
	}

	public void setState(String state) {
		mState = state;
	}
	public String getZip() {
		return mZip;
	}

	public void setZip(String zip) {
		mZip = zip;
	}
	public String getCountry() {
		return mCountry;
	}

	public void setCountry(String country) {
		mCountry = country;
	}
	public String getPhone() {
		return mPhone;
	}

	public void setPhone(String phone) {
		mPhone = phone;
	}
	public Date getLastBillingDate() {
		return mLastBillingDate;
	}

	public void setLastBillingDate(Date lastbillingdate) {
		mLastBillingDate = lastbillingdate;
	}
	public Date getNextBillingDate() {
		return mNextBillingDate;
	}

	public void setNextBillingDate(Date nextbillingdate) {
		mNextBillingDate = nextbillingdate;
	}
	public Boolean getUseAdvancedCustomBranding() {
		return mUseAdvancedCustomBranding;
	}

	public void setUseAdvancedCustomBranding(Boolean useadvancedcustombranding) {
		mUseAdvancedCustomBranding = useadvancedcustombranding;
	}
	public String getAdvancedCustomBrandingFolderName() {
		return mAdvancedCustomBrandingFolderName;
	}

	public void setAdvancedCustomBrandingFolderName(String advancedcustombrandingfoldername) {
		mAdvancedCustomBrandingFolderName = advancedcustombrandingfoldername;
	}
	public Map<String, String> getBrandingStyles() {
		return mBrandingStyles;
	}

	public void setBrandingStyles(Map<String, String> brandingstyles) {
		mBrandingStyles = brandingstyles;
	}
	public String getLogoURL() {
		return mLogoURL;
	}

	public void setLogoURL(String logourl) {
		mLogoURL = logourl;
	}
	public SFItem getRootItem() {
		return mRootItem;
	}

	public void setRootItem(SFItem rootitem) {
		mRootItem = rootitem;
	}
	public Date getCreationDate() {
		return mCreationDate;
	}

	public void setCreationDate(Date creationdate) {
		mCreationDate = creationdate;
	}
	public Boolean getIsFreeTrial() {
		return mIsFreeTrial;
	}

	public void setIsFreeTrial(Boolean isfreetrial) {
		mIsFreeTrial = isfreetrial;
	}
	public Boolean getIsCancelled() {
		return mIsCancelled;
	}

	public void setIsCancelled(Boolean iscancelled) {
		mIsCancelled = iscancelled;
	}
	public Date getCancellationDate() {
		return mCancellationDate;
	}

	public void setCancellationDate(Date cancellationdate) {
		mCancellationDate = cancellationdate;
	}
	public SFSSOAccountProvider getSSO() {
		return mSSO;
	}

	public void setSSO(SFSSOAccountProvider sso) {
		mSSO = sso;
	}
	public SFAccountPreferences getPreferences() {
		return mPreferences;
	}

	public void setPreferences(SFAccountPreferences preferences) {
		mPreferences = preferences;
	}
	public SFProductDefaults getProductDefaults() {
		return mProductDefaults;
	}

	public void setProductDefaults(SFProductDefaults productdefaults) {
		mProductDefaults = productdefaults;
	}
	public String getSubdomain() {
		return mSubdomain;
	}

	public void setSubdomain(String subdomain) {
		mSubdomain = subdomain;
	}
	public SFMobileSecuritySettings getMobileSecuritySettings() {
		return mMobileSecuritySettings;
	}

	public void setMobileSecuritySettings(SFMobileSecuritySettings mobilesecuritysettings) {
		mMobileSecuritySettings = mobilesecuritysettings;
	}
	public SFAccessControlDomains getLoginAccessControlDomains() {
		return mLoginAccessControlDomains;
	}

	public void setLoginAccessControlDomains(SFAccessControlDomains loginaccesscontroldomains) {
		mLoginAccessControlDomains = loginaccesscontroldomains;
	}
	public SFAccessControlDomains getFolderAccessControlDomains() {
		return mFolderAccessControlDomains;
	}

	public void setFolderAccessControlDomains(SFAccessControlDomains folderaccesscontroldomains) {
		mFolderAccessControlDomains = folderaccesscontroldomains;
	}
	public Integer getStorageQuotaPerUser() {
		return mStorageQuotaPerUser;
	}

	public void setStorageQuotaPerUser(Integer storagequotaperuser) {
		mStorageQuotaPerUser = storagequotaperuser;
	}
}