package com.kh.practice.chap01_poly.model.vo;

public class Book {
	private String title;	// 도서명
	private String autor;	// 저자명
	private String publisher;	// 출판사명
	
	
	@Override
	public String toString() {
		return "도서명 : " + title + " / " + "저자명 : " + autor + " / " + "출판사명 : " + publisher
				+ " / ";
	}

	public Book() {}
	
	public Book(String title, String autor, String publisher) {
		this.autor = autor;
		this.title = title;
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
}
