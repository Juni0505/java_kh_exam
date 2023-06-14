package com.kh.practice.chap02_abstractNinterface;

import com.kh.practice.chap02_abstractNinterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		PhoneController pcr = new PhoneController();
		for(int i = 0; i<2; i++) {
			System.out.println(pcr.method()[i]);
			System.out.println();
		}
	}

}