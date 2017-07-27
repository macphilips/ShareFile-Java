
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

public class SFEmailAttachmentConversionSetting extends SFODataObject {

	@SerializedName("ConversionSetting")
	private SFSafeEnum<SFEmailAttachmentConversion> ConversionSetting;
	@SerializedName("MinimumSizeInMb")
	private Integer MinimumSizeInMb;

	public SFSafeEnum<SFEmailAttachmentConversion> getConversionSetting() {
		return this.ConversionSetting;
	}

	public void setConversionSetting(SFSafeEnum<SFEmailAttachmentConversion> conversionsetting) {
		this.ConversionSetting = conversionsetting;
	}
	public Integer getMinimumSizeInMb() {
		return this.MinimumSizeInMb;
	}

	public void setMinimumSizeInMb(Integer minimumsizeinmb) {
		this.MinimumSizeInMb = minimumsizeinmb;
	}

}