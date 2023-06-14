package com.kh.practice.charcheck.view;

import java.util.Scanner;

import com.kh.practice.charcheck.controller.CharacterController;
import com.kh.practice.charcheck.exception.CharCheckException;

public class CharacterMenu {
	public void menu() {
		Scanner scan = new Scanner(System.in);
		CharacterController cc = new CharacterController();
		
		System.out.print("문자열 : ");
		String alpha = scan.nextLine();
		try {
			int count = cc.countAlpha(alpha);
			System.out.println("입력한 문자열의 영문자 개수 : " + count);
		} catch(CharCheckException e ) {
			System.out.println("오류 : " + e.getMessage());
		}
		
		
		scan.close();
		
	}
}
