package com.kh.practice.charcheck.controller;

import com.kh.practice.charcheck.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {
		
	}
	public int countAlpha(String s) throws CharCheckException{
		int count = 0;
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' &&s.charAt(i)<='z')) {
				count++;
			}else if(ch == ' ') {
				throw new CharCheckException("문자열에 공백이 포함되어 있습니다.");
			}
				
		}
		return count;
	}
}	
