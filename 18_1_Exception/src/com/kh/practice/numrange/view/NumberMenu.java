package com.kh.practice.numrange.view;

import java.util.Scanner;

import com.kh.practice.numrange.controller.NumberController;
import com.kh.practice.numrange.exception.NumRangeException;

public class NumberMenu {
	Scanner sc = new Scanner(System.in);
	NumberController nc = new NumberController();
			
	
	public void menu() {
		System.out.println("정수1 : ");
		int num1 = sc.nextInt();
		System.out.println("정수 2: ");
		int num2 = sc.nextInt();
		try {
			System.out.println(num1 + "은(는) "+ num2 + "의 배수인가? "+ nc.checkDouble(num1, num2));
		} catch (NumRangeException e) {
			System.out.println("오류 : " + e.getMessage());
			e.printStackTrace();
		}
	}
}
