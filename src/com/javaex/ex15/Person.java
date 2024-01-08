package com.javaex.ex15;

public class Person {
	
	//필드
	public String name;
	private int age;
	
	
	//생성자
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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
	public void showinfo() {
		System.out.println("========================");
		System.out.println("이름: "+this.name+", 나이: "+this,age);
		System.out.println("========================");
	}

}
