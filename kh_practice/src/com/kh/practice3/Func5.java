package com.kh.practice3;

import java.util.Scanner;

public class Func5 {
	public void method1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		int age;
		age = scan.nextInt();
		if (age < 14) {
			System.out.println("어린이입니다.");
		} else if(age > 19){
			System.out.println("성인입니다");
		} else {
			System.out.println("청소년입니다.");
		}
		scan.close();
	}
}
