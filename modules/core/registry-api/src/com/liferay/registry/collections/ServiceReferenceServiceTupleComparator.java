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

package com.liferay.registry.collections;

import com.liferay.registry.ServiceReference;

import java.util.Comparator;

/**
* @author Carlos Sierra Andrés
*/
public class ServiceReferenceServiceTupleComparator<S>
	implements Comparator<ServiceReferenceServiceTuple<S>> {

	public ServiceReferenceServiceTupleComparator(
		Comparator<ServiceReference<S>> delegatee) {

		_delegatee = delegatee;
	}

	@Override
	public int compare(
		ServiceReferenceServiceTuple<S> sr1,
		ServiceReferenceServiceTuple<S> sr2) {

		if (sr1 == null) {
			if (sr2 == null) {
				return 0;
			}

			return -1;
		}

		return _delegatee.compare(
			sr1.getServiceReference(), sr2.getServiceReference());
	}

	private Comparator<ServiceReference<S>> _delegatee;

}