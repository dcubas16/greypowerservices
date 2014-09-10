package org.greypowerservices.services;

//import org.greypowerservices.entities.Product;
import java.util.List;
import org.greypowerservices.entities.UnitMeasure;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Transactional(propagation = Propagation.REQUIRED)
public interface CommonApplicationService {

	public List<UnitMeasure> getUnitsMeasure();
}
