package com.kh.practice.loop;

import java.util.Scanner;

public class LoopPractice11 {
	public void method() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("시작 숫자 : ");
		int num1 = scan.nextInt();
		System.out.println("공차 : ");
		int num2 = scan.nextInt();
		
		int count = 1;
		int number = num1;
		while(count<11) {
			System.out.print(number + " ");
			number += num2;
			count++;
		}
		
	}
}
