/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.shopping.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ShoppingItemService}.
 *
 * @author Brian Wing Shun Chan
 * @see ShoppingItemService
 * @generated
 */
@ProviderType
public class ShoppingItemServiceWrapper implements ShoppingItemService,
	ServiceWrapper<ShoppingItemService> {
	public ShoppingItemServiceWrapper(ShoppingItemService shoppingItemService) {
		_shoppingItemService = shoppingItemService;
	}

	@Override
	public void addBookItems(long groupId, long categoryId,
		java.lang.String[] isbns)
		throws com.liferay.portal.kernel.exception.PortalException {
		_shoppingItemService.addBookItems(groupId, categoryId, isbns);
	}

	@Override
	public com.liferay.portlet.shopping.model.ShoppingItem addItem(
		long groupId, long categoryId, java.lang.String sku,
		java.lang.String name, java.lang.String description,
		java.lang.String properties, java.lang.String fieldsQuantities,
		boolean requiresShipping, int stockQuantity, boolean featured,
		java.lang.Boolean sale, boolean smallImage,
		java.lang.String smallImageURL, java.io.File smallFile,
		boolean mediumImage, java.lang.String mediumImageURL,
		java.io.File mediumFile, boolean largeImage,
		java.lang.String largeImageURL, java.io.File largeFile,
		java.util.List<com.liferay.portlet.shopping.model.ShoppingItemField> itemFields,
		java.util.List<com.liferay.portlet.shopping.model.ShoppingItemPrice> itemPrices,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _shoppingItemService.addItem(groupId, categoryId, sku, name,
			description, properties, fieldsQuantities, requiresShipping,
			stockQuantity, featured, sale, smallImage, smallImageURL,
			smallFile, mediumImage, mediumImageURL, mediumFile, largeImage,
			largeImageURL, largeFile, itemFields, itemPrices, serviceContext);
	}

	@Override
	public void deleteItem(long itemId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_shoppingItemService.deleteItem(itemId);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _shoppingItemService.getBeanIdentifier();
	}

	@Override
	public int getCategoriesItemsCount(long groupId,
		java.util.List<java.lang.Long> categoryIds) {
		return _shoppingItemService.getCategoriesItemsCount(groupId, categoryIds);
	}

	@Override
	public com.liferay.portlet.shopping.model.ShoppingItem getItem(long itemId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _shoppingItemService.getItem(itemId);
	}

	@Override
	public java.util.List<com.liferay.portlet.shopping.model.ShoppingItem> getItems(
		long groupId, long categoryId) {
		return _shoppingItemService.getItems(groupId, categoryId);
	}

	@Override
	public java.util.List<com.liferay.portlet.shopping.model.ShoppingItem> getItems(
		long groupId, long categoryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.portlet.shopping.model.ShoppingItem> obc) {
		return _shoppingItemService.getItems(groupId, categoryId, start, end,
			obc);
	}

	@Override
	public int getItemsCount(long groupId, long categoryId) {
		return _shoppingItemService.getItemsCount(groupId, categoryId);
	}

	@Override
	public com.liferay.portlet.shopping.model.ShoppingItem[] getItemsPrevAndNext(
		long itemId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.portlet.shopping.model.ShoppingItem> obc)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _shoppingItemService.getItemsPrevAndNext(itemId, obc);
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_shoppingItemService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public com.liferay.portlet.shopping.model.ShoppingItem updateItem(
		long itemId, long groupId, long categoryId, java.lang.String sku,
		java.lang.String name, java.lang.String description,
		java.lang.String properties, java.lang.String fieldsQuantities,
		boolean requiresShipping, int stockQuantity, boolean featured,
		java.lang.Boolean sale, boolean smallImage,
		java.lang.String smallImageURL, java.io.File smallFile,
		boolean mediumImage, java.lang.String mediumImageURL,
		java.io.File mediumFile, boolean largeImage,
		java.lang.String largeImageURL, java.io.File largeFile,
		java.util.List<com.liferay.portlet.shopping.model.ShoppingItemField> itemFields,
		java.util.List<com.liferay.portlet.shopping.model.ShoppingItemPrice> itemPrices,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _shoppingItemService.updateItem(itemId, groupId, categoryId,
			sku, name, description, properties, fieldsQuantities,
			requiresShipping, stockQuantity, featured, sale, smallImage,
			smallImageURL, smallFile, mediumImage, mediumImageURL, mediumFile,
			largeImage, largeImageURL, largeFile, itemFields, itemPrices,
			serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	@Deprecated
	public ShoppingItemService getWrappedShoppingItemService() {
		return _shoppingItemService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	@Deprecated
	public void setWrappedShoppingItemService(
		ShoppingItemService shoppingItemService) {
		_shoppingItemService = shoppingItemService;
	}

	@Override
	public ShoppingItemService getWrappedService() {
		return _shoppingItemService;
	}

	@Override
	public void setWrappedService(ShoppingItemService shoppingItemService) {
		_shoppingItemService = shoppingItemService;
	}

	private ShoppingItemService _shoppingItemService;
}