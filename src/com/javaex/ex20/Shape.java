package com.javaex.ex20;

public abstract class Shape {
	
	//필드
	private String fillcolor;
	private String linecolor;
	
	//생성자
	public Shape() {
	}

	public Shape(String fillcolor, String linecolor) {
		this.fillcolor = fillcolor;
		this.linecolor = linecolor;
	}

	//메소드 - g/s
	public String getFillcolor() {
		return fillcolor;
	}

	public void setFillcolor(String fillcolor) {
		this.fillcolor = fillcolor;
	}

	public String getLinecolor() {
		return linecolor;
	}

	public void setLinecolor(String linecolor) {
		this.linecolor = linecolor;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Shape [fillcolor=" + fillcolor + ", linecolor=" + linecolor + "]";
	}
	//draw() X
	public abstract void draw();
	
	//면적구하는 메소드
	public abstract double area();
	

}
