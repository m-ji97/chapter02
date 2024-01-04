package com.javaex.ex07;

public class PointApp {
	public static void main(String[] args) {
		Point p0 = new Point();
		p0.setX(2);
		p0.setY(5);
		//System.out.println(p0.toString());
		p0.draw();
		
		Point p1 = new Point(2);
		p1.setY(22);
		//System.out.println(p1.toString());
		p1.draw();
		Point p2 = new Point(100,100);
		//System.out.println(p2.toString());
		p2.draw();
		
		Point p3 = new Point(10,23);
		p3.row();
		
		System.out.println();
	}
	
	

}
