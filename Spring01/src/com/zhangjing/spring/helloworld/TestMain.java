package com.zhangjing.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		//����spring ioc��������
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//��ȡ����
		//Person person = (Person)ctx.getBean("person");
		//Person person = ctx.getBean(Person.class);
		Person person = ctx.getBean("person",Person.class);
		//���÷���
		person.sayHello();
		System.out.println(person.getName());
		
		
	}
}
