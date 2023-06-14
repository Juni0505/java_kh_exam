package com.kh.practice.loop;

import java.util.Scanner;

public class LoopPractice10 {
	public void method() {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("숫자 : ");
			int num = scan.nextInt();
			if (num > 9) {
				System.out.println("9 이하의 숫자를 입력해주세요.");
			} else {
				for (; num < 10; num++) {
					for (int i = 1; i < 10; i++) {
						System.out.println(num + " * " + i + " = " + (i * num));
					}
				}
			}break;
		}
	}
}