package com.javaex.ex19;

public class Circle extends Shape {
	//필드
	private int radous;

	//생성자
	public Circle() {
	}

	public Circle(int radous,String fillcolor, String linecolor) {
		super(fillcolor,linecolor);
		this.radous = radous;
	}

	//메소드-g/s
	public int getRadous() {
		return radous;
	}

	public void setRadous(int radous) {
		this.radous = radous;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Circle [radous=" + radous + ", getFillcolor()=" + getFillcolor() + ", getLinecolor()=" + getLinecolor()
				+ "]";
	}
	public void draw() {
		// 사각형을 시각화 하는 복잡한 로직작동
		System.out.println("====사각형을 그렸습니다=========");
		System.out.println("반지름:" + radous);
		System.out.println("면색:" + super.getFillcolor());
		System.out.println("선색:" + super.getLinecolor());
		System.out.println("============================");
	}


}
