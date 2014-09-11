package org.greypowerservices.services.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.greypowerservices.entities.UnitMeasure;
import org.greypowerservices.services.CommonApplicationService;
import org.greypowerservices.webservices.productservice.GetUnitMeasureResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CommonApplicationServiceEndPoint {

	private static final String TARGET_NAMESPACE = "http://org/greypowerservices/webservices/productservice";
	
	@Autowired
	CommonApplicationService commonApplicationService;
	
	@PayloadRoot(localPart = "GetUnitMeasureRequest", namespace = TARGET_NAMESPACE)
	public @ResponsePayload GetUnitMeasureResponse GetUnitMeasure() {
		List<UnitMeasure> unitsMeasure = commonApplicationService.getUnitsMeasure();
		GetUnitMeasureResponse getUnitMeasureResponse = new GetUnitMeasureResponse();

		for (UnitMeasure unitMeasure : unitsMeasure) {
			org.greypowerservices.webservices.UnitMeasure unitMeasure2 = new org.greypowerservices.webservices.UnitMeasure();
			unitMeasure2.setName(unitMeasure.getName());
			unitMeasure2.setAbbreviation(unitMeasure.getAbbreviation());
			unitMeasure2.setId(unitMeasure.getId());
			getUnitMeasureResponse.getUnitMeasure().add(unitMeasure2);
		}
		
		return getUnitMeasureResponse;
	}
}
