package com.kh.practice3;

import java.util.Scanner;

public class Func4 {
	public void method1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String str1 = scan.next();
		System.out.println("학년을 입력하세요");
		int grade = scan.nextInt();
		System.out.println("반을 입력하세요");
		int Clss = scan.nextInt();
		System.out.println("번호를 입력하세요");
		int num = scan.nextInt();
		System.out.println("성별을 입력하세요(M/F)");
		char gender;
		gender = scan.next().charAt(0);
		if(gender == 'M') {
			gender = '남';
		} else { 
			gender = '여';
			
		}
		System.out.println("점수를 입력하세요");
		double score = scan.nextDouble();
		
		
		
		System.out.println(grade + "학년 " + Clss + "반 " + num + "번 " + str1 + gender + "학생의 성적은 " + score + "이다.");
	
		
		scan.close();
		
		
	}
}
