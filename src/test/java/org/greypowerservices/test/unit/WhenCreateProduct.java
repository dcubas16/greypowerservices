package org.greypowerservices.test.unit;

import javax.validation.ConstraintViolationException;

import junit.framework.Assert;

import org.greypowerservices.business.ProductFactory;
import org.greypowerservices.business.ProductFactoryManager;
import org.greypowerservices.business.ProductFactoryManagerImpl;
import org.greypowerservices.test.data.mother.ProductMother;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class WhenCreateProduct  extends TestConfigurator {

	@Autowired
	ProductFactory productFactory;
	
	ProductFactoryManager productFactoryManager;
	
	@Test
	public void thenShouldCreateChemicalProduct(){
		
		productFactoryManager = new ProductFactoryManagerImpl(productFactory);
		
		Long id = productFactoryManager.createProduct(ProductMother.getChemicalProductP2());
		
		Assert.assertNotNull(id);
	}
	
	@Test(expected = ConstraintViolationException.class)
	public void ifProductDoentHaveNameThenShouldReturnException(){
		
		productFactoryManager = new ProductFactoryManagerImpl(productFactory);
		
		productFactoryManager.createProduct(ProductMother.getChemicalProductWithoutName());
	}
	
}
