
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

public class SFODataFeed<T> extends SFODataObject {

	@SerializedName("odata.count")
	private Integer mcount;
	@SerializedName("value")
	private ArrayList<T> mFeed;
	@SerializedName("odata.nextLink")
	private String mNextLink;

	public Integer getcount() {
		return mcount;
	}

	public void setcount(Integer count) {
		mcount = count;
	}
	public ArrayList<T> getFeed() {
		return mFeed;
	}

	public void setFeed(ArrayList<T> feed) {
		mFeed = feed;
	}
	public String getNextLink() {
		return mNextLink;
	}

	public void setNextLink(String nextlink) {
		mNextLink = nextlink;
	}
}