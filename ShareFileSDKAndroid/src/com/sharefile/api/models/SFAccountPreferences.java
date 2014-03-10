
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

import com.sharefile.api.enumerations.SFUXMode;

public class SFAccountPreferences extends SFODataObject {

	private Boolean mEnableViewOnly;
	private Boolean mEnableWatermarkOnViewOnly;
	private Boolean mAllowProactiveNotifications;
	private Boolean mShowUserListToClients;
	private Boolean mRequireLoginOnDownload;
	private Boolean mRequireLoginByDefault;
	private Boolean mEnableClientSend;
	private Boolean mEnableThumbnails;
	private Boolean mEnableSSO;
	private Integer mVirusStrictness;
	private Boolean mEnableSfAdi;
	private Boolean mEnableMultipleZones;
	private SFZone mDefaultZone;
	private Boolean mEnableVersioning;
	private String mSystemType;
	private Boolean mEnableSync;
	private String mSystemName;
	private String mHomeScreenName;
	private Boolean mShowTermsCheckbox;
	private String mTermsCheckboxText;
	private Integer mTermsCheckboxStrictness;
	private Boolean mRequireCompanyNameWithUserInfo;
	private Boolean mEnableEditor;
	private Integer mShareIDMaxExpirationDays;
	private Boolean mAdminIsSuperUser;
	private Boolean mShowFolderAccessList;
	private Boolean mFromEmailIsShareFile;
	private Boolean mUseAlternateSMTP;
	private Boolean mShowPasswordInEmail;
	private String mEmailPasswordText;
	private Boolean mEnableSelfNotificationsUpload;
	private Boolean mEnableSelfNotificationsDownload;
	private Boolean mEnableUploadShareIDReceipt;
	private Integer mDefaultConsolidatedNotificationInterval;
	private Integer mExpirationDays;
	private String mDefaultSortField;
	private String mDefaultSortOrder;
	private Boolean mDefaultIsVersioned;
	private Integer mDefaultMaxVersions;
	private String mViewOnlyWatermarkText;
	private Boolean mEnableDocViewerPrinting;
	private Boolean mEnableWatermarkedDownloads;
	private Boolean mEnableCaseSensitivePasswords;
	private Boolean mEnableTwoFactorAuth;
	private Integer mLoginFailMaxAttempts;
	private Integer mLoginFailLockoutSecs;
	private String mIPRestrictions;
	private Integer mInactiveTimeoutMins;
	private Integer mOAuth2RefreshTokenLifetimeMinutes;
	private String mPasswordRegEx;
	private String mPasswordRegExFormula;
	private String mPasswordRegExDescription;
	private Boolean mEnableActivationLinks;
	private Boolean mIsFINRA;
	private Boolean mEnableOAuth;
	private Boolean mEnableQandA;
	private Boolean mEnableQandATextInNotifications;
	private SFUXMode mUXMode;
	private Integer mPasswordMaxAgeDays;
	private Integer mPasswordHistoryCount;
	private Integer mMinimumLength;
	private Boolean mAlphaRequired;
	private Boolean mCaseRequired;
	private Boolean mNumericRequired;
	private Boolean mSpecialRequired;
	private String mAllowedSpecialCharacters;
	private String mAccountID;

	public Boolean getEnableViewOnly() {
		return mEnableViewOnly;
	}

	public void setEnableViewOnly(Boolean enableviewonly) {
		mEnableViewOnly = enableviewonly;
	}
	public Boolean getEnableWatermarkOnViewOnly() {
		return mEnableWatermarkOnViewOnly;
	}

	public void setEnableWatermarkOnViewOnly(Boolean enablewatermarkonviewonly) {
		mEnableWatermarkOnViewOnly = enablewatermarkonviewonly;
	}
	public Boolean getAllowProactiveNotifications() {
		return mAllowProactiveNotifications;
	}

	public void setAllowProactiveNotifications(Boolean allowproactivenotifications) {
		mAllowProactiveNotifications = allowproactivenotifications;
	}
	public Boolean getShowUserListToClients() {
		return mShowUserListToClients;
	}

	public void setShowUserListToClients(Boolean showuserlisttoclients) {
		mShowUserListToClients = showuserlisttoclients;
	}
	public Boolean getRequireLoginOnDownload() {
		return mRequireLoginOnDownload;
	}

	public void setRequireLoginOnDownload(Boolean requireloginondownload) {
		mRequireLoginOnDownload = requireloginondownload;
	}
	public Boolean getRequireLoginByDefault() {
		return mRequireLoginByDefault;
	}

	public void setRequireLoginByDefault(Boolean requireloginbydefault) {
		mRequireLoginByDefault = requireloginbydefault;
	}
	public Boolean getEnableClientSend() {
		return mEnableClientSend;
	}

	public void setEnableClientSend(Boolean enableclientsend) {
		mEnableClientSend = enableclientsend;
	}
	public Boolean getEnableThumbnails() {
		return mEnableThumbnails;
	}

	public void setEnableThumbnails(Boolean enablethumbnails) {
		mEnableThumbnails = enablethumbnails;
	}
	public Boolean getEnableSSO() {
		return mEnableSSO;
	}

	public void setEnableSSO(Boolean enablesso) {
		mEnableSSO = enablesso;
	}
	public Integer getVirusStrictness() {
		return mVirusStrictness;
	}

	public void setVirusStrictness(Integer virusstrictness) {
		mVirusStrictness = virusstrictness;
	}
	public Boolean getEnableSfAdi() {
		return mEnableSfAdi;
	}

	public void setEnableSfAdi(Boolean enablesfadi) {
		mEnableSfAdi = enablesfadi;
	}
	public Boolean getEnableMultipleZones() {
		return mEnableMultipleZones;
	}

	public void setEnableMultipleZones(Boolean enablemultiplezones) {
		mEnableMultipleZones = enablemultiplezones;
	}
	public SFZone getDefaultZone() {
		return mDefaultZone;
	}

	public void setDefaultZone(SFZone defaultzone) {
		mDefaultZone = defaultzone;
	}
	public Boolean getEnableVersioning() {
		return mEnableVersioning;
	}

	public void setEnableVersioning(Boolean enableversioning) {
		mEnableVersioning = enableversioning;
	}
	public String getSystemType() {
		return mSystemType;
	}

	public void setSystemType(String systemtype) {
		mSystemType = systemtype;
	}
	public Boolean getEnableSync() {
		return mEnableSync;
	}

	public void setEnableSync(Boolean enablesync) {
		mEnableSync = enablesync;
	}
	public String getSystemName() {
		return mSystemName;
	}

	public void setSystemName(String systemname) {
		mSystemName = systemname;
	}
	public String getHomeScreenName() {
		return mHomeScreenName;
	}

	public void setHomeScreenName(String homescreenname) {
		mHomeScreenName = homescreenname;
	}
	public Boolean getShowTermsCheckbox() {
		return mShowTermsCheckbox;
	}

	public void setShowTermsCheckbox(Boolean showtermscheckbox) {
		mShowTermsCheckbox = showtermscheckbox;
	}
	public String getTermsCheckboxText() {
		return mTermsCheckboxText;
	}

	public void setTermsCheckboxText(String termscheckboxtext) {
		mTermsCheckboxText = termscheckboxtext;
	}
	public Integer getTermsCheckboxStrictness() {
		return mTermsCheckboxStrictness;
	}

	public void setTermsCheckboxStrictness(Integer termscheckboxstrictness) {
		mTermsCheckboxStrictness = termscheckboxstrictness;
	}
	public Boolean getRequireCompanyNameWithUserInfo() {
		return mRequireCompanyNameWithUserInfo;
	}

	public void setRequireCompanyNameWithUserInfo(Boolean requirecompanynamewithuserinfo) {
		mRequireCompanyNameWithUserInfo = requirecompanynamewithuserinfo;
	}
	public Boolean getEnableEditor() {
		return mEnableEditor;
	}

	public void setEnableEditor(Boolean enableeditor) {
		mEnableEditor = enableeditor;
	}
	public Integer getShareIDMaxExpirationDays() {
		return mShareIDMaxExpirationDays;
	}

	public void setShareIDMaxExpirationDays(Integer shareidmaxexpirationdays) {
		mShareIDMaxExpirationDays = shareidmaxexpirationdays;
	}
	public Boolean getAdminIsSuperUser() {
		return mAdminIsSuperUser;
	}

	public void setAdminIsSuperUser(Boolean adminissuperuser) {
		mAdminIsSuperUser = adminissuperuser;
	}
	public Boolean getShowFolderAccessList() {
		return mShowFolderAccessList;
	}

	public void setShowFolderAccessList(Boolean showfolderaccesslist) {
		mShowFolderAccessList = showfolderaccesslist;
	}
	public Boolean getFromEmailIsShareFile() {
		return mFromEmailIsShareFile;
	}

	public void setFromEmailIsShareFile(Boolean fromemailissharefile) {
		mFromEmailIsShareFile = fromemailissharefile;
	}
	public Boolean getUseAlternateSMTP() {
		return mUseAlternateSMTP;
	}

	public void setUseAlternateSMTP(Boolean usealternatesmtp) {
		mUseAlternateSMTP = usealternatesmtp;
	}
	public Boolean getShowPasswordInEmail() {
		return mShowPasswordInEmail;
	}

	public void setShowPasswordInEmail(Boolean showpasswordinemail) {
		mShowPasswordInEmail = showpasswordinemail;
	}
	public String getEmailPasswordText() {
		return mEmailPasswordText;
	}

	public void setEmailPasswordText(String emailpasswordtext) {
		mEmailPasswordText = emailpasswordtext;
	}
	public Boolean getEnableSelfNotificationsUpload() {
		return mEnableSelfNotificationsUpload;
	}

	public void setEnableSelfNotificationsUpload(Boolean enableselfnotificationsupload) {
		mEnableSelfNotificationsUpload = enableselfnotificationsupload;
	}
	public Boolean getEnableSelfNotificationsDownload() {
		return mEnableSelfNotificationsDownload;
	}

	public void setEnableSelfNotificationsDownload(Boolean enableselfnotificationsdownload) {
		mEnableSelfNotificationsDownload = enableselfnotificationsdownload;
	}
	public Boolean getEnableUploadShareIDReceipt() {
		return mEnableUploadShareIDReceipt;
	}

	public void setEnableUploadShareIDReceipt(Boolean enableuploadshareidreceipt) {
		mEnableUploadShareIDReceipt = enableuploadshareidreceipt;
	}
	public Integer getDefaultConsolidatedNotificationInterval() {
		return mDefaultConsolidatedNotificationInterval;
	}

	public void setDefaultConsolidatedNotificationInterval(Integer defaultconsolidatednotificationinterval) {
		mDefaultConsolidatedNotificationInterval = defaultconsolidatednotificationinterval;
	}
	public Integer getExpirationDays() {
		return mExpirationDays;
	}

	public void setExpirationDays(Integer expirationdays) {
		mExpirationDays = expirationdays;
	}
	public String getDefaultSortField() {
		return mDefaultSortField;
	}

	public void setDefaultSortField(String defaultsortfield) {
		mDefaultSortField = defaultsortfield;
	}
	public String getDefaultSortOrder() {
		return mDefaultSortOrder;
	}

	public void setDefaultSortOrder(String defaultsortorder) {
		mDefaultSortOrder = defaultsortorder;
	}
	public Boolean getDefaultIsVersioned() {
		return mDefaultIsVersioned;
	}

	public void setDefaultIsVersioned(Boolean defaultisversioned) {
		mDefaultIsVersioned = defaultisversioned;
	}
	public Integer getDefaultMaxVersions() {
		return mDefaultMaxVersions;
	}

	public void setDefaultMaxVersions(Integer defaultmaxversions) {
		mDefaultMaxVersions = defaultmaxversions;
	}
	public String getViewOnlyWatermarkText() {
		return mViewOnlyWatermarkText;
	}

	public void setViewOnlyWatermarkText(String viewonlywatermarktext) {
		mViewOnlyWatermarkText = viewonlywatermarktext;
	}
	public Boolean getEnableDocViewerPrinting() {
		return mEnableDocViewerPrinting;
	}

	public void setEnableDocViewerPrinting(Boolean enabledocviewerprinting) {
		mEnableDocViewerPrinting = enabledocviewerprinting;
	}
	public Boolean getEnableWatermarkedDownloads() {
		return mEnableWatermarkedDownloads;
	}

	public void setEnableWatermarkedDownloads(Boolean enablewatermarkeddownloads) {
		mEnableWatermarkedDownloads = enablewatermarkeddownloads;
	}
	public Boolean getEnableCaseSensitivePasswords() {
		return mEnableCaseSensitivePasswords;
	}

	public void setEnableCaseSensitivePasswords(Boolean enablecasesensitivepasswords) {
		mEnableCaseSensitivePasswords = enablecasesensitivepasswords;
	}
	public Boolean getEnableTwoFactorAuth() {
		return mEnableTwoFactorAuth;
	}

	public void setEnableTwoFactorAuth(Boolean enabletwofactorauth) {
		mEnableTwoFactorAuth = enabletwofactorauth;
	}
	public Integer getLoginFailMaxAttempts() {
		return mLoginFailMaxAttempts;
	}

	public void setLoginFailMaxAttempts(Integer loginfailmaxattempts) {
		mLoginFailMaxAttempts = loginfailmaxattempts;
	}
	public Integer getLoginFailLockoutSecs() {
		return mLoginFailLockoutSecs;
	}

	public void setLoginFailLockoutSecs(Integer loginfaillockoutsecs) {
		mLoginFailLockoutSecs = loginfaillockoutsecs;
	}
	public String getIPRestrictions() {
		return mIPRestrictions;
	}

	public void setIPRestrictions(String iprestrictions) {
		mIPRestrictions = iprestrictions;
	}
	public Integer getInactiveTimeoutMins() {
		return mInactiveTimeoutMins;
	}

	public void setInactiveTimeoutMins(Integer inactivetimeoutmins) {
		mInactiveTimeoutMins = inactivetimeoutmins;
	}
	public Integer getOAuth2RefreshTokenLifetimeMinutes() {
		return mOAuth2RefreshTokenLifetimeMinutes;
	}

	public void setOAuth2RefreshTokenLifetimeMinutes(Integer oauth2refreshtokenlifetimeminutes) {
		mOAuth2RefreshTokenLifetimeMinutes = oauth2refreshtokenlifetimeminutes;
	}
	public String getPasswordRegEx() {
		return mPasswordRegEx;
	}

	public void setPasswordRegEx(String passwordregex) {
		mPasswordRegEx = passwordregex;
	}
	public String getPasswordRegExFormula() {
		return mPasswordRegExFormula;
	}

	public void setPasswordRegExFormula(String passwordregexformula) {
		mPasswordRegExFormula = passwordregexformula;
	}
	public String getPasswordRegExDescription() {
		return mPasswordRegExDescription;
	}

	public void setPasswordRegExDescription(String passwordregexdescription) {
		mPasswordRegExDescription = passwordregexdescription;
	}
	public Boolean getEnableActivationLinks() {
		return mEnableActivationLinks;
	}

	public void setEnableActivationLinks(Boolean enableactivationlinks) {
		mEnableActivationLinks = enableactivationlinks;
	}
	public Boolean getIsFINRA() {
		return mIsFINRA;
	}

	public void setIsFINRA(Boolean isfinra) {
		mIsFINRA = isfinra;
	}
	public Boolean getEnableOAuth() {
		return mEnableOAuth;
	}

	public void setEnableOAuth(Boolean enableoauth) {
		mEnableOAuth = enableoauth;
	}
	public Boolean getEnableQandA() {
		return mEnableQandA;
	}

	public void setEnableQandA(Boolean enableqanda) {
		mEnableQandA = enableqanda;
	}
	public Boolean getEnableQandATextInNotifications() {
		return mEnableQandATextInNotifications;
	}

	public void setEnableQandATextInNotifications(Boolean enableqandatextinnotifications) {
		mEnableQandATextInNotifications = enableqandatextinnotifications;
	}
	public SFUXMode getUXMode() {
		return mUXMode;
	}

	public void setUXMode(SFUXMode uxmode) {
		mUXMode = uxmode;
	}
	public Integer getPasswordMaxAgeDays() {
		return mPasswordMaxAgeDays;
	}

	public void setPasswordMaxAgeDays(Integer passwordmaxagedays) {
		mPasswordMaxAgeDays = passwordmaxagedays;
	}
	public Integer getPasswordHistoryCount() {
		return mPasswordHistoryCount;
	}

	public void setPasswordHistoryCount(Integer passwordhistorycount) {
		mPasswordHistoryCount = passwordhistorycount;
	}
	public Integer getMinimumLength() {
		return mMinimumLength;
	}

	public void setMinimumLength(Integer minimumlength) {
		mMinimumLength = minimumlength;
	}
	public Boolean getAlphaRequired() {
		return mAlphaRequired;
	}

	public void setAlphaRequired(Boolean alpharequired) {
		mAlphaRequired = alpharequired;
	}
	public Boolean getCaseRequired() {
		return mCaseRequired;
	}

	public void setCaseRequired(Boolean caserequired) {
		mCaseRequired = caserequired;
	}
	public Boolean getNumericRequired() {
		return mNumericRequired;
	}

	public void setNumericRequired(Boolean numericrequired) {
		mNumericRequired = numericrequired;
	}
	public Boolean getSpecialRequired() {
		return mSpecialRequired;
	}

	public void setSpecialRequired(Boolean specialrequired) {
		mSpecialRequired = specialrequired;
	}
	public String getAllowedSpecialCharacters() {
		return mAllowedSpecialCharacters;
	}

	public void setAllowedSpecialCharacters(String allowedspecialcharacters) {
		mAllowedSpecialCharacters = allowedspecialcharacters;
	}
	public String getAccountID() {
		return mAccountID;
	}

	public void setAccountID(String accountid) {
		mAccountID = accountid;
	}
}