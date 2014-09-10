package org.greypowerservices.services;

import java.util.List;

import org.greypowerservices.dao.CommonApplicationDAO;
import org.greypowerservices.entities.Product;
import org.greypowerservices.entities.UnitMeasure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonApplicationServiceImpl implements CommonApplicationService{
	
	@Autowired
	CommonApplicationDAO commonApplicationDAO;
	
	public List<UnitMeasure> getUnitsMeasure() {
		return commonApplicationDAO.getUnitsMeasure();
	}
}