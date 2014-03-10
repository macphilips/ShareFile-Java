
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

import java.util.Date;

import com.sharefile.api.enumerations.SFAsyncOperationState;
import com.sharefile.api.enumerations.SFAsyncOperationType;

public class SFAsyncOperation extends SFODataObject {

	private SFAsyncOperationType mOperation;
	private SFAccount mAccount;
	private SFZone mAuthorityZone;
	private SFItem mSource;
	private SFUser mUser;
	private Date mCreationDate;
	private SFAsyncOperationState mState;
	private Date mUpdateDate;
	private SFItem mTarget;
	private String mBatchID;
	private String mBatchSourceID;
	private String mBatchTargetID;

		/**
		* Operation type
		*/
	public SFAsyncOperationType getOperation() {
		return mOperation;
	}

		/**
		* Operation type
		*/
	public void setOperation(SFAsyncOperationType operation) {
		mOperation = operation;
	}
		/**
		* ShareFile Account
		*/
	public SFAccount getAccount() {
		return mAccount;
	}

		/**
		* ShareFile Account
		*/
	public void setAccount(SFAccount account) {
		mAccount = account;
	}
		/**
		* Represents the Zone that is driving the asynchronous operation process. It
		* may be null if the operation is driven by the control plane.
		*/
	public SFZone getAuthorityZone() {
		return mAuthorityZone;
	}

		/**
		* Represents the Zone that is driving the asynchronous operation process. It
		* may be null if the operation is driven by the control plane.
		*/
	public void setAuthorityZone(SFZone authorityzone) {
		mAuthorityZone = authorityzone;
	}
		/**
		* Source Item for the operation.
		*/
	public SFItem getSource() {
		return mSource;
	}

		/**
		* Source Item for the operation.
		*/
	public void setSource(SFItem source) {
		mSource = source;
	}
		/**
		* User that initiated the operation
		*/
	public SFUser getUser() {
		return mUser;
	}

		/**
		* User that initiated the operation
		*/
	public void setUser(SFUser user) {
		mUser = user;
	}
		/**
		* Operation creation date
		*/
	public Date getCreationDate() {
		return mCreationDate;
	}

		/**
		* Operation creation date
		*/
	public void setCreationDate(Date creationdate) {
		mCreationDate = creationdate;
	}
		/**
		* Operation state. States 'Created' and 'Scheduled' indicate the operation is
		* in progress; States 'Success' and 'Failure' indicate the operatoin is finalized
		*/
	public SFAsyncOperationState getState() {
		return mState;
	}

		/**
		* Operation state. States 'Created' and 'Scheduled' indicate the operation is
		* in progress; States 'Success' and 'Failure' indicate the operatoin is finalized
		*/
	public void setState(SFAsyncOperationState state) {
		mState = state;
	}
		/**
		* Last time the operation state was modified
		*/
	public Date getUpdateDate() {
		return mUpdateDate;
	}

		/**
		* Last time the operation state was modified
		*/
	public void setUpdateDate(Date updatedate) {
		mUpdateDate = updatedate;
	}
		/**
		* Target Item for the operation.
		*/
	public SFItem getTarget() {
		return mTarget;
	}

		/**
		* Target Item for the operation.
		*/
	public void setTarget(SFItem target) {
		mTarget = target;
	}
		/**
		* Batch Identifier for an asynchronous operation that includes multiple Items - for
		* example, a recursive Copy will create a single AsyncOp instance per file, all sharing
		* the same BatchID
		*/
	public String getBatchID() {
		return mBatchID;
	}

		/**
		* Batch Identifier for an asynchronous operation that includes multiple Items - for
		* example, a recursive Copy will create a single AsyncOp instance per file, all sharing
		* the same BatchID
		*/
	public void setBatchID(String batchid) {
		mBatchID = batchid;
	}
		/**
		* Item ID used as source for the Batch operation
		*/
	public String getBatchSourceID() {
		return mBatchSourceID;
	}

		/**
		* Item ID used as source for the Batch operation
		*/
	public void setBatchSourceID(String batchsourceid) {
		mBatchSourceID = batchsourceid;
	}
		/**
		* Item ID used as target for the Batch operation
		*/
	public String getBatchTargetID() {
		return mBatchTargetID;
	}

		/**
		* Item ID used as target for the Batch operation
		*/
	public void setBatchTargetID(String batchtargetid) {
		mBatchTargetID = batchtargetid;
	}
}