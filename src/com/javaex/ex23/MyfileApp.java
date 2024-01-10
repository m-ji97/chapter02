package com.javaex.ex23;

import java.io.IOException;

public class MyfileApp {
	
	public static void main(String[] args) {
	
	Myfile mf =new Myfile();
	
	
	
	/*
	//정상일 때
	String str=mf.read("c:/aaa.txt");
	System.out.println(str);
	*/
	
	/*
	//예외 처리가 잘 되었으나 처리 방식이 원하는 게 아닌 경우
	String str=mf.read2("c:/bbb.txt");
	System.out.println(str);
	*/
	
	try {
		mf.read3("c:/ccc.txt");
	} catch (IOException e) {
		System.out.println("can not find file");
	}

}

}
