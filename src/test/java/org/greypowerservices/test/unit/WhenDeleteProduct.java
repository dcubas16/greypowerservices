package org.greypowerservices.test.unit;

import org.greypowerservices.business.ProductFactory;
import org.greypowerservices.business.ProductFactoryManager;
import org.greypowerservices.business.ProductFactoryManagerImpl;
import org.greypowerservices.test.data.mother.ProductMother;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class WhenDeleteProduct extends TestConfigurator{

	@Autowired
	ProductFactory productFactory;
	
	ProductFactoryManager productFactoryManager;
	
	@Test
	public void thenShouldDeleteProductById() {
		
		productFactoryManager = new ProductFactoryManagerImpl(productFactory);
		
		productFactoryManager.deleteProduct(1L);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void ifProductIdDoestExistsThenShouldTriggerAException() {
		
		productFactoryManager = new ProductFactoryManagerImpl(productFactory);
		
		productFactoryManager.deleteProduct(0L);
	}
	
	@Test
	public void ifProductExistsThenShouldDeleteProduct() {
		
		productFactoryManager = new ProductFactoryManagerImpl(productFactory);
		
		productFactoryManager.deleteProduct(ProductMother.getChemicalProductP100());
	}

}
