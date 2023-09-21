package com.kh.finalSample;

public class Music {
	private String title;
	private String mood;
	
	public Music(String title) {
		this.title=title;
	}
	
	public Music(String title, String mood) {
		this.title=title;
		this.mood=mood;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getMood() {
		return mood;
	}
	
	@Override
	public String toString() {
		return title +" "  +mood;
	}
}
