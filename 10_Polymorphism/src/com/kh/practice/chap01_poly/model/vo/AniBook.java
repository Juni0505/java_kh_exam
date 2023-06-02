package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book{
	private int accessAge;
	
	
	public AniBook() {}
	
	public AniBook(String title, String autor, String publisher, int accessAge) {
		super(title, autor,  publisher);
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		super.toString();
		return "AniBook [" + super.toString() + "나이 제한 : " + accessAge + "]";
	}

	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	
	
	
}
