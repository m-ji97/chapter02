package com.javaex.ex15;

public class Person {
	
	//필드
	public String name;
	private int age;
	
	
	//생성자
	public Person() {
		System.out.println("Person()");
	}
	
	public Person(String name, int age) {
		//자신의 메모리에 올린다
		this.name = name;
		this.age = age;
		System.out.println("Person(2)");
	}
	//메소드 gs
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//메소드일반
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
