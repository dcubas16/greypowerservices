package org.greypowerservices.business;

import java.util.List;

import org.greypowerservices.entities.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductFactoryManagerImpl implements ProductFactoryManager{

	ProductFactory productFactory;
	
	public ProductFactoryManagerImpl() {

	}

	public ProductFactoryManagerImpl(ProductFactory productFactory) {
		this.productFactory = productFactory;
	}

	public Long createProduct(Product product) {

		return this.productFactory.createProduct(product);
	}

	public Product getProductById(Long id) {

		return this.productFactory.getProductById(id);

	}

	public void deleteProduct(Long id) {
		
		this.productFactory.deleteProduct(id);
	}

	public void deleteProduct(Product product) {
		this.productFactory.deleteProduct(product);
	}

	public void updateProduct(Product product) {
		this.productFactory.updateProduct(product);
	}

	public List<Product> getProductsByName(String name) {
		
		return this.productFactory.getProductsByName(name);
	}


}
