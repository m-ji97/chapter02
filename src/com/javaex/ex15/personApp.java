package com.javaex.ex15;

public class personApp {
	
	public static void main(String[] args) {
		
		Person p01 =new Person("정우성",45);
		System.out.println(p01.toString());
		
		//p01.showinfo();
		
		Student s01 = new Student();
		s01.setName("정우성"); //부모
		s01.setAge(45);		   //부모
		s01.setSchoolName("서울고등학교");
		System.out.println(s01.toString());
	}
	

}
