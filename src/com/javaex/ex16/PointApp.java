package com.javaex.ex16;

public class PointApp {
	
	public static void main(String[] args) {
		
		Point p01 = new Point(2,2);
		//System.out.println(p01.toString());
		p01.draw();
		p01.x = 3; //되지 않는다(가정)--> 되는 이유는 같은패키지라서
		p01.setX(3);
		
		Point p02 = new Point(30,30);
		p02.draw();
		
		Colorpoint c01 =new Colorpoint();
		//"Point()" --> "Colorpoint()"
		c01.setX(99);
		c01.setY(99);
		c01.setColor("노랑");
		c01.draw();
	}

}
