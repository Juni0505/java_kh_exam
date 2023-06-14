package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice1 {
	public void method11() {
		Scanner scan = new Scanner(System.in);
		System.out.println("비밀번호 입력(1000~9999) : ");
		String pw = scan.next();
		int strPw = Integer.valueOf(pw);
		char ch1 = pw.charAt(0);
		char ch2 = pw.charAt(1);
		char ch3 = pw.charAt(2);
		char ch4 = pw.charAt(3);

		if (strPw > 9999 && strPw < 1000) {
			System.out.println("자릿수 안맞음");
		} else if (strPw > 999 && strPw < 10000) {
			if (ch1 == ch2 || ch1 == ch3 || ch1 == ch4 || ch2 == ch3 || ch2 == ch4 || ch3 == ch4) {
				System.out.println("중복값 있음");
			}

		}
	}

	public void method12() {
		Scanner scan = new Scanner(System.in);
		System.out.println("비밀번호 입력(1000~9999) : ");
		int pw = scan.nextInt();
		String strPw = Integer.toString(pw);
		char ch1 = strPw.charAt(0);
		char ch2 = strPw.charAt(1);
		char ch3 = strPw.charAt(2);
		char ch4 = strPw.charAt(3);

		if (pw > 999 && pw < 10000) {
			if (ch1 == ch2 || ch1 == ch3 || ch1 == ch4 || ch2 == ch3 || ch2 == ch4 || ch3 == ch4) {
				System.out.println("중복값 있음");
			}
		}
	}

}