package com.kh.practice3;

import java.util.Scanner;

public class Func9 {
	public void method1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("세 개의 정수를 입력하세요");
		int i1 = scan.nextInt();
		int i2 = scan.nextInt();
		int i3 = scan.nextInt();
		if(i1 == i2 && i2 == i3) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		scan.close();
	}
}
