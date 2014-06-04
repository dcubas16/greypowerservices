package org.greypowerservices.business;

import org.greypowerservices.entities.Product;

public interface ProductManager extends ProductFactory {

	public ActionResponseMessage setProductPrice(double price, Product product);

}
