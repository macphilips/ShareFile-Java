
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

public class SFUploadSpecification extends SFODataObject {

	private SFUploadMethod mMethod;
	private URI mPrepareUri;
	private URI mChunkUri;
	private URI mFinishUri;
	private Boolean mIsResume;
	private Long mResumeIndex;
	private Long mResumeOffset;
	private String mResumeFileHash;

		/**
		* The Upload method that must be used for this upload
		*/
	public SFUploadMethod getMethod() {
		return mMethod;
	}

		/**
		* The Upload method that must be used for this upload
		*/
	public void setMethod(SFUploadMethod method) {
		mMethod = method;
	}
		/**
		* If provided, clients must issue a request to this Uri before uploading any data.
		*/
	public URI getPrepareUri() {
		return mPrepareUri;
	}

		/**
		* If provided, clients must issue a request to this Uri before uploading any data.
		*/
	public void setPrepareUri(URI prepareuri) {
		mPrepareUri = prepareuri;
	}
		/**
		* Specifies the URI the client must send the file data to
		*/
	public URI getChunkUri() {
		return mChunkUri;
	}

		/**
		* Specifies the URI the client must send the file data to
		*/
	public void setChunkUri(URI chunkuri) {
		mChunkUri = chunkuri;
	}
		/**
		* If provided, specifies the final call the client must perform to finish the upload process
		*/
	public URI getFinishUri() {
		return mFinishUri;
	}

		/**
		* If provided, specifies the final call the client must perform to finish the upload process
		*/
	public void setFinishUri(URI finishuri) {
		mFinishUri = finishuri;
	}
		/**
		* Specifies a Resumable upload is supproted.
		*/
	public Boolean getIsResume() {
		return mIsResume;
	}

		/**
		* Specifies a Resumable upload is supproted.
		*/
	public void setIsResume(Boolean isresume) {
		mIsResume = isresume;
	}
		/**
		* Specifies the initial index for resuming, if IsResume is true.
		*/
	public Long getResumeIndex() {
		return mResumeIndex;
	}

		/**
		* Specifies the initial index for resuming, if IsResume is true.
		*/
	public void setResumeIndex(Long resumeindex) {
		mResumeIndex = resumeindex;
	}
		/**
		* Specifies the initial file offset by bytes, if IsResume is true
		*/
	public Long getResumeOffset() {
		return mResumeOffset;
	}

		/**
		* Specifies the initial file offset by bytes, if IsResume is true
		*/
	public void setResumeOffset(Long resumeoffset) {
		mResumeOffset = resumeoffset;
	}
		/**
		* Specifies the MD5 hash of the first ResumeOffset bytes of the partial file found at the server
		*/
	public String getResumeFileHash() {
		return mResumeFileHash;
	}

		/**
		* Specifies the MD5 hash of the first ResumeOffset bytes of the partial file found at the server
		*/
	public void setResumeFileHash(String resumefilehash) {
		mResumeFileHash = resumefilehash;
	}
}