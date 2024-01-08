package com.javaex.ex16;

public class PointApp {
	
	public static void main(String[] args) {
		
		Point p01 = new Point(2,2);
		//System.out.println(p01.toString());
		
		p01.draw();
		
		Point p02 = new Point(30,30);
		
		p02.draw();
		
		Colorpoint c01 =new Colorpoint();
		c01.setX(99);
		c01.setY(99);
		c01.setColor("노랑");
		c01.draw();
	}

}
