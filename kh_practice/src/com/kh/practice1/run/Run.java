package com.kh.practice1.run;

import com.kh.practice1.func.VariablePractice1;

public class Run {
	public static void main(String[] args) {
		System.out.println(VariablePractice1.cnt);
		//	객체/인스턴스 vp1을 생성
		VariablePractice1 vp = new VariablePractice1();
		
		
		
		vp.method1();
		vp.method2();
		vp.method3();
		vp.method4();
		
		
		
		
		
		
	//	new VariablePractice1().method1();
	//	new VariablePractice1().method2();
	//	new VariablePractice1().method3();
	//	new VariablePractice1().method4();
	}
	

}
