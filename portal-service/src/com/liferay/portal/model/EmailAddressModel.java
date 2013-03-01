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

package com.liferay.portal.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the EmailAddress service. Represents a row in the &quot;EmailAddress&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.EmailAddressModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.EmailAddressImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmailAddress
 * @see com.liferay.portal.model.impl.EmailAddressImpl
 * @see com.liferay.portal.model.impl.EmailAddressModelImpl
 * @generated
 */
public interface EmailAddressModel extends AttachedModel, AuditedModel,
	BaseModel<EmailAddress> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a email address model instance should use the {@link EmailAddress} interface instead.
	 */

	/**
	 * Returns the primary key of this email address.
	 *
	 * @return the primary key of this email address
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this email address.
	 *
	 * @param primaryKey the primary key of this email address
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the email address ID of this email address.
	 *
	 * @return the email address ID of this email address
	 */
	public long getEmailAddressId();

	/**
	 * Sets the email address ID of this email address.
	 *
	 * @param emailAddressId the email address ID of this email address
	 */
	public void setEmailAddressId(long emailAddressId);

	/**
	 * Returns the company ID of this email address.
	 *
	 * @return the company ID of this email address
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this email address.
	 *
	 * @param companyId the company ID of this email address
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this email address.
	 *
	 * @return the user ID of this email address
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this email address.
	 *
	 * @param userId the user ID of this email address
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this email address.
	 *
	 * @return the user uuid of this email address
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this email address.
	 *
	 * @param userUuid the user uuid of this email address
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this email address.
	 *
	 * @return the user name of this email address
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this email address.
	 *
	 * @param userName the user name of this email address
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this email address.
	 *
	 * @return the create date of this email address
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this email address.
	 *
	 * @param createDate the create date of this email address
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this email address.
	 *
	 * @return the modified date of this email address
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this email address.
	 *
	 * @param modifiedDate the modified date of this email address
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the fully qualified class name of this email address.
	 *
	 * @return the fully qualified class name of this email address
	 */
	public String getClassName();

	public void setClassName(String className);

	/**
	 * Returns the class name ID of this email address.
	 *
	 * @return the class name ID of this email address
	 */
	public long getClassNameId();

	/**
	 * Sets the class name ID of this email address.
	 *
	 * @param classNameId the class name ID of this email address
	 */
	public void setClassNameId(long classNameId);

	/**
	 * Returns the class p k of this email address.
	 *
	 * @return the class p k of this email address
	 */
	public long getClassPK();

	/**
	 * Sets the class p k of this email address.
	 *
	 * @param classPK the class p k of this email address
	 */
	public void setClassPK(long classPK);

	/**
	 * Returns the address of this email address.
	 *
	 * @return the address of this email address
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this email address.
	 *
	 * @param address the address of this email address
	 */
	public void setAddress(String address);

	/**
	 * Returns the type ID of this email address.
	 *
	 * @return the type ID of this email address
	 */
	public int getTypeId();

	/**
	 * Sets the type ID of this email address.
	 *
	 * @param typeId the type ID of this email address
	 */
	public void setTypeId(int typeId);

	/**
	 * Returns the primary of this email address.
	 *
	 * @return the primary of this email address
	 */
	public boolean getPrimary();

	/**
	 * Returns <code>true</code> if this email address is primary.
	 *
	 * @return <code>true</code> if this email address is primary; <code>false</code> otherwise
	 */
	public boolean isPrimary();

	/**
	 * Sets whether this email address is primary.
	 *
	 * @param primary the primary of this email address
	 */
	public void setPrimary(boolean primary);

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

	public int compareTo(EmailAddress emailAddress);

	public int hashCode();

	public CacheModel<EmailAddress> toCacheModel();

	public EmailAddress toEscapedModel();

	public EmailAddress toUnescapedModel();

	public String toString();

	public String toXmlString();
}