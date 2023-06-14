package com.kh.practice1.func;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //	스캐너 가져다가 전원버튼 누름
		//	enter key눌릴때 까지의 데이터를 스캔해줘
		// 1 2 가 나 다 enter
		// scan 은 데이터 "11 22 가가가 나나 다 \n\0"
	/*	String str1 = scan.next();	//	띄어쓰기또는enter 전까지 한덩어리 문자형태로 리턴
		System.out.println(str1);	// 11
		int num1 = scan.nextInt();	//	띄어쓰기또는enter 전까지 한덩어리를 정수로 바꿔서 리턴
		System.out.println(num1);	// 22
		Double num2 = scan.nextDouble();	// 띄어쓰기또는enter 전까지 한덩어리를 실수로 바꿔서 리턴
		System.out.println(num2);	// 33.3
		String str2 = scan.nextLine();	// 줄바꿈까지의 문자형태로 바꿔서 리턴
		System.out.println(str2);	//	가가가 나나 다 \n
	*/
		System.out.println("입력1");
		int num3 = scan.nextInt();
		System.out.println(num3);
		scan.nextLine();	//flush()	//다음입력이 nextLine이게되면 공백을 채워줘야되서 	하나 넣어줘야된
		System.out.println("입력2");		
		String str3 = scan.nextLine();	//불필요한경우 scan.next 만 사용해줘도 된다.
		System.out.println(str3);
		
		System.out.println("끝");
		
		scan.close();
	}

}
