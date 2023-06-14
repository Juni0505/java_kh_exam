package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	

	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		char a = sc.nextLine().charAt(0);
		System.out.println(a + " 유니코드 : " + (int)a);
		char A = sc.nextLine().charAt(0);
		System.out.println(A + "유니코드 : " + (int)a);
	}

}
