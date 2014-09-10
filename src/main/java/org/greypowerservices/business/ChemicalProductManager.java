package org.greypowerservices.business;
import java.util.List;

import org.greypowerservices.dao.ProductDAO;
import org.greypowerservices.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChemicalProductManager implements ProductManager {

	@Autowired
	private ProductDAO productDAO;
	
	ActionResponseMessage actionResponseMessage;
		
	public Long createProduct(Product product) {
		
		return productDAO.createProduct(product);
	}

	public void updateProduct(Product product) {
		
		productDAO.updateProduct(product);
	}

	public void deleteProduct(Product product) {
		productDAO.deleteProduct(product);
	}

	public Product getProductById(Long id) {
		
		return productDAO.getProduct(id);
		
	}

	public ActionResponseMessage setProductPrice(double price, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteProduct(Long id) {
		
		productDAO.deleteProduct(id);
	}

	public List<Product> getProductsByName(String name) {
		return productDAO.getProductsByName(name);
	}

	public List<Product> getAllProducts() {
		return productDAO.getAllProducts();
	}

}
