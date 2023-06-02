package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();

	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		System.out.println("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		if (gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f') {
			Member mem = new Member(name, age, gender);
			lc.insertMember(mem);

		} else {
			System.out.println("성별을 다시 입력해주세요.");
		}
		while (true) {
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int c = sc.nextInt();
			if (c == 1) {
				System.out.println(lc.myInfo());
			} else if (c == 2) {
				selectAll();
			} else if (c == 3) {
				searchBook();
			} else if (c == 4) {
				rentBook();
			} else if (c == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}

	public void selectAll() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "번 도서 :" + lc.selectAll()[i]);
		}
	}

	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
		String serachKeyword = sc.next();
		for (int i = 0; i < 5; i++) {
			if (lc.searchBook(serachKeyword)[i] != null) {
				System.out.println(lc.searchBook(serachKeyword)[i]);
			}
		}
	}

	public void rentBook() {
		selectAll();
		System.out.print("대여할 도서 번호 선택 : ");
		int rNum = sc.nextInt();
		if(lc.rentBook(rNum) == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		}else if(lc.rentBook(rNum) == 1) {
			System.out.println("나이 제한으로 대여 불가능 입니다.");
		}else if(lc.rentBook(rNum) == 2) {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니"
					+ " 마이페이지에서 확인하세요.");
		}
	}

}
