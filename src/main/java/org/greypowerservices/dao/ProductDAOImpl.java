package org.greypowerservices.dao;

import java.util.ArrayList;
import java.util.List;

import org.greypowerservices.entities.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl extends HibernateDaoSupport implements ProductDAO {

	@Autowired
	public void init(SessionFactory factory) {
		setSessionFactory(factory);
	}

	public Long createProduct(Product product) {

		return (Long) getHibernateTemplate().save(product);
	}

	public Product getProduct(Long id) {

		return getHibernateTemplate().get(Product.class, id);
	}

	public void deleteProduct(Long id) {

		Product product = getProduct(id);
		getHibernateTemplate().delete(product);
	}

	public void updateProduct(Product product) {

		getHibernateTemplate().update(product);
	}

	@SuppressWarnings("unchecked")
	public List<Product> getProductsByName(String name) {

		Object objectProducts = getHibernateTemplate().find(
				"FROM Product p  WHERE UPPER(TRIM(NAME)) LIKE '%"
						+ name.trim().toUpperCase() + "%'");
		List<Product> products = new ArrayList<Product>();

		if (!objectProducts.equals(null) && objectProducts instanceof List) {
			products = (List<Product>) objectProducts;
		}

		return products;
	}

	public void deleteProduct(Product product) {
		getHibernateTemplate().delete(product);
		
	}

}
