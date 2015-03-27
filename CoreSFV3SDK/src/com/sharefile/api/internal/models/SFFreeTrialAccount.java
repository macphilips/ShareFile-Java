
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2015 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.sharefile.api.internal.models;

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.sharefile.api.*;
import com.sharefile.api.enumerations.*;
import com.sharefile.api.models.*;

public class SFFreeTrialAccount extends SFAccount {

	@SerializedName("PromoCode")
	private String PromoCode;
	@SerializedName("EndDate")
	private Date EndDate;
	@SerializedName("IsValid")
	private Boolean IsValid;
	@SerializedName("ConversionType")
	private String ConversionType;
	@SerializedName("HasFollowedUp")
	private Boolean HasFollowedUp;
	@SerializedName("FollowUpDate")
	private Date FollowUpDate;
	@SerializedName("CancellationReason")
	private String CancellationReason;
	@SerializedName("SignupProcess")
	private String SignupProcess;
	@SerializedName("ConversionIndex")
	private Double ConversionIndex;
	@SerializedName("ConversionIndexDay7")
	private Double ConversionIndexDay7;
	@SerializedName("ConversionIndexDay14")
	private Double ConversionIndexDay14;
	@SerializedName("LTVIndex")
	private Double LTVIndex;
	@SerializedName("AllSources")
	private String AllSources;
	@SerializedName("ReferralID")
	private String ReferralID;
	@SerializedName("TrialTypeID")
	private Integer TrialTypeID;
	@SerializedName("InitialCallRepID")
	private String InitialCallRepID;
	@SerializedName("InitialCallDate")
	private Date InitialCallDate;
	@SerializedName("DemoStatus")
	private Integer DemoStatus;
	@SerializedName("DemoDate")
	private Date DemoDate;
	@SerializedName("MarketoID")
	private String MarketoID;
	@SerializedName("CloudStorageType")
	private SFSafeEnum<SFCloudStorageType> CloudStorageType;
	@SerializedName("IsResellerAccount")
	private Boolean IsResellerAccount;
	@SerializedName("IsAmazon")
	private Boolean IsAmazon;
	@SerializedName("BrandingStylesStr")
	private String BrandingStylesStr;
	@SerializedName("DatabaseLevel")
	private SFSafeEnum<SFDatabaseLevel> DatabaseLevel;
	@SerializedName("ResellerInfo")
	private SFReseller ResellerInfo;
	@SerializedName("TopLevelDomain")
	private String TopLevelDomain;
	@SerializedName("WebUserId")
	private String WebUserId;
	@SerializedName("BillingAddons")
	private ArrayList<SFBillingAddOn> BillingAddons;
	@SerializedName("RightSignatureAdmin")
	private SFUser RightSignatureAdmin;
	@SerializedName("OpportunityId")
	private String OpportunityId;
	@SerializedName("CreatedBy")
	private SFShareFileRepresentative CreatedBy;
	@SerializedName("RightSignatureShareFileRep")
	private SFShareFileRepresentative RightSignatureShareFileRep;
	@SerializedName("IsNewRightSignatureAdmin")
	private Boolean IsNewRightSignatureAdmin;
	@SerializedName("IsDemo")
	private Boolean IsDemo;
	@SerializedName("CreditCardToken")
	private String CreditCardToken;
	@SerializedName("IsCardRequired")
	private Boolean IsCardRequired;
	@SerializedName("IsCMSZ")
	private Boolean IsCMSZ;
	@SerializedName("ProvisionedById")
	private String ProvisionedById;
	@SerializedName("TrialLengthInDays")
	private Integer TrialLengthInDays;
	@SerializedName("EnterpriseOrders")
	private ArrayList<SFEnterpriseOrder> EnterpriseOrders;

	public String getPromoCode() {
		return this.PromoCode;
	}

	public void setPromoCode(String promocode) {
		this.PromoCode = promocode;
	}
	public Date getEndDate() {
		return this.EndDate;
	}

	public void setEndDate(Date enddate) {
		this.EndDate = enddate;
	}
	public Boolean getIsValid() {
		return this.IsValid;
	}

	public void setIsValid(Boolean isvalid) {
		this.IsValid = isvalid;
	}
	public String getConversionType() {
		return this.ConversionType;
	}

	public void setConversionType(String conversiontype) {
		this.ConversionType = conversiontype;
	}
	public Boolean getHasFollowedUp() {
		return this.HasFollowedUp;
	}

	public void setHasFollowedUp(Boolean hasfollowedup) {
		this.HasFollowedUp = hasfollowedup;
	}
	public Date getFollowUpDate() {
		return this.FollowUpDate;
	}

	public void setFollowUpDate(Date followupdate) {
		this.FollowUpDate = followupdate;
	}
	public String getCancellationReason() {
		return this.CancellationReason;
	}

	public void setCancellationReason(String cancellationreason) {
		this.CancellationReason = cancellationreason;
	}
	public String getSignupProcess() {
		return this.SignupProcess;
	}

	public void setSignupProcess(String signupprocess) {
		this.SignupProcess = signupprocess;
	}
	public Double getConversionIndex() {
		return this.ConversionIndex;
	}

	public void setConversionIndex(Double conversionindex) {
		this.ConversionIndex = conversionindex;
	}
	public Double getConversionIndexDay7() {
		return this.ConversionIndexDay7;
	}

	public void setConversionIndexDay7(Double conversionindexday7) {
		this.ConversionIndexDay7 = conversionindexday7;
	}
	public Double getConversionIndexDay14() {
		return this.ConversionIndexDay14;
	}

	public void setConversionIndexDay14(Double conversionindexday14) {
		this.ConversionIndexDay14 = conversionindexday14;
	}
	public Double getLTVIndex() {
		return this.LTVIndex;
	}

	public void setLTVIndex(Double ltvindex) {
		this.LTVIndex = ltvindex;
	}
	public String getAllSources() {
		return this.AllSources;
	}

	public void setAllSources(String allsources) {
		this.AllSources = allsources;
	}
	public String getReferralID() {
		return this.ReferralID;
	}

	public void setReferralID(String referralid) {
		this.ReferralID = referralid;
	}
	public Integer getTrialTypeID() {
		return this.TrialTypeID;
	}

	public void setTrialTypeID(Integer trialtypeid) {
		this.TrialTypeID = trialtypeid;
	}
	public String getInitialCallRepID() {
		return this.InitialCallRepID;
	}

	public void setInitialCallRepID(String initialcallrepid) {
		this.InitialCallRepID = initialcallrepid;
	}
	public Date getInitialCallDate() {
		return this.InitialCallDate;
	}

	public void setInitialCallDate(Date initialcalldate) {
		this.InitialCallDate = initialcalldate;
	}
	public Integer getDemoStatus() {
		return this.DemoStatus;
	}

	public void setDemoStatus(Integer demostatus) {
		this.DemoStatus = demostatus;
	}
	public Date getDemoDate() {
		return this.DemoDate;
	}

	public void setDemoDate(Date demodate) {
		this.DemoDate = demodate;
	}
	public String getMarketoID() {
		return this.MarketoID;
	}

	public void setMarketoID(String marketoid) {
		this.MarketoID = marketoid;
	}
	public SFSafeEnum<SFCloudStorageType> getCloudStorageType() {
		return this.CloudStorageType;
	}

	public void setCloudStorageType(SFSafeEnum<SFCloudStorageType> cloudstoragetype) {
		this.CloudStorageType = cloudstoragetype;
	}
	public Boolean getIsResellerAccount() {
		return this.IsResellerAccount;
	}

	public void setIsResellerAccount(Boolean isreselleraccount) {
		this.IsResellerAccount = isreselleraccount;
	}
	public Boolean getIsAmazon() {
		return this.IsAmazon;
	}

	public void setIsAmazon(Boolean isamazon) {
		this.IsAmazon = isamazon;
	}
	public String getBrandingStylesStr() {
		return this.BrandingStylesStr;
	}

	public void setBrandingStylesStr(String brandingstylesstr) {
		this.BrandingStylesStr = brandingstylesstr;
	}
	public SFSafeEnum<SFDatabaseLevel> getDatabaseLevel() {
		return this.DatabaseLevel;
	}

	public void setDatabaseLevel(SFSafeEnum<SFDatabaseLevel> databaselevel) {
		this.DatabaseLevel = databaselevel;
	}
	public SFReseller getResellerInfo() {
		return this.ResellerInfo;
	}

	public void setResellerInfo(SFReseller resellerinfo) {
		this.ResellerInfo = resellerinfo;
	}
	public String getTopLevelDomain() {
		return this.TopLevelDomain;
	}

	public void setTopLevelDomain(String topleveldomain) {
		this.TopLevelDomain = topleveldomain;
	}
	public String getWebUserId() {
		return this.WebUserId;
	}

	public void setWebUserId(String webuserid) {
		this.WebUserId = webuserid;
	}
	public ArrayList<SFBillingAddOn> getBillingAddons() {
		return this.BillingAddons;
	}

	public void setBillingAddons(ArrayList<SFBillingAddOn> billingaddons) {
		this.BillingAddons = billingaddons;
	}
	public SFUser getRightSignatureAdmin() {
		return this.RightSignatureAdmin;
	}

	public void setRightSignatureAdmin(SFUser rightsignatureadmin) {
		this.RightSignatureAdmin = rightsignatureadmin;
	}
	public String getOpportunityId() {
		return this.OpportunityId;
	}

	public void setOpportunityId(String opportunityid) {
		this.OpportunityId = opportunityid;
	}
	public SFShareFileRepresentative getCreatedBy() {
		return this.CreatedBy;
	}

	public void setCreatedBy(SFShareFileRepresentative createdby) {
		this.CreatedBy = createdby;
	}
	public SFShareFileRepresentative getRightSignatureShareFileRep() {
		return this.RightSignatureShareFileRep;
	}

	public void setRightSignatureShareFileRep(SFShareFileRepresentative rightsignaturesharefilerep) {
		this.RightSignatureShareFileRep = rightsignaturesharefilerep;
	}
	public Boolean getIsNewRightSignatureAdmin() {
		return this.IsNewRightSignatureAdmin;
	}

	public void setIsNewRightSignatureAdmin(Boolean isnewrightsignatureadmin) {
		this.IsNewRightSignatureAdmin = isnewrightsignatureadmin;
	}
	public Boolean getIsDemo() {
		return this.IsDemo;
	}

	public void setIsDemo(Boolean isdemo) {
		this.IsDemo = isdemo;
	}
	public String getCreditCardToken() {
		return this.CreditCardToken;
	}

	public void setCreditCardToken(String creditcardtoken) {
		this.CreditCardToken = creditcardtoken;
	}
	public Boolean getIsCardRequired() {
		return this.IsCardRequired;
	}

	public void setIsCardRequired(Boolean iscardrequired) {
		this.IsCardRequired = iscardrequired;
	}
	public Boolean getIsCMSZ() {
		return this.IsCMSZ;
	}

	public void setIsCMSZ(Boolean iscmsz) {
		this.IsCMSZ = iscmsz;
	}
	public String getProvisionedById() {
		return this.ProvisionedById;
	}

	public void setProvisionedById(String provisionedbyid) {
		this.ProvisionedById = provisionedbyid;
	}
	public Integer getTrialLengthInDays() {
		return this.TrialLengthInDays;
	}

	public void setTrialLengthInDays(Integer triallengthindays) {
		this.TrialLengthInDays = triallengthindays;
	}
	public ArrayList<SFEnterpriseOrder> getEnterpriseOrders() {
		return this.EnterpriseOrders;
	}

	public void setEnterpriseOrders(ArrayList<SFEnterpriseOrder> enterpriseorders) {
		this.EnterpriseOrders = enterpriseorders;
	}

}