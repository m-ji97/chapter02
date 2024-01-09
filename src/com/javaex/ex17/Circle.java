package com.javaex.ex17;

public class Circle {
	
	//필드
	private int radous;
	private String lineColor;
	private String fillColor;
	
	
	//생성자
	public Circle() {
	}

	public Circle(int radous, String lineColor, String fillColor) {
		super();
		this.radous = radous;
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}

	//메소드 g/s
	public int getRadous() {
		return radous;
	}

	public void setRadous(int radous) {
		this.radous = radous;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Circle [radous=" + radous + ", lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	public void draw() {
	    // 사각형을 시각화 하는 복잡한 로직작동
	    System.out.println("====원을 그렸습니다=========");
	    System.out.println("반지름:"+radous );
	    System.out.println("면색:" + fillColor);
	    System.out.println("선색:" + lineColor);
	    System.out.println("============================");
	}
	
}
