package com.javaex.ex03;

public class Goods {

	//필드
	private String name;
	public int price;

	//생성자
	//메소드-gs
	public void setName(String name) {
		this.name = name;
		//this.는 위에 필드에 있는 내용을 받아내는거고(this.를 없애도 된다),
		//=name은 받아내는 내용
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;

	}
	//메소드-일반
	public void showInfo() {
		System.out.println("=======================================");
		System.out.println("상품명"+this.name+"   가격:"+this.price);
		System.out.println("=======================================");
	}
	
}
