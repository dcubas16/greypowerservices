package org.greypowerservices.services;

import java.util.List;

import org.greypowerservices.business.ProductFactory;
import org.greypowerservices.business.ProductFactoryManager;
import org.greypowerservices.business.ProductFactoryManagerImpl;
import org.greypowerservices.entities.ChemicalProduct;
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

	public Long createChemicalProduct(ChemicalProduct chemicalProduct) {
		
		productFactoryManager = new ProductFactoryManagerImpl(productFactory);
		
		Long id = productFactoryManager.createProduct(chemicalProduct);
		
		return id;
	}

	public List<ChemicalProduct> getAllChemicalProducts() {
		productFactoryManager = new ProductFactoryManagerImpl(productFactory);
		
		return productFactoryManager.getAllChemicalProducts();
		
	}

}
