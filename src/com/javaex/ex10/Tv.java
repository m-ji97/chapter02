package com.javaex.ex10;

public class Tv {
	
	//필드
	int channer;
	int volume;
	boolean power;
	
	//생성자
	public Tv() {
		
	}
	public Tv(int channer, int volume, boolean power) {
		this.channer = channer;
		this.volume = volume;
		this.power = power;
	}

	//메소드-g/s
	public int getChanner() {
		return channer;
	}
	
	public void setChanner(int channer) {
		this.channer = channer;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	//메소드-일반
	@Override
	public String toString() {
		return "Tv [channer=" + channer + ", volume=" + volume + ", power=" + power + "]";
	}
	public void status() {
		System.out.println();
	}
	
}
