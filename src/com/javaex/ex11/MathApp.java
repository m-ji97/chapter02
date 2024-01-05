package com.javaex.ex11;

public class MathApp {
	
	public static void main(String[] args) {
		
		Math math = new Math();
		
		System.out.println(math.Plus(2,3));
		System.out.println(math.Plus(100, 100));
		
		System.out.println(math.Plus(2.2, 5));
		System.out.println(math.Plus(5, 2.2));
		
		System.out.println(math.Plus(5.5, 2.2));
		
		System.out.println(math.Plus("안녕하세요",3));

	}
	
	
}
