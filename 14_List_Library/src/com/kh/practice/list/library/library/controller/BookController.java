package com.kh.practice.list.library.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	private List<Book> bookList = new ArrayList<Book>();
	
	public BookController() {
		bookList = new ArrayList<Book>();
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	public void insertBook(Book bk) {
		bookList.add(bk);
	}
	public ArrayList<Book> selectList() {
		ArrayList<Book> bookList = new ArrayList<>();
		bookList.addAll(this.bookList);
		return bookList;
	}
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<>();
		for (Book book : bookList) {
			if(book.toString().indexOf(keyword) >= 1) {
				searchList.add(book);
			}
		}
		
		return  searchList;
	}
	public Book deleteBook(String title, String autor) {
		Book removeBook = null;
		for(int i = 0; i < bookList.size(); i++ ) {
			if(bookList.get(i).getTitle().equals(title) &&
			bookList.get(i).getAuthor().equals(autor)){
				removeBook = bookList.get(i);
				bookList.remove(i);
			}
		}
		return removeBook;
	}
	public int ascBook() {
		Collections.sort(bookList);
		return 1;
	}
}
