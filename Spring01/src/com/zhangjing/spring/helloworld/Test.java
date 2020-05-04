package com.zhangjing.spring.helloworld;

import static org.junit.Assert.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.Test
	public void test() {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("spring-di");
	}

}
