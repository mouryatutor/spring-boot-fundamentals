package com.ratan.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ratan.core.services.PaymentServiceImpl;


@SpringBootTest
class CoreApplicationTests {

	@Autowired
	PaymentServiceImpl service;

	@Test
	public void testDependdencyInjection() {
		
		assertNotNull(service);
	}

}
