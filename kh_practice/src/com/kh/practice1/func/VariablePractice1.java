package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public static int cnt = 10;
	
	
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 :   ");
		String name = sc.nextLine();
		System.out.println("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		System.out.println("키 " + height + "cm " + age + "살 " + gender +  name + " 님 반갑습니다 ^^");
				
		sc.close();
		
		/*
		이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.

		ex.
		이름을 입력하세요 : 아무개
		성별을 입력하세요(남/여) : 남
		나이를 입력하세요 : 20
		키를 입력하세요(cm) : 180.5

		키 180.5cm인 20살 남자 아무개님 반갑습니다^^
		*/
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두개를 입력해주세요");
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		System.out.println("===============");
		System.out.println(a1 + b1);
		System.out.println(a1 - b1);
		System.out.println(a1 * b1);
		System.out.println(a1 / b1);
		
		sc.close();
	}
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 값과 세로 값을 입력해주세요.");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("==============");
		System.out.println(a * b);
		System.out.println((a+ b) * 2);
		
		sc.close();
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		
		String str =sc.next();
		char a1 = str.charAt(0);
		char a2 = str.charAt(1);
		char a3 = str.charAt(2);
		System.out.println("첫번째 문자 : " + (a1));
		System.out.println("두번째 문자 : " + (a2));
		System.out.println("세번째 문자 : " + (a3));
		
		sc.close();
		
		}
		
	}
