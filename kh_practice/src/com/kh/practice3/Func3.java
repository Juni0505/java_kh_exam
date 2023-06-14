package com.kh.practice3;

import java.util.Scanner;

public class Func3 {
	public void method1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("인원수를 입력하세요");
		int people = scan.nextInt();
		System.out.println("사탕의 개수를 입력하세요");
		int candy = scan.nextInt();
		
		System.out.println("1인당 사탕개수는 " + (candy / people));
		System.out.println("남은 사탕개수는 " + (candy % people));
		
		scan.close();
	}
}
