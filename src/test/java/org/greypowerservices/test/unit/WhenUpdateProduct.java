package org.greypowerservices.test.unit;

import org.greypowerservices.business.ProductFactory;
import org.greypowerservices.business.ProductFactoryManager;
import org.greypowerservices.business.ProductFactoryManagerImpl;
import org.greypowerservices.test.configurator.TestConfigurator;
import org.greypowerservices.test.data.mother.ProductMother;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateOptimisticLockingFailureException;

public class WhenUpdateProduct extends TestConfigurator{

	@Autowired
	ProductFactory productFactory;
	
	ProductFactoryManager productFactoryManager;
	
	@Test
	public void thenShouldUpdateAProduct() {
		
		productFactoryManager = new ProductFactoryManagerImpl(productFactory);
		
		productFactoryManager.updateProduct(ProductMother.getUpdatedChemicalProductP101());
	}
	
	@Test(expected=HibernateOptimisticLockingFailureException.class)
	public void ifProductDoesntExistsThenShouldTriggerException() {
		
		productFactoryManager = new ProductFactoryManagerImpl(productFactory);
		
		productFactoryManager.updateProduct(ProductMother.getNotExistsUpdatedChemicalProductP1001());
	}

}
