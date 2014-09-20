package org.greypowerservices.business;

import java.util.List;

import org.greypowerservices.entities.ChemicalProduct;
import org.greypowerservices.entities.Product;

public interface ProductFactory {
	
	public Long createProduct(Product product);
	public void updateProduct(Product product);
	public void deleteProduct(Product product);
	public Product getProductById(Long id);
	public void deleteProduct(Long id);
	public List<Product> getProductsByName(String name);
	public List<Product> getAllProducts();
	public List<ChemicalProduct> getAllChemicalProducts();
	
}
