package org.greypowerservices.test.unit;

import static org.junit.Assert.assertNotNull;
import org.greypowerservices.entities.Product;
import org.greypowerservices.services.ProductService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class CopyOfWhenGetProduct extends TestConfigurator{

//	@Autowired
//	ProductFactory productFactory;
//	
//	ProductFactoryManager productFactoryManager;
	
	@Autowired
	ProductService productService;
	
	@Test
	public void thenShouldReturnProductByIdFromService() {
		
//		productFactoryManager = new ProductFactoryManagerImpl(productFactory);
//		
//		Product product = productFactoryManager.getProductById(1L);
		
//		assertNotNull(product);
		
		Product product = productService.getChemicalProduct(1L);
		assertNotNull(product);
	}
}
