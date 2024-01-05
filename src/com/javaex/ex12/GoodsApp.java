package com.javaex.ex12;

public class GoodsApp {
	public static void main(String[] args) {
		//필드
		
		//생성자
		
		//메소드 gs
		
		//메소드 일반
		
		System.out.println(Goods.count);
		
		Goods camera = new Goods("니콘", 40000);
		System.out.println(camera.toString());
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(9000000);
		System.out.println(computer.toString());
		
		Goods cup = new Goods("머그컵", 2000);
		System.out.println(cup.toString());
		
		//cup.setCount(100); //setCount() 없는게 좋다
		//System.out.println(cup.toString());
		
		//System.out.println(cup.getCount());
		//System.out.println(computer.getCount());
		System.out.println(camera.count);
		
		System.out.println(Goods.count);
		

	}
	
	
}
