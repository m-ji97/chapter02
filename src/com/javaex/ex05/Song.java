package com.javaex.ex05;

public class Song {

	// 필드
	private String title;
	private String artist;
	private String album;
	private String compuser;
	private int year;
	private int track;

	// 생성자
	// 메소드-g/s
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getCompuser() {
		return compuser;
	}

	public void setCompuser(String compuser) {
		this.compuser = compuser;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	// 메소드-일반
	public void showinfo() {
		System.out.println(this.artist+", "+this.title+"("+this.album+", "+this.year+", "+this.track+"번 track, "+this.compuser+" 작곡 )");
	}
}
