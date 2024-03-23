package com.ratan.sumtwonumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SumtwonumberApplication {

	@Autowired
	private static Sum sum;
	public static void main(String[] args) {
		SpringApplication.run(SumtwonumberApplication.class, args);
		
		System.out.println(sum.SumOfTwoNumber(10, 20));
	}

}
