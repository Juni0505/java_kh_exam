package com.kh.practice3;

import java.util.Scanner;

public class Func8 {
	public void method1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 두개를 입력하세요");
		int i1 = scan.nextInt();
		int i2 = scan.nextInt();
		System.out.println("또다른 정수를 입력하세요");
		int i3 = scan.nextInt();
		if(i3 <= i1 || i3 > i2) {
			System.out.println("True");
		}
		else {
			System.out.println("Fales");
		}
		scan.close();
	}

}
