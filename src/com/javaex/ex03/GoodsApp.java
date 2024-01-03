package com.javaex.ex03;

public class GoodsApp {
	public static void main(String[] args) {
		
		//camera
		Goods camera = new Goods();
		/*camera.name = "니콘";   //private 캡슐화(필드값 보호)*/
		camera.setName("니콘");
		/*camera.price = 4000000; //private 캡슐화(필드값 보호)*/
		camera.setPrice(4000000);

		//System.out.println(camera.setname());
		System.out.println(camera.getName());

		//System.out.println(camera.setprice());
		System.out.println(camera.getPrice());
		
		camera.showInfo();
		
		//computer
		Goods computer = new Goods();
		
		computer.setName("LG그램");
		computer.setPrice(9000000);
		
		System.out.println(computer.getName());
		System.out.println(computer.getPrice());
		
		computer.showInfo();

	}
}

