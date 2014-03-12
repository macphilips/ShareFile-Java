
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
import java.util.Date;

public class SFItem extends SFODataObject {

	private String Name;
	private String FileName;
	private SFUser Creator;
	private SFItem Parent;
	private ArrayList<SFAccessControl> AccessControls;
	private SFZone Zone;
	private Date CreationDate;
	private Date ProgenyEditDate;
	private Date ExpirationDate;
	private String Description;
	private Integer DiskSpaceLimit;
	private Boolean IsHidden;
	private Integer BandwidthLimitInMB;
	private SFUser Owner;
	private SFAccount Account;
	private Integer FileSizeInKB;
	private SFItem VirtualParent;
	private String Path;
	private String CreatorFirstName;
	private String CreatorLastName;
	private Integer ExpirationDays;
	private Long FileSizeBytes;
	private SFPreviewStatus PreviewStatus;
	private Integer MaxPreviewSize;
	private Boolean HasPendingDeletion;
	private String AssociatedFolderTemplateID;
	private Boolean IsTemplateOwned;
	private Boolean HasPermissionInfo;
	private Integer State;
	private String StreamID;
	private String CreatorNameShort;
	private Boolean HasMultipleVersions;
	private ArrayList<SFMetadata> Metadata;

		/**
		* Item Name
		*/
	public String getName() {
		return Name;
	}

		/**
		* Item Name
		*/
	public void setName(String name) {
		Name = name;
	}
		/**
		* Item File Name. ShareFile allows Items to have different Display and File names: display
		* names are shown during client navigation, while file names are used when the item is
		* downloaded.
		*/
	public String getFileName() {
		return FileName;
	}

		/**
		* Item File Name. ShareFile allows Items to have different Display and File names: display
		* names are shown during client navigation, while file names are used when the item is
		* downloaded.
		*/
	public void setFileName(String filename) {
		FileName = filename;
	}
		/**
		* User that Created this Item
		*/
	public SFUser getCreator() {
		return Creator;
	}

		/**
		* User that Created this Item
		*/
	public void setCreator(SFUser creator) {
		Creator = creator;
	}
		/**
		* Parent container of the Item. A container is usually a Folder object, with a few exceptions -
		* the "Account" is the container of top-level folders.
		*/
	public SFItem getParent() {
		return Parent;
	}

		/**
		* Parent container of the Item. A container is usually a Folder object, with a few exceptions -
		* the "Account" is the container of top-level folders.
		*/
	public void setParent(SFItem parent) {
		Parent = parent;
	}
		/**
		* List of Access Controls for this Item. This is not the effective ACL on the Item, just the
		* ACLs directly attached to this Item. Use the "Info" reference to retrieve effective ACL
		*/
	public ArrayList<SFAccessControl> getAccessControls() {
		return AccessControls;
	}

		/**
		* List of Access Controls for this Item. This is not the effective ACL on the Item, just the
		* ACLs directly attached to this Item. Use the "Info" reference to retrieve effective ACL
		*/
	public void setAccessControls(ArrayList<SFAccessControl> accesscontrols) {
		AccessControls = accesscontrols;
	}
		/**
		* The Storage Zone that contains this Item.
		*/
	public SFZone getZone() {
		return Zone;
	}

		/**
		* The Storage Zone that contains this Item.
		*/
	public void setZone(SFZone zone) {
		Zone = zone;
	}
		/**
		* Item Creation Date.
		*/
	public Date getCreationDate() {
		return CreationDate;
	}

		/**
		* Item Creation Date.
		*/
	public void setCreationDate(Date creationdate) {
		CreationDate = creationdate;
	}
		/**
		* The last modified date of this item and all of its children, recursively. This parameter
		* is not supported in all ShareFile providers - it is always set in sharefile.com hosting, but
		* not in some StorageZone connectors. The Capability object of the provider indicates whether
		* the provider supports this field or not.
		*/
	public Date getProgenyEditDate() {
		return ProgenyEditDate;
	}

		/**
		* The last modified date of this item and all of its children, recursively. This parameter
		* is not supported in all ShareFile providers - it is always set in sharefile.com hosting, but
		* not in some StorageZone connectors. The Capability object of the provider indicates whether
		* the provider supports this field or not.
		*/
	public void setProgenyEditDate(Date progenyeditdate) {
		ProgenyEditDate = progenyeditdate;
	}
		/**
		* Defines the Retention Policy for this Item. After this date, the item is automatically moved
		* to recycle bin.
		*/
	public Date getExpirationDate() {
		return ExpirationDate;
	}

		/**
		* Defines the Retention Policy for this Item. After this date, the item is automatically moved
		* to recycle bin.
		*/
	public void setExpirationDate(Date expirationdate) {
		ExpirationDate = expirationdate;
	}
		/**
		* Item description
		*/
	public String getDescription() {
		return Description;
	}

		/**
		* Item description
		*/
	public void setDescription(String description) {
		Description = description;
	}
		/**
		* Disk space limit for the Item. Define the maximum amount of bytes that this container can
		* hold at any given time.
		*/
	public Integer getDiskSpaceLimit() {
		return DiskSpaceLimit;
	}

		/**
		* Disk space limit for the Item. Define the maximum amount of bytes that this container can
		* hold at any given time.
		*/
	public void setDiskSpaceLimit(Integer diskspacelimit) {
		DiskSpaceLimit = diskspacelimit;
	}
		/**
		* Defines whether the Item has a 'hidden' flag.
		*/
	public Boolean getIsHidden() {
		return IsHidden;
	}

		/**
		* Defines whether the Item has a 'hidden' flag.
		*/
	public void setIsHidden(Boolean ishidden) {
		IsHidden = ishidden;
	}
		/**
		* Bandwidth limit for the Item. Define the maximum amount of bytes that can be added and
		* retrieved from this item.
		*/
	public Integer getBandwidthLimitInMB() {
		return BandwidthLimitInMB;
	}

		/**
		* Bandwidth limit for the Item. Define the maximum amount of bytes that can be added and
		* retrieved from this item.
		*/
	public void setBandwidthLimitInMB(Integer bandwidthlimitinmb) {
		BandwidthLimitInMB = bandwidthlimitinmb;
	}
		/**
		* User Owner of this Item.
		*/
	public SFUser getOwner() {
		return Owner;
	}

		/**
		* User Owner of this Item.
		*/
	public void setOwner(SFUser owner) {
		Owner = owner;
	}
		/**
		* ShareFile Account containing this item.
		*/
	public SFAccount getAccount() {
		return Account;
	}

		/**
		* ShareFile Account containing this item.
		*/
	public void setAccount(SFAccount account) {
		Account = account;
	}
		/**
		* Item size in Kilobytes. For containers, this field includes all children sizes, recursively.
		*/
	public Integer getFileSizeInKB() {
		return FileSizeInKB;
	}

		/**
		* Item size in Kilobytes. For containers, this field includes all children sizes, recursively.
		*/
	public void setFileSizeInKB(Integer filesizeinkb) {
		FileSizeInKB = filesizeinkb;
	}
		/**
		* Defines a Virtual Parent for an Item. In certain conditions, a virtual parent is set to create
		* virtual tree structures different from the strict file system structure - for example, top-level
		* folders may be added under an user's home folder, even though both are defined under the Account.
		*/
	public SFItem getVirtualParent() {
		return VirtualParent;
	}

		/**
		* Defines a Virtual Parent for an Item. In certain conditions, a virtual parent is set to create
		* virtual tree structures different from the strict file system structure - for example, top-level
		* folders may be added under an user's home folder, even though both are defined under the Account.
		*/
	public void setVirtualParent(SFItem virtualparent) {
		VirtualParent = virtualparent;
	}
		/**
		* Contains a ItemID path, separated by /, from the virtual root to this given file. Example
		* /accountID/folderID/folderID/itemID
		*/
	public String getPath() {
		return Path;
	}

		/**
		* Contains a ItemID path, separated by /, from the virtual root to this given file. Example
		* /accountID/folderID/folderID/itemID
		*/
	public void setPath(String path) {
		Path = path;
	}
		/**
		* First name of the user that created this item
		*/
	public String getCreatorFirstName() {
		return CreatorFirstName;
	}

		/**
		* First name of the user that created this item
		*/
	public void setCreatorFirstName(String creatorfirstname) {
		CreatorFirstName = creatorfirstname;
	}
		/**
		* Last name of the user that created this item
		*/
	public String getCreatorLastName() {
		return CreatorLastName;
	}

		/**
		* Last name of the user that created this item
		*/
	public void setCreatorLastName(String creatorlastname) {
		CreatorLastName = creatorlastname;
	}
		/**
		* Amount of days until this item expireses (see ExpirationDate)
		*/
	public Integer getExpirationDays() {
		return ExpirationDays;
	}

		/**
		* Amount of days until this item expireses (see ExpirationDate)
		*/
	public void setExpirationDays(Integer expirationdays) {
		ExpirationDays = expirationdays;
	}
		/**
		* Item size in bytes. For containers, this field will include all children sizes, recursively.
		*/
	public Long getFileSizeBytes() {
		return FileSizeBytes;
	}

		/**
		* Item size in bytes. For containers, this field will include all children sizes, recursively.
		*/
	public void setFileSizeBytes(Long filesizebytes) {
		FileSizeBytes = filesizebytes;
	}
		/**
		* Indicates whether a preview image is available for this Item.
		* 
		* ShareFile.com always create previews for known file types, although there is a delay from the file
		* creation until the preview is available. Some Storage Zones Providers do not create previews, depending
		* on version and deployment options.
		* 
		* Previews are not created for unknown file types
		*/
	public SFPreviewStatus getPreviewStatus() {
		return PreviewStatus;
	}

		/**
		* Indicates whether a preview image is available for this Item.
		* 
		* ShareFile.com always create previews for known file types, although there is a delay from the file
		* creation until the preview is available. Some Storage Zones Providers do not create previews, depending
		* on version and deployment options.
		* 
		* Previews are not created for unknown file types
		*/
	public void setPreviewStatus(SFPreviewStatus previewstatus) {
		PreviewStatus = previewstatus;
	}
	public Integer getMaxPreviewSize() {
		return MaxPreviewSize;
	}

	public void setMaxPreviewSize(Integer maxpreviewsize) {
		MaxPreviewSize = maxpreviewsize;
	}
		/**
		* Indicates that the Item is pending for removal. At the next execution of the Cleanup process, the data
		* blob associated with this item will be removed. This parameter is not used for certain Storage Zone
		* Providers. For example, in CIFS and SharePoint connectors, removals are performed imediately. The
		* Capability "HasRecycleBin" indicates whether this field is used or not in the provider.
		*/
	public Boolean getHasPendingDeletion() {
		return HasPendingDeletion;
	}

		/**
		* Indicates that the Item is pending for removal. At the next execution of the Cleanup process, the data
		* blob associated with this item will be removed. This parameter is not used for certain Storage Zone
		* Providers. For example, in CIFS and SharePoint connectors, removals are performed imediately. The
		* Capability "HasRecycleBin" indicates whether this field is used or not in the provider.
		*/
	public void setHasPendingDeletion(Boolean haspendingdeletion) {
		HasPendingDeletion = haspendingdeletion;
	}
		/**
		* Folder Template reference. If set, it indicates that this Item was created from a Folder Template. Modifications
		* to the folder template are propagated to the associated items.
		* 
		* The Capability FolderTemplate indicates whether the provider supports Folder Templates.
		*/
	public String getAssociatedFolderTemplateID() {
		return AssociatedFolderTemplateID;
	}

		/**
		* Folder Template reference. If set, it indicates that this Item was created from a Folder Template. Modifications
		* to the folder template are propagated to the associated items.
		* 
		* The Capability FolderTemplate indicates whether the provider supports Folder Templates.
		*/
	public void setAssociatedFolderTemplateID(String associatedfoldertemplateid) {
		AssociatedFolderTemplateID = associatedfoldertemplateid;
	}
		/**
		* Indicates whether the item is owned by a Folder Template. If set, it indicates that this Item was created from a
		* Folder Template. Modifications to the folder template are propagated to the associated items.
		* 
		* The Capability FolderTemplate indicates whether the provider supports Folder Templates.
		*/
	public Boolean getIsTemplateOwned() {
		return IsTemplateOwned;
	}

		/**
		* Indicates whether the item is owned by a Folder Template. If set, it indicates that this Item was created from a
		* Folder Template. Modifications to the folder template are propagated to the associated items.
		* 
		* The Capability FolderTemplate indicates whether the provider supports Folder Templates.
		*/
	public void setIsTemplateOwned(Boolean istemplateowned) {
		IsTemplateOwned = istemplateowned;
	}
	public Boolean getHasPermissionInfo() {
		return HasPermissionInfo;
	}

	public void setHasPermissionInfo(Boolean haspermissioninfo) {
		HasPermissionInfo = haspermissioninfo;
	}
	public Integer getState() {
		return State;
	}

	public void setState(Integer state) {
		State = state;
	}
		/**
		* Identifier for the Item stream. An Item represents a single version of a file system object. The stream identifies
		* all versions of the same file system object. For example, when users upload or modify an existing file, a new Item
		* is created with the same StreamID. All Item enumerations return only the latest version of a given stream. You can
		* access the previous versions of a file using the StreamID reference.
		*/
	public String getStreamID() {
		return StreamID;
	}

		/**
		* Identifier for the Item stream. An Item represents a single version of a file system object. The stream identifies
		* all versions of the same file system object. For example, when users upload or modify an existing file, a new Item
		* is created with the same StreamID. All Item enumerations return only the latest version of a given stream. You can
		* access the previous versions of a file using the StreamID reference.
		*/
	public void setStreamID(String streamid) {
		StreamID = streamid;
	}
		/**
		* Short version of items creator's name. E.g., J. Doe.
		*/
	public String getCreatorNameShort() {
		return CreatorNameShort;
	}

		/**
		* Short version of items creator's name. E.g., J. Doe.
		*/
	public void setCreatorNameShort(String creatornameshort) {
		CreatorNameShort = creatornameshort;
	}
		/**
		* Specifies whether there are other versions of this item. Not all providers support file versioning. The
		* Capability FileVersioning indicates whether the provider supports file versions.
		*/
	public Boolean getHasMultipleVersions() {
		return HasMultipleVersions;
	}

		/**
		* Specifies whether there are other versions of this item. Not all providers support file versioning. The
		* Capability FileVersioning indicates whether the provider supports file versions.
		*/
	public void setHasMultipleVersions(Boolean hasmultipleversions) {
		HasMultipleVersions = hasmultipleversions;
	}
		/**
		* List of custom metadata object associated with this item
		*/
	public ArrayList<SFMetadata> getMetadata() {
		return Metadata;
	}

		/**
		* List of custom metadata object associated with this item
		*/
	public void setMetadata(ArrayList<SFMetadata> metadata) {
		Metadata = metadata;
	}
}