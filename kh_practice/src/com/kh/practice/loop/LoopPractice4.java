package com.kh.practice.loop;

import java.util.Scanner;

public class LoopPractice4 {
	public void method() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1이상의 숫자를 입력하세요");
		int i = scan.nextInt();
		
		if(i > 0) {
			for(int i1 = 0; i1 < i; i1++) {
				System.out.println(i-i1);
			}
		}else {
			System.out.println("1 이상 숫자를 입력해주세요.");
			int e = scan.nextInt();
			
			if(e > 0) {
				for(int e1 = 0; e1<e; e1++) {
					System.out.println(e-e1);
				}
			}
		}
	}
}
