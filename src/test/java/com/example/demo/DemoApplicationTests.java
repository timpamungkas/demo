package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void testCalc() {
	  assertEquals(10, Calculator.add(4, 6));
      assertEquals(10, Calculator.subtract(90, 80));
      assertEquals(10, Calculator.multiply(2, 5));
	}

}
