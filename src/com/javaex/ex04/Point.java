package com.javaex.ex04;

public class Point {
	/*
	//필드
	int x;
	int y;
	//생성자
	//메소드-g/s
	
	public void setDrow(int x) {
		this.x=x;
	}
	public void setRow(int y) {
		this.y=y;
	}
	public int getDrow() {
		return this.x;
	}
	public int getRow() {
		return this.y;
	}
	
	//메소드-일반
	public void draw() {
		System.out.println("점[x="+this.x+", y="+this.y+"]을 그렸습니다.");
	}
	*/
	//필드
	public int x;
	public int y;
	//생성자
	//메소드-g/s
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	//메소드-일반
	public void draw() {
		System.out.println("점[x="+this.x+", y="+this.y+"]을 그렸습니다.");
	}
}
