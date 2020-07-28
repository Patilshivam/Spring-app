package com.springapp;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringAppApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void test_method_1() {
		Demo d = new Demo();
		d.DoSomething(true);
	}
}
