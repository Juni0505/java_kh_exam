package com.kh.practice.loop;

import java.util.Scanner;

public class LoopPractice7 {
	public void method() {
		Scanner scan = new Scanner(System.in);

		System.out.println("첫번째 숫자 : ");
		int num1 = scan.nextInt();

		while (num1 < 1) {
			System.out.println("1이상의 숫자를 입력하세요");
			num1 = scan.nextInt();
		}

		System.out.println("두번째 숫자 : ");
		int num2 = scan.nextInt();

		while (num2 < 1) {
			System.out.println("1이상의 숫자를 입력하세요");
			num2 = scan.nextInt();
		}

		if (num1 <= num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i);
			}
		} else {
			if (num2 <= num1) {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i);
				}
			}
		}
	}
}