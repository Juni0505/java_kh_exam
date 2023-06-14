package com.kh.practice.loop;

import java.util.Scanner;

public class LoopPractice5 {
	public void method() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하세요 : ");
		int i = scan.nextInt();
		int i1 = 1;
		int sum = 0;
		for(i1 = 1; i1 <= i; i1++) {
			sum += i1;
			if(i1 < i) {
				System.out.print(i1 + " + ");
			} else {
				System.out.print(i + " = ");
			}
			
	}	System.out.println(sum);

		}
}