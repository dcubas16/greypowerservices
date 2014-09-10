package org.greypowerservices.test.unit;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.greypowerservices.dao.CommonApplicationDAO;
import org.greypowerservices.entities.UnitMeasure;
import org.greypowerservices.test.configurator.TestConfigurator;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class WhenGetUnitMeasure extends TestConfigurator{

	@Autowired
	CommonApplicationDAO commonApplicationDAO;
	
	@Test
	public void thenShouldReturnUnitsMeasure() {
		
		List<UnitMeasure> unitsMeasures = commonApplicationDAO.getUnitsMeasure();
		
		assertTrue(!unitsMeasures.isEmpty());
	}

}
