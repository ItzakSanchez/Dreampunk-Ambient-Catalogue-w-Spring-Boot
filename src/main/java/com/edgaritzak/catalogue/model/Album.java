package com.edgaritzak.catalogue.model;

public class Album {
	private String title;
	private String artist;
	private String genre;
	private int year;
	private String albumCover;
	private String source;
	
	public Album(String title,String artist, String genre, int year, String albumCover, String source) {
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.year = year;
		this.albumCover = albumCover;
		this.source = source;
		
		
		
	}

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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getAlbumCover() {
		return albumCover;
	}

	public void setAlbumCover(String albumCover) {
		this.albumCover = albumCover;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
}
