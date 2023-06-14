package com.kh.practice3;

import java.util.Scanner;

public class Func6 {
	public void method1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어,영어,수학 점수를 입력하세요");
		System.out.println("국어 : ");
		int kor = scan.nextInt();
		System.out.println("영어 : ");
		int eng = scan.nextInt();
		System.out.println("수학 : ");
		int math = scan.nextInt();
		
		System.out.println("합계 = " + (int)(kor + eng + math));
		System.out.println("평균 = " + (double)(kor + eng + math)/3);
		if((int)(kor+eng+math)/3 >= 60 ) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		scan.close();
	}
	
}
