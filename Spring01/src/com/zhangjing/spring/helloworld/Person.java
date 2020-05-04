package com.zhangjing.spring.helloworld;

public class Person {

	/**
	 * 构造函数
	 * @param name
	 */
	public Person(String name) {
		super();
		this.name = name;
	}

	

	/**
	 * 无参构造函数
	 */
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}



	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
	public void sayHello() {
		System.out.println("hello world!");
	}
}
