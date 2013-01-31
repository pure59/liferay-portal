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

package com.liferay.portlet.journal.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.model.StagedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the JournalFolder service. Represents a row in the &quot;JournalFolder&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.journal.model.impl.JournalFolderModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.journal.model.impl.JournalFolderImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JournalFolder
 * @see com.liferay.portlet.journal.model.impl.JournalFolderImpl
 * @see com.liferay.portlet.journal.model.impl.JournalFolderModelImpl
 * @generated
 */
public interface JournalFolderModel extends BaseModel<JournalFolder>,
	GroupedModel, StagedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a journal folder model instance should use the {@link JournalFolder} interface instead.
	 */

	/**
	 * Returns the primary key of this journal folder.
	 *
	 * @return the primary key of this journal folder
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this journal folder.
	 *
	 * @param primaryKey the primary key of this journal folder
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this journal folder.
	 *
	 * @return the uuid of this journal folder
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this journal folder.
	 *
	 * @param uuid the uuid of this journal folder
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the folder ID of this journal folder.
	 *
	 * @return the folder ID of this journal folder
	 */
	public long getFolderId();

	/**
	 * Sets the folder ID of this journal folder.
	 *
	 * @param folderId the folder ID of this journal folder
	 */
	public void setFolderId(long folderId);

	/**
	 * Returns the group ID of this journal folder.
	 *
	 * @return the group ID of this journal folder
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this journal folder.
	 *
	 * @param groupId the group ID of this journal folder
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this journal folder.
	 *
	 * @return the company ID of this journal folder
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this journal folder.
	 *
	 * @param companyId the company ID of this journal folder
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this journal folder.
	 *
	 * @return the user ID of this journal folder
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this journal folder.
	 *
	 * @param userId the user ID of this journal folder
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this journal folder.
	 *
	 * @return the user uuid of this journal folder
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this journal folder.
	 *
	 * @param userUuid the user uuid of this journal folder
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this journal folder.
	 *
	 * @return the user name of this journal folder
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this journal folder.
	 *
	 * @param userName the user name of this journal folder
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this journal folder.
	 *
	 * @return the create date of this journal folder
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this journal folder.
	 *
	 * @param createDate the create date of this journal folder
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this journal folder.
	 *
	 * @return the modified date of this journal folder
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this journal folder.
	 *
	 * @param modifiedDate the modified date of this journal folder
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the parent folder ID of this journal folder.
	 *
	 * @return the parent folder ID of this journal folder
	 */
	public long getParentFolderId();

	/**
	 * Sets the parent folder ID of this journal folder.
	 *
	 * @param parentFolderId the parent folder ID of this journal folder
	 */
	public void setParentFolderId(long parentFolderId);

	/**
	 * Returns the name of this journal folder.
	 *
	 * @return the name of this journal folder
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this journal folder.
	 *
	 * @param name the name of this journal folder
	 */
	public void setName(String name);

	/**
	 * Returns the description of this journal folder.
	 *
	 * @return the description of this journal folder
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this journal folder.
	 *
	 * @param description the description of this journal folder
	 */
	public void setDescription(String description);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(JournalFolder journalFolder);

	public int hashCode();

	public CacheModel<JournalFolder> toCacheModel();

	public JournalFolder toEscapedModel();

	public JournalFolder toUnescapedModel();

	public String toString();

	public String toXmlString();
}