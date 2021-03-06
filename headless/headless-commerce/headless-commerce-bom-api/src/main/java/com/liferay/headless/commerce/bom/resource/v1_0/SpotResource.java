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

package com.liferay.headless.commerce.bom.resource.v1_0;

import com.liferay.headless.commerce.bom.dto.v1_0.Spot;
import com.liferay.portal.kernel.model.Company;

import javax.annotation.Generated;

import javax.ws.rs.core.Response;

/**
 * To access this resource, run:
 *
 *     curl -u your@email.com:yourpassword -D - http://localhost:8080/o/commerce-bom/1.0
 *
 * @author Alessio Antonio Rendina
 * @generated
 */
@Generated("")
public interface SpotResource {

	public Spot postAreaIdSpot(Long id, Spot spot) throws Exception;

	public Response deleteAreaIdSpot(Long id, Long spotId) throws Exception;

	public Response putAreaIdSpot(Long id, Long spotId, Spot spot)
		throws Exception;

	public void setContextCompany(Company contextCompany);

}