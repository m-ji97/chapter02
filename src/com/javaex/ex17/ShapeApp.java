package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {

		Ractangle[] rArray = new Ractangle[3];
		Triengle[] tArray = new Triengle[3];
		Circle[] cArray = new Circle[3];

		Ractangle r01 = new Ractangle("파랑","빨강", 5, 10);
		Ractangle r02 = new Ractangle("노랑","노랑", 10, 10);
		Ractangle r03 = new Ractangle("빨강","빨강", 20, 20);

		//배열에 사각형(주소) 담기
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;

		r01.draw();
		r02.draw();
		r03.draw();

		for(int i =0; i<rArray.length; i++) {
			rArray[i].draw();

		}
		//삼각형 생성
		Triengle t01 = new Triengle( 5, 10,"파랑","빨강");
		Triengle t02 = new Triengle( 10, 10,"노랑","노랑");
		Triengle t03 = new Triengle( 20, 20,"빨강","빨강");

		//배열에 삼각형(주소) 담기
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;

		//배열을 통해서 삼각형 그리기
		for(int i =0; i<tArray.length; i++) {
			tArray[i].draw();

		}
		Circle c01 = new Circle( 5,"파랑","빨강");
		Circle c02 = new Circle( 10,"노랑","노랑");
		Circle c03 = new Circle( 20,"빨강","빨강");

		//배열에 원(주소) 담기
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;

		//배열을 통해서 원 그리기
		for(int i =0; i<cArray.length; i++) {
			cArray[i].draw();

		}
	}
}