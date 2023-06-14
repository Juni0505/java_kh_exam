package com.kh.practice3;

import java.util.Scanner;

public class Func2 {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("하나의 정수를 입력하세요");
			int i = sc.nextInt();
			if( (i%2) == 1) System.out.println("홀수다");
			if( (i%2) == 0) System.out.println("짝수다");
	} 
}
