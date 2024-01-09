package com.javaex.ex17;

public class TriengleApp {
	
	public static void main(String[] args) {
		
		Triengle[] tArray = new Triengle[3];
		
		Triengle t01 = new Triengle(5,10,"파랑","빨강");
		Triengle t02 = new Triengle(10,10,"노랑","노랑");
		Triengle t03 = new Triengle(20,20,"빨강","빨강");
		
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		t01.draw();
		t02.draw();
		t03.draw();
		
		for(int i = 0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
	}

}
