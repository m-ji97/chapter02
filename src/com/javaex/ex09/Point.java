package com.javaex.ex09;

public class Point {

	//필드
	public int x;
	public int y;
	//생성자
	public Point() {
	}
	public Point(int x, int y) {
		//메모리에 올리는 일
		this.x = x;
		this.y = y;
		System.out.println("Point(int x, int y");
	}
	//메소드-g/s
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public int getX() {
		if(this.x<0) {
			return 0;
		}else {
			return this.x;
		}
	}
		
	public int getY() {
		return this.y;
	}
	//메소드-일반

	public String toString() {
		return "Point [x="+this.x+", y="+this.y+"]";	
	}
	public void draw() {
		System.out.println("점[x="+this.x+", y="+this.y+"]을 그렸습니다.");
	}
	public void draw(boolean action) {
		if(action==true) {
			System.out.println("점[x="+this.x+", y="+this.y+"]을 그렸습니다.");
		}else {
			System.out.println("점[x="+this.x+", y="+this.y+"]을 지웠습니다.");
		}
	}

}
