package com.jdc.test;

import org.junit.jupiter.api.Test;

public class JpqlProjectionTest extends AbstractTest {

	@Test
	void test() {
		String jpql = """
				select s.name, p.name, so.id, so.product.id
				from Supplier s join s.products p join SALE_ORDER so
				""";
		
		var query = em.createQuery(jpql, Object[].class);
		
		query.getResultList().stream().forEach(System.out::println);
	}
	
}
