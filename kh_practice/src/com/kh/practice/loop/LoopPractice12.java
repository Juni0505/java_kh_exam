package com.kh.practice.loop;

import java.util.Scanner;

public class LoopPractice12 {
	public void method() {
		Scanner scan = new Scanner(System.in);

		System.out.println("연산자(+, -, *, /, %) : ");
		String s = scan.next();
		System.out.println("정수1 : ");
		int num1 = scan.nextInt();
		System.out.println("정수2 : ");
		int num2 = scan.nextInt();

	
		while (true) {
			if (!(s.equals("+")) && !(s.equals("-")) && !(s.equals("*")) && !(s.equals("/")) && !(s.equals("%"))) {
				System.out.println("없는 연산자 입니다. 다시 입력해주세요.");
			} else if (s.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				if (s.equals("%") && num2 == 0) {
					System.out.println("0으로 나눌수 없습니다. 다시입력해주세요.");
				} else if (s.equals("+")) {
					System.out.println(num1 + " " + s + " " + num2 + " = " + (num1 + num2));
				} else if (s.equals("-")) {
					System.out.println(num1 + " " + s + " " + num2 + " = " + (num1 - num2));
				} else if (s.equals("*")) {
					System.out.println(num1 + " " + s + " " + num2 + " = " + (num1 * num2));
				} else if (s.equals("/")) {
					System.out.println(num1 + " " + s + " " + num2 + " = " + (num1 / num2));
				} else if (s.equals("%")) {
					System.out.println(num1 + " " + s + " " + num2 + " = " + (num1 / num2));
				}
			} break;

		}

	}
}
