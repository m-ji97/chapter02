package com.javaex.ex18;

public class Rectengle extends Shape {

	//필드
	private int width;
	private int height;


	//생성자
	public Rectengle() {
		//super();
	}

	public Rectengle(int width, int height, String fillcolor, String linecolor) {

		/*
		super();
		super.setFillcolor(fillcolor);
		super.setLinecolor(linecolor);
		this.width = width;
		this.height = height;
		 */

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
		return "Rectengle [width=" + width + ", height=" + height + ", getFillcolor()=" + super.getFillcolor()
		+ ", getLinecolor()=" + super.getLinecolor() + "]";
	}

}
