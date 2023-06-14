package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 각각 입력하세요.");
		System.out.println("국어 : ");
		double kor = sc.nextDouble();
		System.out.println("영어 : ");
		double eng = sc.nextDouble();
		System.out.println("수학 : ");
		double math = sc.nextDouble();
		System.out.println("국영수 총합 : " + (int)(kor + eng + math));
		System.out.println("국영수 평균 : " + (int)(kor + eng + math)/3);
			
		}
}
