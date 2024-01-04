package com.javaex.ex10;

public class Tv {

	//필드
	int channel;
	int volume;
	boolean power;

	//생성자
	public Tv (int channel, int volume, boolean power) {
		this.channel=channel;
		this.power=power;
		this.volume=volume;
	}

	//메소드-g/s
	public int getChanner() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	//메소드-일반
	public void power(boolean on) {
		if(on==true) {
			this.power=true;
		}else {
			this.power=false;
		}
	}public void volume(int volume) {
		if(volume>100) {
			this.volume=100;
		}else if(volume<=1) {
			this.volume=1;
		}
	}public void volume(boolean up) {
		if(up==true) {
			++this.volume;
		}
		else {
			--this.volume;
		}
	}public void channel(int channel) {
		if(channel>=255) {
			this.channel = 255;
		}else if(channel<=1) {
			this.channel=1;
		}
	}public void channel(boolean up) {
		if(up==true) {
			++this.channel;
		}else {
			--this.channel;
		}
	}public void status() {
		System.out.println("this.channel+this.volume+this.power");
	}

}
