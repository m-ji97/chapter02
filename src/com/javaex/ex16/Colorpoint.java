package com.javaex.ex16;

public class Colorpoint extends Point {

	//필드
	private String color;

	//생성자
	public Colorpoint() {
	}


	public Colorpoint(String color) {
		//부모의 기본생성자 호출
		super();
		this.color = color;
		System.out.println("ColorPoint(1)");
	}
	
	/*
	public Colorpoint(int x, int y, String color) {
		super(x,y);  //부모의 피라미터2개 있는 생성자 호출
		this.color = color;
	}
	 */

	public Colorpoint(int x, int y, String color) {
		super(); //부모의 기본 생성자 호출
		super.setX(x);
		super.setY(y);
		this.color = color;

		//메소드-GS
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

		//메소드 일반
	@Override
	public String toString() {
		return "Colorpoint [color=" + color + "]";
	}
	public String print() {
		
	}

	
}