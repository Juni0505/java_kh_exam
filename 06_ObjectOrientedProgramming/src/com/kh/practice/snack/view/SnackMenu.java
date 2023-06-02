package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
		
		System.out.println("스낵류를 입력하세요.");
		System.out.println("종류: ");
		String kind = sc.nextLine();
		System.out.println("이름: ");
		String name = sc.nextLine();
		System.out.println("맛 : ");
		String flavor = sc.nextLine();
		System.out.println("개수 : ");
		int numOf = sc.nextInt();
		System.out.println("가격 : " );
		int price = sc.nextInt();
		sc.nextLine();
		
		scr.saveData(kind,name,flavor,numOf,price);
		System.out.println("저장 완료되었습니다.");
		System.out.println("저장된 정보를 확인하겠습니까? (y/n) :");
		if(sc.nextLine().charAt(0) == 'y')
			System.out.println(scr.confirmData());
	}
	
}
