package com.kh.practice.list.library.view;

import java.util.Scanner;

import com.kh.practice.list.library.library.controller.BookController;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		System.out.println("== Welcom KH Library ==");
		System.out.println();
		System.out.println("=====***** 메인 메뉴 *****=====");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 명 오름차순 정렬");
		System.out.println("9. 종료");
		System.out.println();
		System.out.println("메뉴 번호 선택 : ");
		int selectNum = sc.nextInt();
		while(true) {
			if(selectNum == 1) {
				insertBook();
				break;
			}else if(selectNum == 2) {
				selectList();
				break;
			}else if(selectNum == 3) {
				searchBook();
				break;
			}else if(selectNum == 4) {
				deleteBook();
				break;
			}else if(selectNum == 5) {
				ascBook();
				break;
			}else if(selectNum == 9) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("번호를 다시 확인해서 입력해주세요.");
			}
		}
	}
	public void insertBook() {
		
	}
	public void selectList() {
		
	}
	public void searchBook() {
		
	}
	public void deleteBook() {
		
	}
	public void ascBook() {
		
	}
	
	
	
	
	
}
