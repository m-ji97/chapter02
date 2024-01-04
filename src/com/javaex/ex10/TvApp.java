package com.javaex.ex10;

public class TvApp {
	public static void main(String[] args) {
		Tv tv = new Tv();
		
		tv.power(true);
		tv.volume(120); //100dmfh 유지
		tv.status();
		
		tv.volume(false);
		tv.status();
		
		tv.channer(0);
		tv.status();
		
		tv.channer(true);
		tv.channer(true);
		tv.channer(true);
		tv.status();
		
		tv.power(false);
		tv.status();
	}

}
