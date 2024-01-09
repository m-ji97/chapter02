package com.javaex.ex18;

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


}
