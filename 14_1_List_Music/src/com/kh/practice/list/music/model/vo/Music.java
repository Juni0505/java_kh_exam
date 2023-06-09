package com.kh.practice.list.music.model.vo;

import java.util.Objects;

public class Music implements Comparable<Object>{
	private String title;
	private String singer;
	
	public Music() {
		
	}
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	@Override
	public String toString() {
		return "[" + singer + " - " + title + "] ";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(singer, title);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(singer, other.singer) && Objects.equals(title, other.title);
	}
	@Override
	public int compareTo(Object o) {
		
		int result = this.singer.compareTo(((Music)o).getSinger());
		//양수 , 음수
		if(result <= -1) {
			result = 1;
		} else if(result >= 1) {
			result = -1;
		}
		return result;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	
}
