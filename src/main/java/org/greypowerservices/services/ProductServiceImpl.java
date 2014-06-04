package org.greypowerservices.services;

import org.greypowerservices.business.ProductFactory;
import org.greypowerservices.business.ProductFactoryManager;
import org.greypowerservices.business.ProductFactoryManagerImpl;
import org.greypowerservices.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductFactory productFactory;
	
	private ProductFactoryManager productFactoryManager;
	
	public Product getChemicalProduct(Long id) {
		
		productFactoryManager = new ProductFactoryManagerImpl(productFactory);
		
		Product product = productFactoryManager.getProductById(id);
		
		return product;
	}
	
}
