package com.zhangjing.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		//创建spring ioc容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//获取对象
		//Person person = (Person)ctx.getBean("person");
		//Person person = ctx.getBean(Person.class);
		Person person = ctx.getBean("person",Person.class);
		//调用方法
		person.sayHello();
		System.out.println(person.getName());
		
		
	}
}
