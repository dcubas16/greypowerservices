package org.greypowerservices.test.unit;

import static org.junit.Assert.*;

import java.util.List;

import org.greypowerservices.business.ProductFactory;
import org.greypowerservices.business.ProductFactoryManager;
import org.greypowerservices.business.ProductFactoryManagerImpl;
import org.greypowerservices.entities.Product;
import org.greypowerservices.test.data.mother.ProductMother;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class WhenGetProduct extends TestConfigurator{

	@Autowired
	ProductFactory productFactory;
	
	ProductFactoryManager productFactoryManager;
	
	@Test
	public void thenShouldReturnProductById() {
		
		productFactoryManager = new ProductFactoryManagerImpl(productFactory);
		
		Product product = productFactoryManager.getProductById(1L);
		
		assertNotNull(product);
	}
	
	@Test
	public void ifProductIdDoesntExiststhenShouldReturnNull() {
		
		productFactoryManager = new ProductFactoryManagerImpl(productFactory);
		
		Product product = productFactoryManager.getProductById(0L);

		assertNull(product);
	}
	
	@Test
	public void ifSearchTheProductP1ThenShouldReturnThatProduct() {
		
		productFactoryManager = new ProductFactoryManagerImpl(productFactory);
		
		Product product = productFactoryManager.getProductById(1L);

		assertTrue(product.equals(ProductMother.getChemicalProductP1()));
	}
	

	@Test
	public void ifSearchProductByNameThenShouldReturnProductList() {
		
		productFactoryManager = new ProductFactoryManagerImpl(productFactory);
		
		List<Product> products = productFactoryManager.getProductsByName(ProductMother.getChemicalProductP1().getName());

		assertTrue(!products.isEmpty());
	}
	
	@Test
	public void ifSearchProductByNameAndNameDoesntExistThenShouldReturnEmptyProductList() {
		
		productFactoryManager = new ProductFactoryManagerImpl(productFactory);
		
		List<Product> products = productFactoryManager.getProductsByName(ProductMother.getChemicalProductP1().getName()+"HI");

		assertTrue(products.isEmpty());
	}

}
