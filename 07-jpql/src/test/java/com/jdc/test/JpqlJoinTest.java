package com.jdc.test;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.jdc.app.model.dto.Category;
import com.jdc.app.model.dto.Product;

@TestMethodOrder(OrderAnnotation.class)
public class JpqlJoinTest extends AbstractTest {
	
	@Test
	@Order(1)
	void test_for_default_join() {
		var product = em.find(Category.class, 1);
		System.out.println(product);
	}
	
	@Test
	@Order(2)
	void test_for_jpql_join_to_one() {
		String jpql = "select p from Product p where p.category.id = :catId";
		
		var query = em.createQuery(jpql, Product.class);
		query.setParameter("catId", 1);
		System.out.println(query.getResultList());
	}

	@Test
	@Order(3)
	void test_for_jpql_join_to_many() {
		String jpql = "select c from Category c, Product p where c.id = p.category.id";
		
		var query = em.createQuery(jpql, Category.class);
		query.getResultStream().forEach(c -> System.out.println(c.getName()));
	}

}
