package com.javaex.ex05;

public class Song {
	
	//필드
	public String title;
	public String artist;
	public String album;
	public String compuser;
	public String year;
	public String track;
	
	//생성자
	//메소드-g/s
	public void setTitle(String title) {
		this.title=title;
	}
	public void setArtist(String artist) {
		this.artist=artist;
	}
	public void setAlbum(String album) {
		this.album=album;
	}
	public void setCompuser(String compuser) {
		this.compuser=compuser;
	}
	public void setYear(String year) {
		this.year=year;
	}
	public void setTrack(String track) {
		this.track=track;
	}
	public String getTitle() {
		return this.title;
	}
	public String getArtist() {
		return this.artist;
	}
	public String getAlbum() {
		return this.album;
	}
	public String getCompuser() {
		return this.compuser;
	}
	public String getYear() {
		return this.year;
	}
	public String getTrack() {
		return this.track;
	}
	
	//메소드-일반
	public void showinfo() {
		System.out.println(this.artist+", "+this.title+"("+this.album+", "+this.year+", "+this.track+" track, "+this.compuser+" 작곡 )");
	}

}
