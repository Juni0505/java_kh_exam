package com.kh.practice3;

import java.util.Scanner;

public class Func1 {
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("하나의 정수를 입력하세요");
		int a = sc.nextInt();
		if(a < 0) System.out.println("양수가 아니다");
		if(a > 0) System.out.println("양수다");
		if(a == 0) System.out.println("0이다");
	}
}
