package com.javaex.ex15;
	
public class Student extends Person {
	
	//필드
		private String schoolName;

		//생성자
		public Student() {
			System.out.println();
		}
		
		public Student(String name, int age,String schoolName) {
			//부모의 생성자 호출
			//자신메모리에 올리는 일
			super(name,age); //부모님 코드가져오는거, 자기자신 코드는 this
			
			//name age 부모
			//schoolName 자신
			this.schoolName= schoolName;
			
		}
		public Student(String schoolName) {
			this.schoolName = schoolName;
		}
		
		//메소드 GS
		public String getschoolName() {
			return schoolName;
		}
		
		public void setSchoolName(String schoolName) {
			this.schoolName = schoolName;
		}
		
		public String toString() {
			return "학교:"+schoolName+" 이름:"+getName()+"나이:"+getAge();
		}

		//메소드
		/*@Override
		public String toString() {
			return "Student [schoolName=" + schoolName + "]";
		}*/
		
		
	
}
	
