package com.kh.practice.loop;

import java.util.Scanner;

public class LoopPractice8 {
	public void method() {
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자 : ");
		int num = scan.nextInt();
		if (num < 1) {
			System.out.println("1이상의 정수를 입력하세요");
		} else {
			System.out.println("======" + num + "단 =====");
			for (int i = 1; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + (i * num));
			}
		}
		scan.close();
	}
}
