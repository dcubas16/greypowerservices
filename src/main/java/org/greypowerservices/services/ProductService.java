package org.greypowerservices.services;

import java.util.List;

import org.greypowerservices.entities.ChemicalProduct;
import org.greypowerservices.entities.Product;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED)
public interface ProductService {

	public Long createChemicalProduct(ChemicalProduct chemicalProduct);
	public Product getChemicalProduct(Long id);
	public List<ChemicalProduct> getAllChemicalProducts();
}
