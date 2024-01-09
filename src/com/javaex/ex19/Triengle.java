package com.javaex.ex19;

public class Triengle extends Shape {
	
	//필드
	private int width;
	private int height;
	
	
	//생성자
	public Triengle() {
	}
	
	public Triengle(int width, int height, String fillcolor, String linecolor) {
		super(fillcolor,linecolor);
		this.width = width;
		this.height = height;
	}
	
	//메소드 g/s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Triengle [width=" + width + ", height=" + height + ", getFillcolor()=" + getFillcolor()
				+ ", getLinecolor()=" + getLinecolor() + "]";
	}		
	public void draw() {
		// 사각형을 시각화 하는 복잡한 로직작동
		System.out.println("====사각형을 그렸습니다=========");
		System.out.println("가로:" + width);
		System.out.println("세로:" + height);
		System.out.println("면색:" + super.getFillcolor());
		System.out.println("선색:" + super.getLinecolor());
		System.out.println("============================");
	}

}
