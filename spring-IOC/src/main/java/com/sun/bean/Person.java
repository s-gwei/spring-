package com.sun.bean;

public class Person {
	
	private Integer age;
	
	private String name;

	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	

}
