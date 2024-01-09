package com.javaex.ex17;

public class Ractangle {

	//필드
	private String lineColor;
	private String fillColor;
	private int width;
	private int height;


	//생성자
	public Ractangle() {
	}	//메모리 올리는일


	public Ractangle(String linecolor, String fillcolor,int width, int helght) {
		//메모리 올리는일
		this.width = width;
		this.height = helght;
		this.lineColor = linecolor;
		this.fillColor = fillcolor;
	}

	//메소드 g/s
	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHelght() {
		return height;
	}


	public void setHelght(int helght) {
		this.height = helght;
	}


	public String getLinecolor() {
		return lineColor;
	}


	public void setLinecolor(String linecolor) {
		this.lineColor = linecolor;
	}


	public String getFillcolor() {
		return fillColor;
	}


	public void setFillcolor(String fillcolor) {
		this.fillColor = fillcolor;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Ractangle [linecolor=" + lineColor + ", fillcolor=" + fillColor + ", width=" + width + ", helght="
				+ height + "]";
	}
	public void draw() {
	    // 사각형을 시각화 하는 복잡한 로직작동
	    System.out.println("====사각형을 그렸습니다=========");
	    System.out.println("가로:" + width);
	    System.out.println("세로:" + height);
	    System.out.println("면색:" + fillColor);
	    System.out.println("선색:" + lineColor);
	    System.out.println("============================");
	}

}
