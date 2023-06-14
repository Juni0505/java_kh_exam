package com.kh.practice3;

import java.util.Scanner;

public class Func7 {
	public void method1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		String str = new String();
		str = scan.nextLine();
		char a = str.charAt(7);
		if(a == '1') {
			System.out.println("남성입니다.");
		} else {
			System.out.println("여성입니다.");
		}
			scan.close();
		}
			
	
		
		}
		
				
		
	

