
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

public class SFQuery extends SFODataObject {

	private ArrayList<String> AuthIDs;
	private ArrayList<String> ItemTypes;
	private ArrayList<String> ParentID;
	private ArrayList<String> CreatorID;
	private String LuceneQuery;
	private String SearchQuery;
	private String CreateStartDate;
	private String CreateEndDate;
	private Boolean ItemNameOnly;

	public ArrayList<String> getAuthIDs() {
		return AuthIDs;
	}

	public void setAuthIDs(ArrayList<String> authids) {
		AuthIDs = authids;
	}
	public ArrayList<String> getItemTypes() {
		return ItemTypes;
	}

	public void setItemTypes(ArrayList<String> itemtypes) {
		ItemTypes = itemtypes;
	}
	public ArrayList<String> getParentID() {
		return ParentID;
	}

	public void setParentID(ArrayList<String> parentid) {
		ParentID = parentid;
	}
	public ArrayList<String> getCreatorID() {
		return CreatorID;
	}

	public void setCreatorID(ArrayList<String> creatorid) {
		CreatorID = creatorid;
	}
	public String getLuceneQuery() {
		return LuceneQuery;
	}

	public void setLuceneQuery(String lucenequery) {
		LuceneQuery = lucenequery;
	}
	public String getSearchQuery() {
		return SearchQuery;
	}

	public void setSearchQuery(String searchquery) {
		SearchQuery = searchquery;
	}
	public String getCreateStartDate() {
		return CreateStartDate;
	}

	public void setCreateStartDate(String createstartdate) {
		CreateStartDate = createstartdate;
	}
	public String getCreateEndDate() {
		return CreateEndDate;
	}

	public void setCreateEndDate(String createenddate) {
		CreateEndDate = createenddate;
	}
	public Boolean getItemNameOnly() {
		return ItemNameOnly;
	}

	public void setItemNameOnly(Boolean itemnameonly) {
		ItemNameOnly = itemnameonly;
	}
}