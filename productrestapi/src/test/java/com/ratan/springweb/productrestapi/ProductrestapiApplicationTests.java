package com.ratan.springweb.productrestapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.ratan.springweb.productrestapi.entities.Product;

@SpringBootTest
class ProductrestapiApplicationTests {

	@Test
	public void testGetProducts() {

		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject("http://localhost:8080/productapi/products/3", Product.class);
		assertNotNull(product);
		assertEquals("IPhone", product.getName());
	}

}
