package com.javaex.ex11;

public class Math {
	//필드
	
	//생성자
	
	
	
	//메소드-g/s
	
	//메소드-일반
	public 	int Plus(int a,int b) {
		int sum = a+b; //복잡한 식
		return sum;
	}
	public double Plus(double a, int b) {
		double sum = a+b;
		return sum;
	}
	public double Plus(int a, double b) {
		double sum = a+b;
		return sum;
	}
	public double Plus(double a, double b ) {
		double sum = a+b;
		return sum;
	}
	public String Plus(String a,double b) {
		String sum=a;
		for(int i=0; i<b; i++) {
			sum = sum+a;
		}return sum;
	}
	
}
