/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.bookmarks.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.model.StagedModel;
import com.liferay.portal.model.WorkflowedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the BookmarksEntry service. Represents a row in the &quot;BookmarksEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.bookmarks.model.impl.BookmarksEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.bookmarks.model.impl.BookmarksEntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BookmarksEntry
 * @see com.liferay.portlet.bookmarks.model.impl.BookmarksEntryImpl
 * @see com.liferay.portlet.bookmarks.model.impl.BookmarksEntryModelImpl
 * @generated
 */
public interface BookmarksEntryModel extends BaseModel<BookmarksEntry>,
	GroupedModel, StagedModel, WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a bookmarks entry model instance should use the {@link BookmarksEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this bookmarks entry.
	 *
	 * @return the primary key of this bookmarks entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this bookmarks entry.
	 *
	 * @param primaryKey the primary key of this bookmarks entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this bookmarks entry.
	 *
	 * @return the uuid of this bookmarks entry
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this bookmarks entry.
	 *
	 * @param uuid the uuid of this bookmarks entry
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the entry ID of this bookmarks entry.
	 *
	 * @return the entry ID of this bookmarks entry
	 */
	public long getEntryId();

	/**
	 * Sets the entry ID of this bookmarks entry.
	 *
	 * @param entryId the entry ID of this bookmarks entry
	 */
	public void setEntryId(long entryId);

	/**
	 * Returns the group ID of this bookmarks entry.
	 *
	 * @return the group ID of this bookmarks entry
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this bookmarks entry.
	 *
	 * @param groupId the group ID of this bookmarks entry
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this bookmarks entry.
	 *
	 * @return the company ID of this bookmarks entry
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this bookmarks entry.
	 *
	 * @param companyId the company ID of this bookmarks entry
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this bookmarks entry.
	 *
	 * @return the user ID of this bookmarks entry
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this bookmarks entry.
	 *
	 * @param userId the user ID of this bookmarks entry
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this bookmarks entry.
	 *
	 * @return the user uuid of this bookmarks entry
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this bookmarks entry.
	 *
	 * @param userUuid the user uuid of this bookmarks entry
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this bookmarks entry.
	 *
	 * @return the user name of this bookmarks entry
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this bookmarks entry.
	 *
	 * @param userName the user name of this bookmarks entry
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this bookmarks entry.
	 *
	 * @return the create date of this bookmarks entry
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this bookmarks entry.
	 *
	 * @param createDate the create date of this bookmarks entry
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this bookmarks entry.
	 *
	 * @return the modified date of this bookmarks entry
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this bookmarks entry.
	 *
	 * @param modifiedDate the modified date of this bookmarks entry
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the resource block ID of this bookmarks entry.
	 *
	 * @return the resource block ID of this bookmarks entry
	 */
	public long getResourceBlockId();

	/**
	 * Sets the resource block ID of this bookmarks entry.
	 *
	 * @param resourceBlockId the resource block ID of this bookmarks entry
	 */
	public void setResourceBlockId(long resourceBlockId);

	/**
	 * Returns the folder ID of this bookmarks entry.
	 *
	 * @return the folder ID of this bookmarks entry
	 */
	public long getFolderId();

	/**
	 * Sets the folder ID of this bookmarks entry.
	 *
	 * @param folderId the folder ID of this bookmarks entry
	 */
	public void setFolderId(long folderId);

	/**
	 * Returns the name of this bookmarks entry.
	 *
	 * @return the name of this bookmarks entry
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this bookmarks entry.
	 *
	 * @param name the name of this bookmarks entry
	 */
	public void setName(String name);

	/**
	 * Returns the url of this bookmarks entry.
	 *
	 * @return the url of this bookmarks entry
	 */
	@AutoEscape
	public String getUrl();

	/**
	 * Sets the url of this bookmarks entry.
	 *
	 * @param url the url of this bookmarks entry
	 */
	public void setUrl(String url);

	/**
	 * Returns the description of this bookmarks entry.
	 *
	 * @return the description of this bookmarks entry
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this bookmarks entry.
	 *
	 * @param description the description of this bookmarks entry
	 */
	public void setDescription(String description);

	/**
	 * Returns the visits of this bookmarks entry.
	 *
	 * @return the visits of this bookmarks entry
	 */
	public int getVisits();

	/**
	 * Sets the visits of this bookmarks entry.
	 *
	 * @param visits the visits of this bookmarks entry
	 */
	public void setVisits(int visits);

	/**
	 * Returns the priority of this bookmarks entry.
	 *
	 * @return the priority of this bookmarks entry
	 */
	public int getPriority();

	/**
	 * Sets the priority of this bookmarks entry.
	 *
	 * @param priority the priority of this bookmarks entry
	 */
	public void setPriority(int priority);

	/**
	 * Returns the status of this bookmarks entry.
	 *
	 * @return the status of this bookmarks entry
	 */
	public int getStatus();

	/**
	 * Sets the status of this bookmarks entry.
	 *
	 * @param status the status of this bookmarks entry
	 */
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this bookmarks entry.
	 *
	 * @return the status by user ID of this bookmarks entry
	 */
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this bookmarks entry.
	 *
	 * @param statusByUserId the status by user ID of this bookmarks entry
	 */
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this bookmarks entry.
	 *
	 * @return the status by user uuid of this bookmarks entry
	 * @throws SystemException if a system exception occurred
	 */
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this bookmarks entry.
	 *
	 * @param statusByUserUuid the status by user uuid of this bookmarks entry
	 */
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this bookmarks entry.
	 *
	 * @return the status by user name of this bookmarks entry
	 */
	@AutoEscape
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this bookmarks entry.
	 *
	 * @param statusByUserName the status by user name of this bookmarks entry
	 */
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this bookmarks entry.
	 *
	 * @return the status date of this bookmarks entry
	 */
	public Date getStatusDate();

	/**
	 * Sets the status date of this bookmarks entry.
	 *
	 * @param statusDate the status date of this bookmarks entry
	 */
	public void setStatusDate(Date statusDate);

	/**
	 * @deprecated Renamed to {@link #isApproved()}
	 */
	public boolean getApproved();

	/**
	 * Returns <code>true</code> if this bookmarks entry is approved.
	 *
	 * @return <code>true</code> if this bookmarks entry is approved; <code>false</code> otherwise
	 */
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this bookmarks entry is denied.
	 *
	 * @return <code>true</code> if this bookmarks entry is denied; <code>false</code> otherwise
	 */
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this bookmarks entry is a draft.
	 *
	 * @return <code>true</code> if this bookmarks entry is a draft; <code>false</code> otherwise
	 */
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this bookmarks entry is expired.
	 *
	 * @return <code>true</code> if this bookmarks entry is expired; <code>false</code> otherwise
	 */
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this bookmarks entry is inactive.
	 *
	 * @return <code>true</code> if this bookmarks entry is inactive; <code>false</code> otherwise
	 */
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this bookmarks entry is incomplete.
	 *
	 * @return <code>true</code> if this bookmarks entry is incomplete; <code>false</code> otherwise
	 */
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this bookmarks entry is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this bookmarks entry is in the Recycle Bin; <code>false</code> otherwise
	 */
	public boolean isInTrash();

	/**
	 * Returns <code>true</code> if this bookmarks entry is pending.
	 *
	 * @return <code>true</code> if this bookmarks entry is pending; <code>false</code> otherwise
	 */
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this bookmarks entry is scheduled.
	 *
	 * @return <code>true</code> if this bookmarks entry is scheduled; <code>false</code> otherwise
	 */
	public boolean isScheduled();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(BookmarksEntry bookmarksEntry);

	public int hashCode();

	public CacheModel<BookmarksEntry> toCacheModel();

	public BookmarksEntry toEscapedModel();

	public BookmarksEntry toUnescapedModel();

	public String toString();

	public String toXmlString();
}