
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

public class SFWebhookSubscription extends SFODataObject {

	@SerializedName("ResourceType")
	private String ResourceType;
	@SerializedName("ResourceId")
	private String ResourceId;
	@SerializedName("WebhookUrl")
	private String WebhookUrl;
	@SerializedName("SubscriptionContext")
	private SFSubscriptionContext SubscriptionContext;
	@SerializedName("Events")
	private ArrayList<SFSubscribedResourceEvent> Events;

	public String getResourceType() {
		return this.ResourceType;
	}

	public void setResourceType(String resourcetype) {
		this.ResourceType = resourcetype;
	}
	public String getResourceId() {
		return this.ResourceId;
	}

	public void setResourceId(String resourceid) {
		this.ResourceId = resourceid;
	}
		/**
		* Url where the Event payload will be posted to.
		*/
	public String getWebhookUrl() {
		return this.WebhookUrl;
	}

		/**
		* Url where the Event payload will be posted to.
		*/
	public void setWebhookUrl(String webhookurl) {
		this.WebhookUrl = webhookurl;
	}
		/**
		* The Context of the Events to trigger upon
		*/
	public SFSubscriptionContext getSubscriptionContext() {
		return this.SubscriptionContext;
	}

		/**
		* The Context of the Events to trigger upon
		*/
	public void setSubscriptionContext(SFSubscriptionContext subscriptioncontext) {
		this.SubscriptionContext = subscriptioncontext;
	}
		/**
		* List of events to trigger upon
		*/
	public ArrayList<SFSubscribedResourceEvent> getEvents() {
		return this.Events;
	}

		/**
		* List of events to trigger upon
		*/
	public void setEvents(ArrayList<SFSubscribedResourceEvent> events) {
		this.Events = events;
	}

}