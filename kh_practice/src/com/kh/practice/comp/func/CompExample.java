package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.println("정수 : ");
		int num = sc.nextInt();
		while (true) {
			if (num < 1) {
				System.out.println("양수가 아닙니다.");
				break;
			} else {
				for (int i = 1; i <= num; i++) {
					if (i % 2 == 1) {
						System.out.print("박");
					} else {
						System.out.print("수");
					}
				}
				break;
			}
		}
	}
	
	public void practice3() {
		System.out.println("문자열 : ");
		String str = sc.nextLine();
		System.out.println("문자 : ");
		char c = sc.nextLine().charAt(0);
		int cnt = 0;
		for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == c) {
					cnt++;
			}
		}
		System.out.println(str + " 안에 포함된 " + c + " 개수 : " + cnt);
	}
	
	public void practice4() {
		String strCnt = "";
		do {
			System.out.println("문자열 : ");
			String str = sc.nextLine();
			System.out.println("문자 : ");
			char c = sc.nextLine().charAt(0);
			int cnt = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == c) {
					cnt++;
				}
			}
			System.out.println("포함된 개수 : " + cnt);

			System.out.println("더 하시겠습니까? (y/n) : ");
			 strCnt = sc.nextLine();
			while (!strCnt.equals("y") && !strCnt.equals("n")) {
				System.out.println("잘못된 대답입니다. 다시입력해주세요.");
				System.out.println("더 하시겠습니까? (y/n) : ");
			}
		} while(strCnt.equals("y"));
	}
	
}