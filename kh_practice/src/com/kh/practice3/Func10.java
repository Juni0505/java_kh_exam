package com.kh.practice3;

import java.util.Scanner;

public class Func10 {
	public void method1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("A사원의 연봉을 입력하세요");
		int i1 = scan.nextInt();
		System.out.println("B사원의 연봉을 입력하세요");
		int i2 = scan.nextInt();
		System.out.println("C사원의 연봉을 입력하세요");
		int i3 = scan.nextInt();
		double e1 = (i1 * 0.4);
		double e2 = i2;
		double e3 = (i3 * 0.15);
		System.out.println("A사원의 연봉/연봉+a = " + i1 + "/" + (i1 + e1) + "만원");
		if(e1 + i1 >= 3000) {
			System.out.println("3000만원 이상");
		} else {
			System.out.println("3000만원 이하");
		}
		System.out.println("B사원의 연봉/연봉+a = " + i2 + "만원/" + e2 + "만원");
		if(e2 >= 3000) {
			System.out.println("3000만원 이상");
		}else {
			System.out.println("3000만원 미만");
		}
		System.out.println("C사원의 연봉/연봉+a = " + i3 + "/" + (i3 + e3) + "만원");
		if(e3 >= 3000) {
		}else {
			System.out.println("3000만원 미만");
		}
		scan.close();
		}
	

}
