package com.javaex.ex15;

public class Student extends Person {

	//필드
	//private String name;
	//private int age;
	private String schoolName;
	
	//생성자
	public Student() { 
	}
	
	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	public Student(String name, int age, String schoolName) {
		//부모의 생성자 호출
		//name, age 부모
		
		//super(name,age);
		
		super();
		super.setName(name);
		super.setAge(age);
		
		//자신메모리에 올리는 일
		//scholName 자신
		this.schoolName=schoolName;
		System.out.println("Student(3)");
	}
	public String getScholName() {
		return schoolName;
	}
	//메소드-gs
	public void setschoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", getName()="+getName()+", getAge()="+getAge()+"]";
	}
	
	
}
