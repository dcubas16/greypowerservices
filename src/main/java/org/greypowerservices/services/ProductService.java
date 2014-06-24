package org.greypowerservices.services;

import org.greypowerservices.entities.ChemicalProduct;
import org.greypowerservices.entities.Product;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED)
public interface ProductService {

	public Product getChemicalProduct(Long id);
	public Long createChemicalProduct(ChemicalProduct chemicalProduct);
}
