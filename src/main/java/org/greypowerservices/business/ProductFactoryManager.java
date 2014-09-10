package org.greypowerservices.business;
import java.util.List;

import org.greypowerservices.entities.Product;

public interface ProductFactoryManager {

	public Long createProduct(Product product);
	public Product getProductById(Long id);
	public void deleteProduct(Long id);
	public void deleteProduct(Product product);
	public void updateProduct(Product product);
	public List<Product> getProductsByName(String name);
	public List<Product> getAllProducts();
	
}
