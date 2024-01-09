package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		
		//도형(부모)
		Shape s01 = new Shape();
		s01.setFillcolor("노랑");
		s01.setLinecolor("검정");
		System.out.println(s01.toString());

		//사각형(자식)
		Rectengle r01 =	new Rectengle(3,30,"빨강", "검정");
		r01.setWidth(3);
		r01.setHeight(30);
		r01.setFillcolor("빨강");
		r01.setLinecolor("검정");
		System.out.println(r01.toString());
		
		Rectengle[] rArray = new Rectengle[3];
 		
		Rectengle r02 =new Rectengle(40,40,"파랑","검정");
		System.out.println(r02.toString());
		
		Circle c01 = new Circle(5,"빨강", "검정");
		Circle c02 = new Circle(10,"파랑","검정");
		/*c01.setRadous(5);
		c01.setFillcolor("빨강");
		c01.setLinecolor("검정");
		c02.setRadous(10);
		c02.setFillcolor("파랑");
		c02.setLinecolor("검정");
		*/
		//System.out.println(c01.toString());
		//System.out.println(c02.toString());
		
		Triengle t01 = new Triengle(5, 10, "노랑", "검정");
		Triengle t02 = new Triengle(15,20, "초록","검정");
		/*t01.setWidth(5);
		t01.setHeight(10);
		t01.setFillcolor("노랑");
		t01.setLinecolor("검정");
		t02.setWidth(15);
		t02.setHeight(20);
		t02.setFillcolor("초록");
		t02.setLinecolor("검정");
		*/
		//System.out.println(t01.toString());
		//System.out.println(t02.toString());
		
		rArray[0] = r01;
		rArray[1] = r02;
		
		for(int i=0; i<rArray.length; i++) {
			System.out.println(rArray[i].toString());
		}
	
	}

}
