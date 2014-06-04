package org.greypowerservices.dao;

import java.util.List;

import org.greypowerservices.entities.Product;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED)
public interface ProductDAO {
		
	public Long createProduct(Product product);
	
	public Product getProduct(Long id);

	public void updateProduct(Product product);

	public List<Product> getProductsByName(String name);

	public void deleteProduct(Product product);

	public void deleteProduct(Long id);
	
}
