package com.kh.practice.loop;

import java.util.Scanner;

public class LoopPractice2 {
	public void method() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int i = scan.nextInt();
		int i1;
		if (i > 0) {
			for (i1 = 1; i1 <= i; i1++) {
				System.out.println(i1);
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			int e = scan.nextInt();
			int e1;
			if (e > 0) {
				for (e1 = 1; e1 <= e; e1++) {
					System.out.println(e1);
				}
			}
		}
	}
}
